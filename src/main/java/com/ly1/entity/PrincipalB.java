package com.ly1.entity;

import org.springframework.stereotype.Component;

@Component
public class PrincipalB implements Principal{

    public String petPhrase() {
        return "雷猴啊";
    }
}
