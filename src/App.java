
import ru.a148ru.examples.patterns.factory.*;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try {
            ShapeFactory.generateShape(ShapeType.CIRCLE);
            ShapeFactory.generateShape(ShapeType.ERROR);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
