package thinking.in.spring.boot.firstappbygui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;


//@SpringBootApplication(scanBasePackages = "thingking.in.spring.boot.config") // same as @Configuration @EnableAutoConfiguration @ComponentScan
@SpringBootApplication
public class AppByGuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppByGuiApplication.class, args);
	}

	/*@Bean
	public RouterFunction<ServerResponse> helloWorld() {
		return route(GET("/hello-world"),
				request -> ok().body(Mono.just("Hello, World"), String.class)
		);
	}*/

}
