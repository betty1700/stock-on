package com.stockon.repo;

import com.stockon.entity.SubwayArrive;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;



@EnableMongoRepositories

public interface SubwayArriveRepo extends MongoRepository<SubwayArrive, String> {

}
