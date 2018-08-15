package com.xzh.core.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xzh.annotation.MyController;
import com.xzh.annotation.MyRequestMapping;
import com.xzh.annotation.MyRequestParam;

/**
 * @author 向振华
 * @date 2018/8/15 9:49
 */
@MyController
@MyRequestMapping
public class TestController {

	 @MyRequestMapping("/test")
    public void test(HttpServletRequest request, HttpServletResponse response,
    		@MyRequestParam("param") String param){
 		System.out.println(param);
	    try {
            response.getWriter().write( "test method success! param:"+param);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
