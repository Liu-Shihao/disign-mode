package com.lsh.mode6.chainofresponsibility.templateAuthChain;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 1:02 上午
 * @desc ：
 */
public class Template {
    String content;
    String levelI;
    String levelII;
    String levelIII;

    public String getLevelI() {
        return levelI;
    }

    public void setLevelI(String levelI) {
        this.levelI = levelI;
    }

    public String getLevelII() {
        return levelII;
    }

    public void setLevelII(String levelII) {
        this.levelII = levelII;
    }

    public String getLevelIII() {
        return levelIII;
    }

    public void setLevelIII(String levelIII) {
        this.levelIII = levelIII;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Template(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Template{" +
                "content='" + content + '\'' +
                ", levelI='" + levelI + '\'' +
                ", levelII='" + levelII + '\'' +
                ", levelIII='" + levelIII + '\'' +
                '}';
    }
}
