package com.wy.demo.controller;

import com.wy.demo.controller.base.BaseCotroller;
import com.wy.demo.controller.base.JsonUtils;
import com.wy.demo.entity.dto.ResultDTOBuilder;
import com.wy.demo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class UserController extends BaseCotroller{
    @Resource
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public void test(HttpServletRequest request, HttpServletResponse response){
        int t= userService.test();
        String result = JsonUtils.getJsonString4JavaPOJO(ResultDTOBuilder.success(t));
        System.out.println(result);
        super.safeJsonPrint(response, result);
        return ;
    }


}
