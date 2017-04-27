package com.gdaib.controller;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Constants;
import com.google.code.kaptcha.Producer;

/**
 * Created by Admin on 2017/4/26.
 */
@Controller
@RequestMapping("/public")
public class PublicController {
    @Autowired
    private Producer captchaProducer;

    @RequestMapping("/getCaptcha")
    public void getCaptcha
            (HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setDateHeader("Expires", 0);

        // Set standard HTTP/1.1 no-cache headers.

        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        // Set IE extended HTTP/1.1 no-cache headers (use addHeader).

        response.addHeader("Cache-Control", "post-check=0, pre-check=0");
        // Set standard HTTP/1.0 no-cache header.

        response.setHeader("Pragma", "no-cache");
        // return a jpeg

        response.setContentType("image/jpeg");
        // create the text for the image

        String capText = captchaProducer.createText();
        // store the text in the session

        request.getSession().setAttribute(Constants.KAPTCHA_SESSION_KEY, capText);
        // create the image with the text

        BufferedImage bi = captchaProducer.createImage(capText);
        ServletOutputStream out = response.getOutputStream();
        // write the data out

        ImageIO.write(bi, "jpg", out);
        try {
            out.flush();
        } finally {
            out.close();
        }

        //获取code方法
        //String kaptchaExpected = (String) request.getSession().getAttribute(com.google.code.kaptcha.Constants.KAPTCHA_SESSION_KEY);
    }



    @RequestMapping("/register")
    public String register(){
        ModelAndView modelAndView = new ModelAndView();
        return "register.jsp";
    }


    //登陆
    @RequestMapping("/login")
    public ModelAndView login(String username,String password, HttpSession session) throws Exception{
        System.out.println(username + ":" + password);


        //1.得到Subject
        Subject subject = SecurityUtils.getSubject();
        //2. 测试用户有没有被认证
        if(!subject.isAuthenticated()){
            //把用户名密码都封装到UsernamePasswordToken中
            UsernamePasswordToken token = new UsernamePasswordToken(username,password);


            try{
                //登录，执行realm中的认证方法
                subject.login(token);
            }catch(AuthenticationException ae){
                System.out.println(ae.getMessage()+ "!!!!!");
            }


        }



        return null;
    }



}
