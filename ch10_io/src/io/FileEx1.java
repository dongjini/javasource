package io;

import java.io.File;

public class FileEx1 {
    public static void main(String[] args) {

        // 파일객체 생성
        File file1 = new File("c:/temp/test1.txt");
        // \ 이것도 사용은 가능하지만
        // File file1 = new File("c:\\temp\\test1.txt");
        // \t, \n으로 인해 \하나로는 폴더구분자로 인식을 못하기에 \\두개를 사용해야한다 c:\\temp\\test1.txt
        File file2 = new File("c:/temp", "test1.txt");

        File dir = new File("c:/temp");
        File file3 = new File(dir, "test1.txt");

        System.out.println("경로를 제외한 파일명 : " + file1.getName()); // test1.txt
        // file1.getName() => String 메소드 이용
        String fileName = file1.getName(); // test1.txt
        int pos = fileName.lastIndexOf(".");

        System.out.println("확장자를 제외한 파일명 : " + fileName.substring(0, fileName.lastIndexOf("."))); // test1
        System.out.println("확장자 : " + fileName.substring(pos + 1)); // txt
        System.out.println("경로를 포함한 파일명 : " + file1.getPath()); // c:\temp\test1.txt
        System.out.println("파일의 절대 경로 : " + file1.getAbsolutePath()); // c:\temp\test1.txt
        System.out.println("파일의 디렉토리 : " + file1.getParent()); // c:\temp

        // ;
        System.out.println("File.pathSeparator : " + File.pathSeparator); // ;
        System.out.println("File.pathSeparatorChar : " + File.pathSeparatorChar); // ;
        // \
        String path = "c:\\temp" + File.separator + "test1.txt";
        // separator을 사용하면 운영체제에 맞춰서 자동으로 잡아준다.
        System.out.println("File.separator : " + File.separator); // \
        System.out.println("File.separatorChar : " + File.separatorChar); // \

    }
}
