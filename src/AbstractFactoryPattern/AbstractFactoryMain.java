package AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
      ThemeBuildingFactory themeBuilder = new ThemeBuilder();
      OperatingSystem os = themeBuilder.makeSystem("light");
      os.showOSName();
      os.showDialogBox();
      os.showTaskBar();

      OperatingSystem os1 = themeBuilder.makeSystem("dark");
      os1.showOSName();
      os1.showDialogBox();
      os1.showTaskBar();
    }
}
