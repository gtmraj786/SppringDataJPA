package springdatajpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("springdatajpa")
public class WebMvcConfig
{    @Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver()
    {
        InternalResourceViewResolver mv=new InternalResourceViewResolver();
         mv.setPrefix("/WEB-INF/views/");
         mv.setSuffix(".jsp");
         return mv;

    }
}
