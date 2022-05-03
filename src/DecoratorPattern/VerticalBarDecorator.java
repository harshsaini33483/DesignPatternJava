package DecoratorPattern;

public class VerticalBarDecorator  extends Decorator{

    public VerticalBarDecorator(Widget widget) {
        super(widget);
    }

    @Override
    public String draw() {
        
       return super.draw()+ "\n\tVertical Scroll bar";
    }
    
}
