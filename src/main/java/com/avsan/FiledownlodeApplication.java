package com.avsan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.avsan.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class FiledownlodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiledownlodeApplication.class, args);
	}
}
