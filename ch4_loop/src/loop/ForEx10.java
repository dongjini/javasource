package loop;


public class ForEx10 {
    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = 5; j > 0; j--) {
                // if (j > i) {
                //     System.out.print(" ");
                // } else {
                //     System.out.print("*");
                // }                  
                System.out.print(j > i ? " " : "*");
            }
            System.out.println();
            
        }



    }
}
