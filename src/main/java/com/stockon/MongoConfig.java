package com.stockon;


import com.mongodb.MongoClientSettings;
import com.mongodb.connection.ConnectionPoolSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class MongoConfig {

    @Bean
    public MongoClientSettings mongoClientSettings(){

        ConnectionPoolSettings settings = ConnectionPoolSettings.builder().maxConnectionIdleTime(1000 * 60 * 60, TimeUnit.MILLISECONDS).build();

        return MongoClientSettings.builder().applyToConnectionPoolSettings(builder -> builder.applySettings(settings)).build();
    }

}
