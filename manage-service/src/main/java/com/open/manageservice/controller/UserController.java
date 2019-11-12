package com.open.manageservice.controller;

import com.open.manageservice.entity.UserInfo;
import com.open.manageservice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2019/11/12 0012.
 */
@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    @GetMapping("queryUserList")
    public List<UserInfo> queryUserList(){
        return iUserService.queryList();
    }

    @PostMapping("insertUser")
    public Map<String,Object> insertUser(@RequestBody UserInfo userInfo){
        Map<String,Object> resultMap = new HashMap<>();
        if (iUserService.save(userInfo)){
            resultMap.put("message","添加成功");
            resultMap.put("success","true");
        }else {
            resultMap.put("message","添加失败");
            resultMap.put("success","false");
        }
        return resultMap;
    }
}
