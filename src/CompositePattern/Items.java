package CompositePattern;

import java.util.Arrays;
import java.util.List;

public class Items implements ToDoList{
    private String item;
   
    public Items(String item){
        this.item = item;
    }
    
    @Override
    public List<String> getItems(){
        return Arrays.asList(item+"\n");     
    }
}
