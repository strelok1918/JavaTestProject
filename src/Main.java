/**
 * Created by Igor on 11.02.14.
 */
public class Main {
    private static void draw(Shape s) {
        s.draw();
    }
    public static void main(String[] args) {
        Shape ss = new Shape();
        Triangle tr = new Triangle();
        draw(ss);
        draw(tr);
    }
}
