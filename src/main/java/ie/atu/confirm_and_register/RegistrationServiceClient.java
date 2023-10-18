package ie.atu.confirm_and_register;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "registration-service", url = "http://localhost:8081")
public interface RegistrationServiceClient {
   @PostMapping("/confirm")
    String inputtedDetails(@RequestBody UserDetails userDetails);
}
