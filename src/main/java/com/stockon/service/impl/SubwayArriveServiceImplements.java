package com.stockon.service.impl;

import com.stockon.entity.SubwayArrive;
import com.stockon.repo.SubwayArriveRepo;
import com.stockon.service.SubwayArriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;


@Service
public class SubwayArriveServiceImplements implements SubwayArriveService {

    private final String apiUrl = "http://swopenAPI.seoul.go.kr/api/subway/{apiKey}/json/realtimeStationArrival/ALL";
    private final String apikey = "4974615957726c6135336e43515952";

    @Autowired
    private SubwayArriveRepo subwayArriveRepo;


    public SubwayArrive getSubwayArrive(){
        RestTemplate restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
        jsonConverter.setSupportedMediaTypes(Collections.singletonList(org.springframework.http.MediaType.APPLICATION_JSON));
        restTemplate.setMessageConverters(Collections.<HttpMessageConverter<?>>singletonList(jsonConverter));
        return restTemplate.getForObject(apiUrl, SubwayArrive.class, apikey);
    }


    @Override
    public SubwayArrive deleteSubwayArrive(int id) {
        SubwayArrive subwayArrive = subwayArriveRepo.findById((long) id).get();
        subwayArriveRepo.delete(subwayArrive);
        return subwayArrive;
    }

}
