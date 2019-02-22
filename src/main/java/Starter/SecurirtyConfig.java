package Starter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurirtyConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configurerglobal(AuthenticationManagerBuilder auth) throws java.lang.Exception {
      auth.inMemoryAuthentication()
      .withUser("devuser").password("{noop}dev").authorities("ROLE_USER")
       .and()
       .withUser("adminuser").password("{noop}admin").authorities("ROLE_USER","ROLE_ADMIN");
    }
    //@Authorization
    @Override
    protected void configure(HttpSecurity http) throws  java.lang.Exception {
        http
                .authorizeRequests()
                .antMatchers("/protectedbyuserrole*").hasRole("USER")
                .antMatchers("/protectedbyAdminRole*").hasRole(("Admin"))
                .antMatchers("/nonprotected*").permitAll()
                .and()
                .httpBasic();
    }
}
