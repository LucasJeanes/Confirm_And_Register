package ie.atu.confirm_and_register;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "listening-service", url = "${feign.url}")
public interface RegistrationServiceClient {
   @PostMapping("/confirmationMessage")
    String inputtedDetails(@RequestBody UserDetails userDetails);
}
