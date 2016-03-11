package com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.spring.AdminMessageImpl;

import com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.spring.AdminMessage;
import org.springframework.stereotype.Component;

@Component
public class AdminMessageImpl implements AdminMessage {

    public String getMessage() {
        return "Hello ADMIN!";
    }
}
