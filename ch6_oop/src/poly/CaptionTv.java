package poly;

public class CaptionTv extends Tv2 {
    boolean caption;

    void diaplayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

}
