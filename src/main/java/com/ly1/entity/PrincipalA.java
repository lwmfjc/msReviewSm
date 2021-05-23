package com.ly1.entity;

import org.springframework.stereotype.Component;

@Component
public class PrincipalA implements Principal{
    public String petPhrase() {
        return "猴赛雷";
    }
}
