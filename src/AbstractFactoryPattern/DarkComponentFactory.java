package AbstractFactoryPattern;

public class DarkComponentFactory implements ComponentFactory{

    @Override
    public DialogBox addDialogBox() {
        return new DarkDialogBox();
    }

    @Override
    public TaskBar addTaskBar() {
        return new DarkTaskBar();
    }
    
}
