package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.io.File;

@SpringBootApplication
public class GiftMakerItApplication {
    @Value("${multipart.location}/gif/")
    private String gifLocation;

    public static void main(String[] args) {
        SpringApplication.run(GiftMakerItApplication.class);
    }

    @PostConstruct
    private void init(){
        File gifFolder = new File(gifLocation);
        if (!gifFolder.exists()) {
                gifFolder.mkdir();
        }

    }


}
