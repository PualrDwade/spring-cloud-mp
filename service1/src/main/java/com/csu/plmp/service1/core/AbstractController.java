package com.csu.plmp.service1.core;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xuanxuan
 * @CreateDate: 2018-12-3 14:57
 * @Description: 统一异常处理, 将controller继承该类, 即可
 */
public abstract class AbstractController {

    @ExceptionHandler({Exception.class})
    public Map<String, String> exceptionHandler(Exception e, WebRequest req) {
        System.err.println("=================");
        System.err.println(req.toString());
        System.err.println(req.getRemoteUser());
        System.err.println(req.getContextPath());
        System.err.println("=============");
        Map<String, String> map = new HashMap<String, String>();
        map.put("code", "0");
        map.put("msg", e.getMessage());
        return map;
    }
}
