package com.stockon;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.stockon.entity.SubwayArrive;
import com.stockon.repo.SubwayArriveRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import java.io.IOException;

@EnableScheduling
@SpringBootApplication
@EnableMongoRepositories

public class BackApplication {



    public static void main(String[] args) throws IOException {

        SpringApplication.run(BackApplication.class, args);
    }


    }

