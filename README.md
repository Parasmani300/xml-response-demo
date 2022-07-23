# xml-response-demo
xml-request-response-demo

### We use the follwing springboot dependency to achieve the same. spring-data-format-xml 
```
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.dataformat/jackson-dataformat-xml -->
<dependency>
    <groupId>com.fasterxml.jackson.dataformat</groupId>
    <artifactId>jackson-dataformat-xml</artifactId>
    <version>2.13.3</version>
</dependency>
```


    @RequestMapping(value = "/post",method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.TEXT_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
            
    @RequestMapping(value = "/user",method = RequestMethod.GET,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.TEXT_XML_VALUE})
