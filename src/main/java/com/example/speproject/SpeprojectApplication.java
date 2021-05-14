package com.example.speproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ScopeMetadata;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.Collections;

@SpringBootApplication
public class SpeprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpeprojectApplication.class, args);
	}

//	@Bean
//	public FilterRegistrationBean<CorsFilter> simpleCorsFilter() {
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
// 		config.setAllowCredentials(true);
// // 		config.setAllowedOrigins(Arrays.asList("http://localhost:3000"));
// 		config.setAllowedOrigins(Arrays.asList("http://172.17.0.2:80"));
// // 		config.setAllowedOrigins("*");
// 		config.setAllowedMethods(Collections.singletonList("*"));
// 		config.setAllowedHeaders(Collections.singletonList("*"));
//		source.registerCorsConfiguration("/**", config);
//		FilterRegistrationBean<CorsFilter> bean = new FilterRegistrationBean<>(new CorsFilter(source));
//		bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
//		return bean;
//	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurerAdapter() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**");
			}
		};
	}
	@Bean
	public DataSource getDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
		String url = System.getenv("DATABASE_HOST");
		if(url !=null){
			dataSourceBuilder.url("jdbc:mysql://mysql-db-oldage:3306/oldagemanagement?createDatabaseIfNotExist=true?useSSL=false&allowPublicKeyRetrieval=true&autoReconnect=true&failOverReadOnly=false&maxReconnects=10");
		}else{
			dataSourceBuilder.url("jdbc:mysql://localhost:3306/oldagemanagement?createDatabaseIfNotExist=true");
		}
		dataSourceBuilder.username("oldagemanagement");
		dataSourceBuilder.password("oldAgePass@11");
		return dataSourceBuilder.build();
	}

}
