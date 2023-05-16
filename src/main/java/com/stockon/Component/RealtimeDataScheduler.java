package com.stockon.Component;

import com.stockon.entity.SubwayArrive;
import com.stockon.repo.SubwayArriveRepo;
import com.stockon.service.impl.SubwayArriveServiceImplements;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class RealtimeDataScheduler {
    private final SubwayArriveServiceImplements subwayArriveServiceImplements;
    private final SubwayArriveRepo subwayArriveRepo;

    public RealtimeDataScheduler(SubwayArriveServiceImplements subwayArriveServiceImplements, SubwayArriveRepo subwayArriveRepo) {
        this.subwayArriveServiceImplements = subwayArriveServiceImplements;
        this.subwayArriveRepo = subwayArriveRepo;
    }

    @Scheduled(fixedDelay = 1000 * 20)
    public void saveDataToMongoDB(){

        SubwayArrive subwayArrive = subwayArriveServiceImplements.getSubwayArrive();

        System.out.println(subwayArriveServiceImplements.getSubwayArrive());

        subwayArriveRepo.save(subwayArrive);

    }

}
