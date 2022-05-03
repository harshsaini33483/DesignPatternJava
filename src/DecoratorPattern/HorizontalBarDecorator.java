package DecoratorPattern;

public class HorizontalBarDecorator extends Decorator{

    public HorizontalBarDecorator(Widget widget) {
        super(widget);
        
    }
    @Override
    public String draw(){
        return  widget.draw()+ "\n\tHorizontal Bar";
    }
}
