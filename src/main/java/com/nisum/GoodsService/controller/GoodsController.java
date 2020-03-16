package com.nisum.GoodsService.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nisum.GoodsService.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GoodsController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/getGoodsDetails/{goodsName}", method = RequestMethod.GET)
    public String getStudents(@PathVariable String goodsName) {
        System.out.println("Getting School details for " + goodsName);
        String body = restTemplate.exchange("http://localhost:8081/getitemsdetailsforgood/{goodsName}", HttpMethod.GET, null, new ParameterizedTypeReference<String>() {
        }, goodsName).getBody();

        System.out.println("Response Received as " + body );

        return "School Name -  " + goodsName + " \n Student Details " + body;
    }
}
