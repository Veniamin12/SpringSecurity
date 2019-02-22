package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurityController {
    @RequestMapping("/")
    public String Hello() {
        return "Hello world";
    }
    @RequestMapping("/notprotected")
    public String HelloAgain() {
        return "Hello world from nonprotectedpage";
    }
    @RequestMapping("/protectedbyuserrole")
    public String HelloUser() {
        return "Hello world from protected by user role";
    }
    @RequestMapping("/protectedbyAdminRole")
    public String HelloAdmin() {
        return "Hello world from protected by admin role";
    }
}
