package com.stockon.repo;

import com.stockon.entity.SubwayArrive;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@EnableMongoRepositories
public interface SubwayArriveRepo extends MongoRepository<SubwayArrive, Long> {
}
