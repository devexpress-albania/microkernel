package com.microkernel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pluginone.EnablePluginOne;
//import plugintwo.EnablePluginTwo;

@SpringBootApplication
@EnablePluginOne
//@EnablePluginTwo
public class MicrokernelApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicrokernelApplication.class, args);
	}

}
