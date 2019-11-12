package com.open.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户相关操作控制层
 * Created by Administrator on 2019/11/12 0012.
 */
@RestController
public class UserAuthController {
    //认证注销
    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @GetMapping("oauth/test")
    public String testOauth() {
        return "oauth";
    }

    @GetMapping("user")
    public Principal currentUser(Principal principal) {
        return principal;
    }

    @DeleteMapping("signout")
    public Map<String,Object> signout(HttpServletRequest request){
        String authorization = request.getHeader("Authorization");
        String token = StringUtils.replace(authorization, "bearer ", "");
        Map<String,Object> resultMap = new HashMap<>();
        if (!consumerTokenServices.revokeToken(token)) {
            resultMap.put("code","fail");
            resultMap.put("msg","退出登录失败");
        }
        resultMap.put("code","success");
        resultMap.put("msg","退出登录成功");
        return resultMap;
    }
}
