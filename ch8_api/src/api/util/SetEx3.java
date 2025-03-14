package api.util;

import java.util.HashSet;
import java.util.Set;

import api.object.Person;

public class SetEx3 {
    public static void main(String[] args) {
        // Person 객체 리스트로
        Set<Person> set = new HashSet<>();
        // 자용자가 만든 객체에서는 Set구조가 적용되진 않는다.
        set.add(new Person("hong", "홍길동"));
        set.add(new Person("kim", "김길동"));
        set.add(new Person("park", "박길동"));
        set.add(new Person("hong", "홍길동"));
        set.add(new Person("jo", "조길동"));

        for (Person person : set) {
            System.out.println(person); // person.toString()
        }

        System.out.println(new Person("hong", "홍길동").hashCode());
        System.out.println(new Person("hong", "홍길동").hashCode());

    }
}
