package DecoratorPattern;

public abstract class Decorator  implements  Widget{
    
    Widget widget;

    public Decorator(Widget widget){
        this.widget = widget;
    }
    @Override
    public String draw() {
     
        return widget.draw();
     
    }

}
