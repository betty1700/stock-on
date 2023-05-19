package com.stockon.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "subwayArrive")
@Builder
public class SubwayArrive {

    @JsonProperty("subwayId")
    private String subwayId;
    //상하행선 구분
    @JsonProperty("updnLine")
    private String updnLine;
    @JsonProperty("trainLineNm")
    private String trainLineNm;
    @JsonProperty("statnFid")
    private String statnFid;
    @JsonProperty("statnTid")
    private String statnTid;
    @JsonProperty("statnId")
    private String statnId;
    @JsonProperty("statnNm")
    private String statnNm;
    @JsonProperty("transiCo")
    private String trnsitCo;
    @JsonProperty("ordkey")
    private String ordkey;
    @JsonProperty("subwayList")
    private String subwayList;
    @JsonProperty("statnList")
    private String statnList;
    @JsonProperty("btrainSttus")
    private String btrainSttus;
    @JsonProperty("barvlDt")
    private String barvlDt;
    @JsonProperty("btrainNo")
    private String btrainNo;
    @JsonProperty("bstatnId")
    private String bstatnId;
    @JsonProperty("bstatnNm")
    private String bstatnNm;
    @JsonProperty("recptnDt")
    private String recptnDt;
    @JsonProperty("arvlMsg2")
    private String arvlMsg2;
    @JsonProperty("arvlMsg3")
    private String arvlMsg3;
    @JsonProperty("arvlCd")
    private String arvlCd;

    @Override
    public String toString() {
        return "{" +
                "subwayId=" + subwayId +
                ", updnLine=" + updnLine +
                ", trainLineNm=" + trainLineNm +
                ", statnFid=" + statnFid +
                ", statnTid=" + statnTid +
                ", statnId=" + statnId +
                ", statnNm=" + statnNm +
                ", trnsitCo=" + trnsitCo +
                ", ordkey=" + ordkey +
                ", subwayList=" + subwayList +
                ", statnList=" + statnList +
                ", btrainSttus=" + btrainSttus +
                ", barvlDt=" + barvlDt +
                ", btrainNo=" + btrainNo +
                ", bstatnId=" + bstatnId +
                ", bstatnNm=" + bstatnNm +
                ", recptnDt=" + recptnDt +
                ", arvlMsg2=" + arvlMsg2 +
                ", arvlMsg3=" + arvlMsg3 +
                ", arvlCd=" + arvlCd +
                "}";
    }
}
