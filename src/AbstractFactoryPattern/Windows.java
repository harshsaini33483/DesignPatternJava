package AbstractFactoryPattern;

public class Windows extends OperatingSystem {

    private ComponentFactory componentFactory;
    
    public Windows(ComponentFactory componentFactory){
        setOsName("windows");
        this.componentFactory = componentFactory;
    }

    @Override
    public void buildOSComponent() {
        System.out.println("Creating component for " + getOSName());
        setDialogBox(componentFactory.addDialogBox());
        setTaskBar(componentFactory.addTaskBar());
    }

    
}
