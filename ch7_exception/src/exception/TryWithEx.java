package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithEx {
    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("file.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally { // 자원을 열어두고 닫는 용도로 주로 사용함
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // try - with - resources : 자동 리소스 닫기
        try (FileInputStream fis2 = new FileInputStream("file.txt")) {

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
