package com.lsh.mode7.observe.test2;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 10:05 下午
 * @desc ：结果事件
 */
public class ResultEvent {

    String result;
    String time;
    LotteryService source;

    public ResultEvent() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public LotteryService getSource() {
        return source;
    }

    public void setSource(LotteryService source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "ResultEvent{" +
                "result='" + result + '\'' +
                ", time='" + time + '\'' +
                ", source=" + source +
                '}';
    }
}
