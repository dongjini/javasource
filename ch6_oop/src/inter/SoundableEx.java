package inter;

interface Soundable {
    String sound();

}

class Cat implements Soundable {

    @Override
    public String sound() {
        return "냐용";
    }
}

class Dog implements Soundable {

    @Override
    public String sound() {
        return "멍멍";
    }

}

class SoundableEx {

    public static void main(String[] args) {
        printSount(new Cat());
        printSount(new Dog());
    }

    static void printSount(Soundable soundable) {
        System.out.println(soundable.sound());
    }

}
