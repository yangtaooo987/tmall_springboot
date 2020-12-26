package com.how2java.tmall.web;

import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//控制器，且对每个方法的返回值直接转换为json数据格式
@RestController
public class CategoryController {
    @Autowired//自动装配
    CategoryService categoryService;

    //对于categories的放回，回去所有的category对象集合，返回这个集合
    @GetMapping("/categories")
    public List<Category> list() throws Exception {
        return categoryService.list();
    }
}
