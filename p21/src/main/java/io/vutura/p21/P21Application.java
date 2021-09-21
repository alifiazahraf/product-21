package io.vutura.p21;

import io.vutura.p21.configs.AppConfigs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
@EnableConfigurationProperties(AppConfigs.class)
public class P21Application {

    public static void main(String[] args) {
        SpringApplication.run(P21Application.class, args);
    }

}
