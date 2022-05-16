package com.lsh.mode6.chainofresponsibility.templateAuthChain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 1:08 上午
 * @desc ：
 */
public class ILevelAuth implements AuthService {
    @Override
    public void doAuth(Template template, AuthChain authChain) {
        if (((int)(Math.random()*10)<9)){
            template.levelI= "一级审核通过";
        }else {
            template.levelI = "一级审核不通过";
        }
        authChain.doAuth(template,authChain);

    }
}
