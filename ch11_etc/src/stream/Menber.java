package stream;

public class Menber {

    public static int MALE = 0;
    public static int FEMALE = 1;

    private String name;
    private int gender;
    private int age;

    public Menber(String name, int gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

}
