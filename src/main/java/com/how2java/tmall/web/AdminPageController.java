package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@ResponseBody
public class AdminPageController {
    //访问admin,就会客户端跳转到admin_category_list去
    @GetMapping(value="/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }

    //访问地址admin_category_list,就会访问admin/listCategory.html
    @GetMapping(value="/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }
}
