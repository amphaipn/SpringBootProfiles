package Profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by A on 3/29/2017.
 */
@Configuration
public class ApplicationConfiguration {
    @Bean
    @Profile("prod")
    public Message message(@Value("${my.messageValue}") String messageValue) {
        Message message = new Message();
        message.setMessageValue(messageValue);
        return message;
    }
    @Bean
    @Profile("dev")
    public Message messageDev() {
        Message message = new Message();
        message.setMessageValue("This's the dev method");
        return message;
    }
}
