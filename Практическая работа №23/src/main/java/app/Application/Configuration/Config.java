package app.Application.Configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableAspectJAutoProxy
@EnableJpaRepositories(basePackages = {"app.Application"})
@EnableAsync
public class Config extends WebSecurityConfigurerAdapter {
}