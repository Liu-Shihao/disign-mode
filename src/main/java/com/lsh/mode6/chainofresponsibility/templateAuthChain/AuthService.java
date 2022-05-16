package com.lsh.mode6.chainofresponsibility.templateAuthChain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 1:04 上午
 * @desc ：
 */
public interface AuthService {
    void doAuth(Template template,AuthChain authChain);
}
