package com.lsh.mode7.observe.test1;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/15 9:12 下午
 * @desc ：定义事件类：包含发生事件的信息
 */
public class Event {
    String name;
    String time;
    String location;
    Producer source;//事件源对象

    public Producer getSource() {
        return source;
    }

    public Event(String name, String time, String location) {
        this.name = name;
        this.time = time;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
