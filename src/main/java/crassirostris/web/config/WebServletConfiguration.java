package crassirostris.web.config;

import com.github.jknack.handlebars.springmvc.HandlebarsViewResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by crassirostris on 15. 1. 31..
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan("com.crassirostris.testmvc")
public class WebServletConfiguration {

    @Bean
    public HandlebarsViewResolver handlebarsViewResolver() {
        HandlebarsViewResolver viewResolver = new HandlebarsViewResolver();
        viewResolver.setOrder(1);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".hbs");
        return viewResolver;
    }


    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebServletConfiguration.class, args);
    }

}
