package com.stockon.service.impl;

import com.stockon.entity.SubwayArrive;
import com.stockon.service.SubwayArriveService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class SubwayArriveServiceImplements implements SubwayArriveService{

        private List<SubwayArrive> list;


        @Value("${subway.openApi.realtimeArrival.uri}")
        private String apiUrl;
        @Value("${subway.openApi.apiKey}")
        private String apikey;

        @Override
        public void init(String str) {
                try{
                        //json 객체 생성
                        JSONObject jObj;
                        //json 파싱객체 생성
                        JSONParser jsonParser = new JSONParser();
                        //파싱할 String (OpenApiController에서 호출된 String result값)을 json객체로 파서를통해 저장.
                        JSONObject jsonObj=(JSONObject) jsonParser.parse(str);

                        //데이터 분해 단계

                        //response 받아옴
                        JSONObject parseResponse = (JSONObject) jsonObj.get("errorMessage");
                        //parseResponse에는 errorMessage내부의 json데이터들이 들어있음.

                        //realtimeArrivalList 데이터는 List의형태이기에 json배열로 받아옴.
                        JSONArray array = (JSONArray) jsonObj.get("realtimeArrivalList");

                        List<SubwayArrive> subwayArriveList = new ArrayList<>();
                        for (int i = 0; i < array.size(); i++) {
                                jObj = (JSONObject) array.get(i);

                                SubwayArrive subwayArrive1 = SubwayArrive.builder()
                                        .subwayId(getStringValue(jObj, "subwayId"))
                                        .updnLine(getStringValue(jObj, "updnLine"))
                                        .trainLineNm(getStringValue(jObj, "trainLineNm"))
                                        .statnFid(getStringValue(jObj, "statnFid"))
                                        .statnTid(getStringValue(jObj, "statnTid"))
                                        .statnId(getStringValue(jObj, "statnId"))
                                        .statnNm(getStringValue(jObj, "statnNm"))
                                        .trnsitCo(getStringValue(jObj, "trnsitCo"))
                                        .ordkey(getStringValue(jObj, "ordkey"))
                                        .subwayList(getStringValue(jObj, "subwayList"))
                                        .statnList(getStringValue(jObj, "statnList"))
                                        .btrainSttus(getStringValue(jObj, "btrainSttus"))
                                        .barvlDt(getStringValue(jObj, "barvlDt"))
                                        .btrainNo(getStringValue(jObj, "btrainNo"))
                                        .bstatnId(getStringValue(jObj, "bstatnId"))
                                        .bstatnNm(getStringValue(jObj, "bstatnNm"))
                                        .recptnDt(getStringValue(jObj, "recptnDt"))
                                        .arvlMsg2(getStringValue(jObj, "arvlMsg2"))
                                        .arvlMsg3(getStringValue(jObj, "arvlMsg3"))
                                        .arvlCd(getStringValue(jObj, "arvlCd"))
                                        .build();

                                subwayArriveList.add(subwayArrive1);
                                }


                        this.list = subwayArriveList;
                        for (int i = 0; i < subwayArriveList.size(); i++) {
                                System.out.println(subwayArriveList.get(i));
                        }
                } catch (ParseException e) {
                        throw new RuntimeException(e);
                }


        }

        @Override
        public List<SubwayArrive> getList(){
                return this.list;
        }


        //null 예외처리
        private String getStringValue(JSONObject jsonObject, String key){
                Object value = jsonObject.get(key);
                if(value != null){
                        return value.toString();
                }else{
                        return "null";
                }
        }

}

