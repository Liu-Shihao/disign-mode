package com.lsh.mode6.chainofresponsibility.templateAuthChain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 1:08 上午
 * @desc ：
 */
public class IILevelAuth implements AuthService {
    @Override
    public void doAuth(Template template, AuthChain authChain) {
        if ("一级审核通过".equals(template.levelI)){
            //只有一级审核通过才向下传递审核
            if (((int)(Math.random()*10)<7)){
                template.levelII = "二级审核通过";
            }else {
                template.levelII = "二级审核不通过";
            }

            authChain.doAuth(template,authChain);
        }
        //一级审核不通过直接返回

    }
}
