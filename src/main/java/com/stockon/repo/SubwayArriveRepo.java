package com.stockon.repo;

import com.stockon.entity.SubwayArrive;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SubwayArriveRepo extends MongoRepository<SubwayArrive, String> {

}
