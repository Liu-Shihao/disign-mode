package com.lsh.mode13.builder;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/17 10:53 下午
 * @desc ：
 */
public class Person {
    private  String name;
    private int age;
    private String gender;
    private String tel;
    private Address address;

    private Person(){

    }


    public static class PersonBuilder{
        Person p =  new Person();

        public PersonBuilder baseInfo(String name,int age){
            p.name = name;
            p.age = age;
            return this;
        }
        public PersonBuilder gender(String gender){
            p.gender = gender;
            return this;
        }
        public PersonBuilder tel(String tel){
            p.tel = tel;
            return this;
        }
        public PersonBuilder address(String homenumber,String street){
            p.address = new Address(homenumber,street);
            return this;
        }

        public Person build(){
            return p;
        }


    }


    static class Address{
        String homenumber;
        String street;

        public Address(String homenumber, String street) {
            this.homenumber = homenumber;
            this.street = street;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "homenumber='" + homenumber + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", tel='" + tel + '\'' +
                ", address=" + address +
                '}';
    }
}
