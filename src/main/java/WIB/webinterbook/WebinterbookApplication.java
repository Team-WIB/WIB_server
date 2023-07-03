package WIB.webinterbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class WebinterbookApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(WebinterbookApplication.class);
        application.addListeners(new ApplicationPidFileWriter());
        application.run(args);
    }

}
