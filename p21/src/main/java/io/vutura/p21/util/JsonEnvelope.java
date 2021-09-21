/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vutura.p21.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ahmad R. Djarkasih
 */
public class JsonEnvelope {

    private static final Logger LOG = Logger.getLogger(JsonEnvelope.class.getName());

    public static Map<String, Object> encloseErrorData(int httpCode, String message) {

        Map<String, Object> envelope = new LinkedHashMap();

        envelope.put("message", message);
        envelope.put("code", httpCode);

        return envelope;

    }

    public static Map<String, Object> encloseErrorData(int httpCode, String exceptionName, Map<String, String> errors) {

        Map<String, Object> envelope = new LinkedHashMap();

        errors.put("exception", exceptionName);

        envelope.put("code", httpCode);
        envelope.put("errors", errors);

        return envelope;

    }


    public static Map<String, Object> encloseMessage(int httpCode, String message) {

        Map<String, Object> envelope = new LinkedHashMap();

        envelope.put("message", message);
        envelope.put("code", httpCode);

        return envelope;

    }

    public static Map<String, Object> encloseSingleData(int httpCode, Object data) {

        Map<String, Object> envelope = new LinkedHashMap();

        envelope.put("code", httpCode);
        envelope.put("data", data);

        LOG.log(Level.INFO, "envelope = {0}", envelope.toString());
        return envelope;

    }
}
