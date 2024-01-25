package dev.tau.restclientsamples;

import dev.tau.restclientsamples.post.Post;
import dev.tau.restclientsamples.post.PostService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class RestClientSamplesApplication {

	public static void main(String[] args) {
		System.setProperty("jdk.httpclient.HttpClient.log", "all");
		SpringApplication.run(RestClientSamplesApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostService postService) {
		return args -> {
			List<Post> posts = postService.findAll();
			posts.forEach(System.out::println);
		};
	}
}
