package co.develhope.deploy_environments1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @Autowired
    private final CustomProperties customProperties;

    public BasicController(CustomProperties customProperties) {
        this.customProperties = customProperties;
    }

    @GetMapping("/")
    public String getGreeting() {
        return "Hello, " + customProperties.getDevName() + "! Your auth code is " + customProperties.getAuthCode() + ".";
    }
}