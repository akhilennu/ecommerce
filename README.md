# Added features

## 1. Spring Validation (User Resource, UserDTO)
@Valid to check if the input is valid (added in resource input validation)
<br />
@Size, @NotBlank @Email etc., for adding validations

## 2. springdoc-openapi (Swagger UI) (Introduced in May 2024)
### Add the below snippet in pom.xml
```
<dependency> 
  <groupId>org.springdoc</groupId> 
  <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId> 
  <version>2.6.0</version> 
</dependency>
```
### Add the below snippet in application.properties
```
springdoc.packagesToScan=com.example.demo
springdoc.pathsToMatch=/api/**
springdoc.swagger-ui.path=/swagger-ui.html
```

