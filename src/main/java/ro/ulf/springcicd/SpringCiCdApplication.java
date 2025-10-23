package ro.ulf.springcicd;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringCiCdApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCiCdApplication.class, args);
    }

    @PostConstruct
    private void postConstruct() {
        log.info("Application started !!!");
    }
}
