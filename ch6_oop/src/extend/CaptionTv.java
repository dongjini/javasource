package extend;

public class CaptionTv extends Tv {
    boolean caption;

    void diaplayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

}
