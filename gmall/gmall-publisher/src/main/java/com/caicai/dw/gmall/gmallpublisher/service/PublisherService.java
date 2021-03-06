package com.caicai.dw.gmall.gmallpublisher.service;

import java.io.IOException;
import java.util.Map;

public interface PublisherService {
    // 获取日活的接口
    Long getDau(String date);



    /*
        hour: 10点  count: 100
        hour: 11点 count: 110
        hour: 12点 count: 120
        ...

        每行用 Map
        多行用List把每行封装起来

        List<Map> => Map<String, Long>

        10点 :100
        11点 : 110
        12点 :120
     */

    Map<String, Long> getHourDau(String date);

    // 获取销售额的总和
    Double getTotalAmount(String date);
    // 获取每小时的销售额明细
    Map<String, Double> getHourAmount(String date);
    // Map  "total"-> 1000,  "detail"-> 详细记录  "agg"-> Map("F"->100,"M"->100)
    Map<String, Object> getSaleDetailAndAggregationByField(String date,
                                                           String keyword,
                                                           String field,
                                                           int size,
                                                           int page,
                                                           int countPerPage) throws IOException;




}
