package com.lsh.mode14.adapter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/5/17 11:13 下午
 * @desc ：适配器模式 Adapter
 *       字节流                    转换器                             字符流
 * FileInputStream  <======>   InputStreamReader   <======>    BufferedReader
 */
public class Main {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("src/main/java/com/lsh/mode14/adapter/a.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && line != ""){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();


    }
}
