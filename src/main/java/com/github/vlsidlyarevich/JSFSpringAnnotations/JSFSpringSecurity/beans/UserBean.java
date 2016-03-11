package com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.beans;


import com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.spring.UserMessage;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@Component
@SessionScoped
public class UserBean {

    private UserMessage message;

    public String printMessage(){
        return  message.getMessage();
    }

    public UserMessage getMessage() {
        return message;
    }

    public void setMessage(UserMessage message) {
        this.message = message;
    }
}
