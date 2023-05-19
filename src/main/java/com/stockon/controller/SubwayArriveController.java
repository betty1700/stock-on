package com.stockon.controller;



import com.stockon.entity.SubwayArrive;
import com.stockon.repo.SubwayArriveRepo;
import com.stockon.service.SubwayArriveService;
import com.stockon.service.impl.SubwayArriveServiceImplements;
import lombok.SneakyThrows;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api")
public class SubwayArriveController {
    private OpenApiController openApiController;



    @GetMapping("/show")
    public String showSubway() throws IOException {
        OpenApiController openApiController1 = new OpenApiController();
        this.openApiController = openApiController1;
        return openApiController1.getOpenApiDocument();
    }

    @SneakyThrows
    @GetMapping("/save")
    public void saveSubway() {
        SubwayArriveService subwayArriveService = new SubwayArriveServiceImplements();

        subwayArriveService.init(openApiController.getOpenApiDocument());
    }



}