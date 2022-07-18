# Swagger-demo

Sample Project to demonstrate the use of the Swagger Documentation tool

## Screenshots

<img src="/src/main/resources/images/DemoPage.png" alt="App screenshot"/>

## Description

Swagger (OpenAPI) is a language-agnostic specification for describing REST APIs.

Swagger provides different tools.

- Editor - Support YAML/JSON structure.
- CodeGen - This helps to generate Client SDKs from YAML/JSON.
- UI - To visualize and interact with the API’s resources without having any of the implementation logic in place.

#### Note:
Swagger doesn't work with MVC controllers. It only works with ApiController for Restful APIs.

### Using Swagger

- Building the Swagger UI by using Editor is challenging and Skillful, as it needs knowledge on syntax understandable by Swagger.
- Another approach is by using spring dependencies to generate the Swagger UI for us.

### Features

- Visualize the APIs
- Play around similar to POST man.
- Client SDK generation using the Structured YAML/JSON

## Documentation

It is a basic Spring boot REST project. Built for CRUD operations on CART.
It is a Maven project.

#### Dependencies used:

To configure Swagger in other applications the following are required.

```
### Dependencies:
- JAVA (version >8)
- Spring boot starter
- H2 (In-memory Database)
- JDBC (DB connection)
- Spring web starter
- springdoc-openapi-ui (v1.6.9)

### OpenAPIConfig.java
```
## Installation



Clone the Swagger demo project to your local machine.

```bash
  Import to Eclipse/IntelliJ as a Maven project.
  It will add the Required JARS automatically.
```
   
It uses an in-memory h2 database.

```bash
  Use DB credentials and URL mentioned in the application.properties
  http://localhost:8080/h2-console/
```

Swagger-generated JSON location

```bash  
  http://localhost:8080/api-docs/
```

Swagger UI location
```bash  
  http://localhost:8080/test/swagger-ui/index.html
```

Customized Swagger UI location
```bash  
  http://localhost:8080/swagger/index.html
```


## Using in Existing application (JAVA):

Add the Spring doc dependency to your application. That's all it will automatically generate documentation and UI in the following locations.

(URLS might change based on the customizations)

JSON - http://localhost:8080/v3/api-docs/

UI - http://localhost:8080/swagger-ui.html

### Note: 
For WebMVC projects, Need to make some more change

```
Replace "WebConfig extends WebMvcConfigurationSupport" with "WebConfig implements WebMvcConfigurer"
Add @EnableWebMvc annotation to the WebConfig java class.
```

## Customization:
- To make Endpoint as open

```
In Websecurityconfig, added following to make end points accessible.

.antMatchers("/api-docs/*").permitAll()
.antMatchers("/swagger-ui/*").permitAll()
```

- Documentation UI should be customized.

```
Created a new Class - OpenAPIConfig.java

@Configuration
public class OpenAPIConfig {

	@Bean
	public OpenAPI config() {
		return new OpenAPI().info(
				new Info().title("eConsent REST API").description("OpenApi Documentation for eConsent").version("v2022R2")
		);
	}

}
```

- To make the Server URL use https instead of HTTP.

```
Added the following to your application. I added it in OpenAPIConfig.java
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL") })
```

- Added properties to make the Documentation configurable.

```
Add these property or yaml file.

# Spring Doc Properties
springdoc:
  swagger-ui:
    enabled: true
    operations-sorter: alpha    
    disable-swagger-default-url: true
    config-url: /api-docs/swagger-config
    path: /swagger-ui.html
    url: /api-docs/
  api-docs:
    enabled: true
    path: /api-docs 
```
- To Remove the Header bar of Swagger, add the following property.

```
springdoc:
  swagger-ui:
    layout: BaseLayout
```

- To Add custom header / do html changes

#### For MVC project

```
 - Create a new JSP/html (customize here)
 - New Controller for that end point
 - Make X-Frame-options are set to "SAMEORIGIN"
```

#### For REST project

```
 - Create a new html in the following path 
    "/src/main/resources/static/swagger/index.html"
 - Customize here.

```
All the above customizations are covered in the Above project except MVC.

Go through the source code.


## Troubleshooting

Based on the project(Different frameworks) we wanted to integrate this tool might get different issues.
- Check the compatibility of the tool with your App in the official documentation.
- Use the Reference links for further info.

## Reference Links

- https://swagger.io/
- https://www.baeldung.com/spring-rest-openapi-documentation 
- https://springdoc.org/#how-can-i-configure-swagger-ui  - Documentation
- https://github.com/springdoc/springdoc-openapi/issues/361 
- https://github.com/eugenp/tutorials/tree/master/spring-boot-modules/spring-boot-springdoc

## Authors

- John Kiran
