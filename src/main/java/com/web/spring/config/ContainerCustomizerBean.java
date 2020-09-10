package com.web.spring.config;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;
@Component
public class ContainerCustomizerBean  implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>{
	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		factory.setContextPath("/springapp");
		factory.setPort(8086);
		
	}

}
