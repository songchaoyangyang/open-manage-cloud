package com.open.managegateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
@RestController
public class FallbackController {

    @RequestMapping("fallback/{name}")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> systemFallback(@PathVariable String name) {
        Map<String,String> resultMap = new HashMap<>();
        resultMap.put("message","访问%s超时或者服务不可用"+name);
        return resultMap;
    }

}
