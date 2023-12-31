package ie.atu.confirm_and_register;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ConfirmAndRegisterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfirmAndRegisterApplication.class, args);
    }

}
