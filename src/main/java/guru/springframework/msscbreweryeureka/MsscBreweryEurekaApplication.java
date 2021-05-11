package guru.springframework.msscbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Profile;

@Profile("local-discovery")
@EnableEurekaServer
@SpringBootApplication
public class MsscBreweryEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsscBreweryEurekaApplication.class, args);
    }

}
