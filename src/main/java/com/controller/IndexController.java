package com.controller;

import java.util.Arrays;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 *
 * @author wangyong
 */
@Controller
public class IndexController {


  @RequestMapping("/index")
  public String index(HttpServletRequest request) {
    List<Integer> integerList = Arrays.asList(1, 2, 3, 4);
    integerList.forEach(intValue -> {
      System.out.println(intValue);
    });

    request.setAttribute("title", "首页");
    request.setAttribute("user", "张三");
    return "index";
  }


}
