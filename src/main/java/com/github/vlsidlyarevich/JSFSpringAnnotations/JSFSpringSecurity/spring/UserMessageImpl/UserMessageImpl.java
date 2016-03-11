package com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.spring.UserMessageImpl;


import com.github.vlsidlyarevich.JSFSpringAnnotations.JSFSpringSecurity.spring.UserMessage;
import org.springframework.stereotype.Component;


@Component
public class UserMessageImpl implements UserMessage {

    public String getMessage() {
        return "Hello!";
    }
}
