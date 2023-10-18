package ie.atu.confirm_and_register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final RegistrationServiceClient registrationServiceClient;

    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient) {
        this.registrationServiceClient = registrationServiceClient;
    }

    @PostMapping("/confirm-and-register")
    public String confirmAndRegister(@RequestBody UserDetails userDetails) {
        String confirm = registrationServiceClient.inputtedDetails(userDetails);
        //confirm = String.format("%s.\nThank you %s, your registration is complete.", confirm, userDetails.getName());
        return confirm;
    }
}