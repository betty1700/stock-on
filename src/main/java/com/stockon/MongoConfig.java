package com.stockon;


import com.mongodb.MongoClientSettings;
import com.mongodb.connection.ConnectionPoolSettings;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.context.annotation.Bean;


import java.util.concurrent.TimeUnit;

@EnableAutoConfiguration(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class MongoConfig {

    @Bean
    public MongoClientSettings mongoClientSettings(){

        ConnectionPoolSettings settings = ConnectionPoolSettings.builder().maxConnectionIdleTime(1000 * 60 * 60, TimeUnit.MILLISECONDS).build();

        return MongoClientSettings.builder().applyToConnectionPoolSettings(builder -> builder.applySettings(settings)).build();
    }

}
