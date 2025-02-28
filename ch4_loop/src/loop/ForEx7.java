package loop;

// 중첩 for 

// ********
// ********
// ********
// ********

public class ForEx7 {
    public static void main(String[] args) {

        
        // for (int i = 0; i < 10; i++) {
        //     System.out.printf("*\t");
        // }


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("* \t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

    }
}
