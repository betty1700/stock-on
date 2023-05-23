package com.stockon.controller;



import com.stockon.entity.SubwayArrive;
import com.stockon.repo.SubwayArriveRepo;
import com.stockon.service.SubwayArriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class SubwayArriveController {

    private OpenApiController openApiController;


    private final SubwayArriveRepo subwayArriveRepo;

    @Autowired
    public SubwayArriveController(SubwayArriveRepo subwayArriveRepo){
        this.subwayArriveRepo = subwayArriveRepo;
    }

    @Autowired
    private SubwayArriveService subwayArriveService;


    @GetMapping("/show")
    public String showSubway() throws IOException {
        OpenApiController openApiController1 = new OpenApiController();
        this.openApiController = openApiController1;
        return this.openApiController.getOpenApiDocument();
    }


    @PostMapping ("/save")
    public String saveSubway() throws IOException {
        subwayArriveService.init(this.openApiController.getOpenApiDocument());

        for(SubwayArrive subwayArrive : subwayArriveService.getList()){
            subwayArriveRepo.save(subwayArrive);
        }


        return "save successfully";
    }



}