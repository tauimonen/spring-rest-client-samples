# Repository for experiments with Spring Framework's RestClient.

Spring Framework 6.1 introduced the RestClient, a new synchronous HTTP client. RestClient offers the API of WebClient with the infrastructure of RestTemplate.

>To execute the HTTP request, RestClient uses a client HTTP library. These libraries are adapted via the ClientRequestFactory interface. Various implementations are available:
>- JdkClientHttpRequestFactory for Java’s HttpClient,
>- HttpComponentsClientHttpRequestFactory for use with Apache HTTP Components HttpClient,
>- JettyClientHttpRequestFactory for Jetty’s HttpClient,
>- ReactorNettyClientRequestFactory for Reactor Netty’s HttpClient,
>- SimpleClientHttpRequestFactory as a simple default.
>
>If no request factory is specified when the RestClient was built, it will use the Apache or Jetty HttpClient if they are available on the classpath. Otherwise, if the java.net.http module is loaded, it will use Java’s HttpClient. Finally, it will resort to the simple default.
>
> [Client Request Factories - Spring Framework Documentation](https://docs.spring.io/spring-framework/reference/integration/rest-clients.html#rest-request-factories)
