package pl.coderslab.tweeter.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("test1").password("pass1").roles("USER")
                .and()
                .withUser("test2").password("pass2").roles("USER")
                .and()
                .withUser("test3").password("pass3").roles("USER");
    }

//    @Override
//    public void configure(WebSecurity web) throws Exception {
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests() //rzadania wymagaja autoryzaji
            .antMatchers("/login").anonymous() // na str log moga wchodzi niezalogowani
            .antMatchers("/register").anonymous()
                .anyRequest().authenticated()
                .and()
                .httpBasic()
                .and()
                .csrf().disable()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/login");
    }
}
