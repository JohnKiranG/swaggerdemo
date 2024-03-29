//package com.example.demo;
//
//import java.util.ArrayList;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.oas.annotations.EnableOpenApi;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//
//@Configuration
//@EnableWebMvc
//@EnableOpenApi
////@ComponentScan(basePackageClasses = {
////		HelloWorldController.class
////})
//public class SwaggerConfig 
//extends WebMvcConfigurerAdapter
//{
//
//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
////				.apis(RequestHandlerSelectors.any())
////				.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
//                .apis(RequestHandlerSelectors.withClassAnnotation(ShowAPI.class))
//				.paths(PathSelectors.any()).build()
//				.apiInfo(metaInfo());
//	}
//
//	private ApiInfo metaInfo() {
//		ApiInfo apiInfo = new ApiInfo("Swagger Demo API REST", "A basic demo project.", "1.0", null, null, null, null, new ArrayList<>());
//		return apiInfo;
//	}
//
//	 @Override
//	 public void addViewControllers(ViewControllerRegistry registry) {
//	 registry.addRedirectViewController("/api/v2/api-docs", "/v2/api-docs");
//	 registry.addRedirectViewController("/api/swagger-resources/configuration/ui",
//	 "/swagger-resources/configuration/ui");
//	 registry.addRedirectViewController("/api/swagger-resources/configuration/security",
//	 "/swagger-resources/configuration/security");
//	 registry.addRedirectViewController("/api/swagger-resources",
//	 "/swagger-resources");
//	 }
//	
//	 @Override
//	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
//	 registry.addResourceHandler("/api/swagger-ui.html**").addResourceLocations("classpath:/META-INF/resources/swagger-ui.html");
//	 registry.addResourceHandler("/api/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//	 }
//}
