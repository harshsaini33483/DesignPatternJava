package DecoratorPattern;

public class ClientMain {
    public static void main(String[] args) {
        Widget widget1 = new BordersDecorator(new HorizontalBarDecorator(new Window()));

        Widget widget2 = new BordersDecorator(new VerticalBarDecorator(new Window()));

        Widget widget3 = new VerticalBarDecorator(new HorizontalBarDecorator(new Window()));
        System.out.println(widget1.draw());
        
        System.out.println(widget2.draw());
        System.out.println(widget3.draw());
    }
}
