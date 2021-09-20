/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vutura.p21.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StartupRunner implements CommandLineRunner {

    private final Logger LOG = LoggerFactory.getLogger(StartupRunner.class);

    @Override
    public void run(String... args) throws Exception {


    }

}
