package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileInputStreamEx1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        int data = 0;
        try {
            fis = new FileInputStream("c:/tenp/file1.txt");
            fos = new FileOutputStream("c:/temp/output1.txt");
            while ((data = fis.read()) != -1) {
                char ch = (char) data;
                // System.out.println(ch);
                fos.write(ch);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
