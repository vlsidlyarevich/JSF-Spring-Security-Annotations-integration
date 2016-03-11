package com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.beans;

import com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.spring.AdminMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@Component
@SessionScoped
public class AdminBean {

    @Autowired
    private AdminMessage message;

    public String pringMessage(){
        return  message.getMessage();
    }

    public AdminMessage getMessage() {
        return message;
    }

    public void setMessage(AdminMessage message) {
        this.message = message;
    }
}