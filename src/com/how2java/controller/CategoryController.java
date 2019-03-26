package com.how2java.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
import com.how2java.pojo.Category;
import com.how2java.pojo.LiveBroadcastPojo;
import com.how2java.pojo.User;
import com.how2java.service.CategoryService;
import com.how2java.service.LiveBroadcastService;
import com.how2java.service.UserService;
 
// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class CategoryController {
    @Autowired
    CategoryService categoryService;
 
    @Autowired
    UserService userservice;
    
    @Autowired
    LiveBroadcastService liveBroadcastService;
    
    @RequestMapping("listCategory")
    public ModelAndView listCategory(){
        ModelAndView mav = new ModelAndView();
        List<Category> cs= categoryService.list();
         
        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("listCategory");
        return mav;
    }
    @RequestMapping("listUser")
    public ModelAndView listUser(){
        ModelAndView mav = new ModelAndView();
        List<User> cs= userservice.listuser();
         
        // 放入转发参数
        mav.addObject("cs", cs);
        // 放入jsp路径
        mav.setViewName("user");
        return mav;
    }
    @RequestMapping("liveBroadcastService")
    public ModelAndView liveBroadcastService(){
    	ModelAndView mav = new ModelAndView();
    	LiveBroadcastPojo cs= liveBroadcastService.get(1);
    	System.out.println(cs.getTitle());
    	// 放入转发参数
    	mav.addObject("cs", cs);
    	// 放入jsp路径
    	mav.setViewName("user1");
    	return mav;
    }
 
}