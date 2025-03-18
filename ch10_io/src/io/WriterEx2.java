package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력을 받아들여 그 내용을 파일에 작성.
        // 사용자가 q 입력하면 입력 받는 걸 중지 후 그 내용을 파일에 저장.
        Scanner sc = new Scanner(System.in);
        System.out.println("파일에 작성할 데이터를 입력해 주세요");
        System.out.println("중지할려면 q를 입력해 주세요");

        try (FileWriter fw = new FileWriter("c:/temp/user.txt");
                BufferedWriter br = new BufferedWriter(fw)) {
            String data = "";

            do {
                System.out.print(" >> ");
                data += sc.nextLine();

                if (!data.equals("q")) {

                    br.write(data);
                    br.newLine();
                }

            } while (!data.equals("q"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
