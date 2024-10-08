
import ru.a148ru.examples.patterns.adapter.adapter.Adapter;
import ru.a148ru.examples.patterns.factory.*;
import ru.a148ru.examples.patterns.iterator.Iterator;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        try {
            ShapeFactory.generateShape(ShapeType.CIRCLE);
            ShapeFactory.generateShape(ShapeType.ERROR);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        new Adapter().runAdapter();

        Iterator.runIterator();
    }
}
