package com.stockon.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "subwayArrive")
public class SubwayArrive {

    @Transient
    public static final String SEQUENCE_NAME = "members_sequence";

    @Id
    private Long idx;



    private Long subwayId;
    //상하행선 구분
    private String updnLine;
    private String trainLineNm;
    private Integer statnFid;
    private Integer statnTid;
    private Integer statnId;
    private String statnNm;
    private String ordkey;
    private Integer subwayList;
    private Integer StatnList;
    private Integer barvlDt;
    private Integer btrainNo;
    private Integer bstatnId;
    private String bstatnNm;
    private String recptnDt;
    private String arvlMsg2;
    private String arvlMsg3;
    private Integer arvlCd;


}
