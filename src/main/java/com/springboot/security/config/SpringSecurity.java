package com.springboot.security.config;

import java.net.http.HttpRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CsrfAuthenticationStrategy;

@Configuration
@EnableWebSecurity
public class SpringSecurity {

	@Autowired
	public CustomAuthSucessHandler sucessHandler;

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService geDetailsService() {
		return new CustomUserDetailsService();
	}

	@Bean
	public DaoAuthenticationProvider gAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
		daoAuthenticationProvider.setUserDetailsService(geDetailsService());
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

		http.csrf().disable().authorizeHttpRequests().requestMatchers("/user/**").hasRole("USER")
				.requestMatchers("/admin/**").hasRole("ADMIN").requestMatchers("/**").permitAll().and().formLogin()
				.loginPage("/sign").loginProcessingUrl("/userLogin").successHandler(sucessHandler).and()
				.logout(logout -> logout.logoutUrl("/logout") // URL to trigger logout
						.logoutSuccessUrl("/signin?logout") // Redirect after successful logout
						.permitAll());
		                 return http.build();

	}

//	  http.csrf().disable().authorizeHttpRequests().requestMatchers("/","/signin",
//	  "/register","/saveUser", "/css/**", "/js/**",
//	  "/images/**").permitAll().requestMatchers("/user/**"). authenticated().and().
//	  formLogin().loginPage("/signin").loginProcessingUrl("/userLogin").
//	  defaultSuccessUrl("/user/profile", true).permitAll(); return http.build(); }

	// Keep CSRF enabled (remove .csrf().disable())

// Both Code is working now

	/*
	 * @Bean public SecurityFilterChain securityFilterChain(HttpSecurity
	 * httpSecurity) throws Exception { httpSecurity .csrf().disable()
	 * .authorizeHttpRequests(auth -> auth .requestMatchers("/", "/signin",
	 * "/register", "/saveUser", "/css/**", "/js/**", "/images/**").permitAll()
	 * .requestMatchers("/user/**").authenticated() ) .formLogin(form -> form
	 * .loginPage("/signin") .loginProcessingUrl("/userLogin")
	 * .defaultSuccessUrl("/user/profile", true) .permitAll() ) .logout(logout ->
	 * logout .logoutUrl("/logout") // URL to trigger logout
	 * .logoutSuccessUrl("/signin?logout") // Redirect after successful logout
	 * .permitAll() ); return httpSecurity.build(); }
	 */

}
