package com.lsh.mode6.templateAuthChain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 1:04 上午
 * @desc ：
 */
public class AuthChain implements AuthService {

    List<AuthService> authors = new ArrayList<>();

    int index;

    public AuthChain add(AuthService authService){
        authors.add(authService);
        return this;
    }

    @Override
    public void doAuth(Template template, AuthChain authChain) {
        if (index < authors.size()){
            AuthService authService = authors.get(index++);
            authService.doAuth(template,authChain);
        }

    }
}
