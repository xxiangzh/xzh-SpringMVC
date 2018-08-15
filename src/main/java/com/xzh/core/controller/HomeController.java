package com.xzh.core.controller;

import com.xzh.annotation.MyController;
import com.xzh.annotation.MyRequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 向振华
 * @date 2018/08/15 9:43
 */
@MyController
@MyRequestMapping()
public class HomeController {

    @MyRequestMapping("/")
    public void home(HttpServletResponse response){
        try {
            response.getWriter().write( "Bootup Successful...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
