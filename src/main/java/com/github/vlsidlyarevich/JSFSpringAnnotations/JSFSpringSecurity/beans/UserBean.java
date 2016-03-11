package com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.beans;


import com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.spring.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@Component
@SessionScoped
public class UserBean {

    @Autowired
    UserMessage message;

    public String pringMessage(){
        return  message.getMessage();
    }

    public UserMessage getMessage() {
        return message;
    }

    public void setMessage(UserMessage message) {
        this.message = message;
    }
}
