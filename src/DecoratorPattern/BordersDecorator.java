package DecoratorPattern;

public class BordersDecorator extends Decorator {

    public BordersDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public String draw() {
       return  super.draw()+"\n\tBorders";
    }
    
}
