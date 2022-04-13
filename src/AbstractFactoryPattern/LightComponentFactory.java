package AbstractFactoryPattern;

public class LightComponentFactory implements ComponentFactory {

    @Override
    public DialogBox addDialogBox() {
        return new LightDialogBox();
    }

    @Override
    public TaskBar addTaskBar() {
        return new LightTaskBar();
    }
    
}
