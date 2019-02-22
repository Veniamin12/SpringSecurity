package Starter;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan({"Starter", "Controller"})
@Import({SecurityConfig.class})
public class SpringSecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }
}
