/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.vutura.p21.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;



public class DataSourceHelper {

    private static final Logger logger = LoggerFactory.getLogger(DataSourceHelper.class);

    private final String GENERIC_COUNT_SQL = "select count(*) from %s";

    public static DataSource build(String jdbcUrl, String jdbcUser, String jdbcPassword) throws java.sql.SQLException {

        DataSource ds = null;

        HikariConfig cfg = new HikariConfig();

        cfg.setJdbcUrl(jdbcUrl);
        cfg.setUsername(jdbcUser);
        cfg.setPassword(jdbcPassword);

        try {
            ds = new HikariDataSource(cfg);
        } catch (Exception ex) {
            logger.info("DataSourceBuilder Error : " + ex.getClass().getCanonicalName());
        }

        return ds;

    }

    private boolean databaseVerified(JdbcTemplate jdbc, String... tables) {

        boolean verified = jdbc != null;

        if (jdbc == null) {
            return verified;
        }

        for (String table : tables) {

            String sql = String.format(GENERIC_COUNT_SQL, table);

            try {
                jdbc.queryForObject(sql, Integer.class);
            } catch (DataAccessException ex) {
                logger.info(String.format("databaseVerified : error = %s", ex.getClass().getCanonicalName()));
                verified = false;
            }

            if (!verified) break;

        }

        return verified;

    }

}
