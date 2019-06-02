package cn.yjc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class KKK {
    public static void main(String[] args) {
        System.out.println("jj ");
        try {
            FileInputStream f=new FileInputStream("jjj.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
