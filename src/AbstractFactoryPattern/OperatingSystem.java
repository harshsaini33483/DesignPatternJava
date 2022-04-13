package AbstractFactoryPattern;

public abstract class OperatingSystem {
    private String osName;
    private DialogBox dialogBox;
    private TaskBar taskBar;

    public String getOSName(){
        return osName;
    }
    public void setOsName(String osName) {
        this.osName = osName;
    }
    public void showOSName(){
        System.out.println("You are currently running "+getOSName());
    }

    public void setDialogBox(DialogBox dialogBox){
        this.dialogBox = dialogBox;
    }
    public void setTaskBar(TaskBar taskBar){
        this.taskBar = taskBar;
    }
    
    public void showDialogBox() {
        System.out.println(dialogBox.getDialogBox());
    }

    public void showTaskBar() {
        System.out.println(taskBar.getTaskBar());
    }

    public abstract void buildOSComponent();
}
