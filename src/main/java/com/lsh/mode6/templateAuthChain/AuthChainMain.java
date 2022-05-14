package com.lsh.mode6.templateAuthChain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 1:01 上午
 * @desc ：责任链模式：模拟模板审核
 * 模板  一级审核 --> 二级审核 --> 三级审核
 */
public class AuthChainMain {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Template template = new Template("你好，我是XXX。");

            AuthChain authChain = new AuthChain().add(new ILevelAuth()).add(new IILevelAuth()).add(new IIILevelAuth());

            authChain.doAuth(template,authChain);

            System.out.println(template);
        }
        //Template{content='你好，我是XXX。', levelI='一级审核不通过', levelII='null', levelIII='null'}
        //Template{content='你好，我是XXX。', levelI='一级审核通过', levelII='二级审核不通过', levelIII='null'}
        //Template{content='你好，我是XXX。', levelI='一级审核通过', levelII='二级审核通过', levelIII='三级审核不通过'}
        //Template{content='你好，我是XXX。', levelI='一级审核通过', levelII='二级审核通过', levelIII='三级审核通过'}


    }
}
