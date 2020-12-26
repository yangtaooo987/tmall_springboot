package com.how2java.tmall.dao;

import com.how2java.tmall.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;
//继承了JpaRepository，提供了crud和分页的常见功能，jpa
public interface CategoryDAO extends JpaRepository<Category,Integer> {
}
