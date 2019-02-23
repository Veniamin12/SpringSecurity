package Starter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncodePassword {
    public static void main(String[] args) {
        String password = "dev";
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String hashedPassword = ((BCryptPasswordEncoder) passwordEncoder).encode(password);

        System.out.println(hashedPassword);
         password="admin";
         hashedPassword =((BCryptPasswordEncoder) passwordEncoder).encode(password);
         System.out.println( hashedPassword);


    }
}
