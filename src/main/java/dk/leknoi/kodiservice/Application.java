package dk.leknoi.kodiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

//	@Bean
//	public ModelMapper modelMapper() {
//		return new ModelMapper();
//	}

//	@Bean
	//public Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder() {
//	public MappingJacksonHttpMessageConverter jackson2ObjectMapperBuilder() {
//
//		return new MappingJacksonHttpMessageConverter()
//				.propertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE)
//				.featuresToEnable(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)
//				.featuresToEnable(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES)
//				.featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS).modules(new JodaModule())
//				.serializationInclusion(JsonInclude.Include.NON_EMPTY).defaultUseWrapper(false);
//	}
}
