package poc.auth2.Auth2Poc.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//("/hello")
public class MyRestController {
	
	//@GetMapping("sayhello")
	public String sayHello() {
		System.out.println("sayHello");
		return "Hello There";
	}
	@GetMapping("user")
    public Principal getUser(Principal user) {
		System.out.println("Get user");
        return user;
    }
}
