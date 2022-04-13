package AbstractFactoryPattern;

public class ThemeBuilder implements ThemeBuildingFactory{

    @Override
    public OperatingSystem makeSystem(String theme) {
        
        OperatingSystem os = null;
        if(theme.equals("light")){
            ComponentFactory lightComponentFactory = new LightComponentFactory();
            os = new Windows(lightComponentFactory);
        }else{
            ComponentFactory darkComponentFactory = new DarkComponentFactory();
            os = new Windows(darkComponentFactory);
        }
        os.buildOSComponent();
        return os;
    }

}
