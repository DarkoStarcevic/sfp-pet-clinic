package dare.springframework.sfppetclinic.config;

import org.springframework.boot.actuate.trace.http.HttpTraceRepository;
import org.springframework.boot.actuate.trace.http.InMemoryHttpTraceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    HttpTraceRepository httpTraceRepository(){
        return new InMemoryHttpTraceRepository();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests().anyRequest().permitAll()
                // http.authorizeRequests().antMatchers("/login/cas", "/logout", "/receptor", "/actuator**").permitAll()
                //   .anyRequest().authenticated()
//                .and().exceptionHandling().authenticationEntryPoint(authenticationEntryPoint)
                .and()
                .cors()
                .and()
                .csrf().disable();

    }
}
