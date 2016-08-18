package com.leo.zhang.test;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.leo.zhang.model.User;
import com.leo.zhang.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)     //±íÊ¾¼Ì³ÐÁËSpringJUnit4ClassRunnerÀà  
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})  
  
public class TestUser {  
    private static Logger logger = Logger.getLogger(TestUser.class);  
//  private ApplicationContext ac = null;  
    @Resource  
    private IUserService userService = null;  
  
//  @Before  
//  public void before() {  
//      ac = new ClassPathXmlApplicationContext("applicationContext.xml");  
//      userService = (IUserService) ac.getBean("userService");  
//  }  
  
    @Test  
    public void testGetUserById() {  
        User user = userService.getUserById(1);  
        // System.out.println(user.getUserName());  
        // logger.info("Öµ£º"+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
        logger.info("add from web");
    }
    
    @Test  
    public void testUserInsert() {  
    	User user = new User();
    	user.setId(99);
    	user.setAge(33);
    	user.setPassword("pass");
    	user.setUserName("2 fucks");
        boolean result =  userService.insert(user);        
        logger.info("the user add successful or not?"+result);  
        boolean deleteResult = userService.delete(99);
        logger.info("the user delete successful or not?"+deleteResult);
    }  
}  
