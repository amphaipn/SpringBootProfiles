package Profiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by A on 3/29/2017.
 */
@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class Application {
    @Autowired
    private Message message;

    @RequestMapping("/")
    public String home() {
        return "Welcome to spring boot"+message.getMessageValue();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
