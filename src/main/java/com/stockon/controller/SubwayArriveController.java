package com.stockon.controller;


import com.stockon.entity.SubwayArrive;
import com.stockon.service.impl.SubwayArriveServiceImplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/subway")
public class SubwayArriveController {

    @Autowired
    private final SubwayArriveServiceImplements subwayArriveServiceImplements;


    public SubwayArriveController(SubwayArriveServiceImplements subwayArriveService){
        this.subwayArriveServiceImplements = subwayArriveService;


    }


    @GetMapping("/realtimeStationArrival/ALL")
    public SubwayArrive getRealtimeArrival(){
        return subwayArriveServiceImplements.getSubwayArrive();
    }

    @DeleteMapping("/delete/{subwayId}")
    public SubwayArrive delete(@PathVariable int subwayId){
        return subwayArriveServiceImplements.deleteSubwayArrive(subwayId);
    }

    }


