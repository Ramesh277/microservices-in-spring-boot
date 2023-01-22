package com.micro_user;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.micro_user.external.RatingService;
import com.micro_user.model.Rating;
import com.micro_user.model.Rating.RatingBuilder;
import com.netflix.servo.util.VisibleForTesting;



@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class MicrouserApplication {

//	@Autowired
//	private RatingService ratingService;
//	
//	@Test
//	void createdRating() {
//		Rating rate = Rating.builder().rating(20).userId("")
//				.hotelId("").feedback("This is only for testing purposes");
//	}

	public static void main(String[] args) {
		SpringApplication.run(MicrouserApplication.class, args);
		
		
		
		
	}
	

	

}
