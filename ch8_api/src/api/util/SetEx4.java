package api.util;

import java.util.Set;
import java.util.TreeSet;

public class SetEx4 {
    public static void main(String[] args) {
        Set<Integer> lotto2 = new TreeSet<>();
        for (int i = 0; lotto2.size() < 6; i++) {
            // 로또번호 1 ~ 45
            int num = (int) (Math.random() * 45) + 1;
            // lotto1.add(num);
            lotto2.add(num);

        }
        // hashSet: [2, 38, 27, 11, 14, 31]
        System.out.println(lotto2); // [16, 20, 26, 32, 33, 44] : 오름차순으로 정렬

    }
}
