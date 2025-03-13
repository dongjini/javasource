package api.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx4 {
    public static void main(String[] args) {
        StringEx4 obj = new StringEx4();
        String names[] = { "Queen", "Tod", "Kim", "Lee", "Choi" };

        String result = obj.findKim(names);
        System.out.println(result);

    }

    public String findKim(String[] seoul) {
        // 반환 : Kim은 3번쨰에 있다
        // int i = 0;
        // for (i = 0; i < seoul.length; i++) {
        // if (seoul[i].equals("Kim")) {
        // break;
        // }
        // }
        // return "Kim은" + (i + 1) + "번째에 있다.";

        int i = Arrays.asList(seoul).indexOf("Kim");
        return "Kim은" + (i + 1) + "번째에 있다.";

    }

}
