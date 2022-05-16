package com.lsh.mode6.chainofresponsibility.templateAuthChain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 1:08 上午
 * @desc ：
 */
public class IIILevelAuth implements AuthService {
    @Override
    public void doAuth(Template template, AuthChain authChain) {
        if ("二级审核通过".equals(template.levelII)){
            //只有二级审核通过才向下传递审核
            if (((int)(Math.random()*10)<5)){
                template.levelIII = "三级审核通过";
            }else {
                template.levelIII = "三级审核不通过";
            }
            authChain.doAuth(template,authChain);
        }

    }
}
