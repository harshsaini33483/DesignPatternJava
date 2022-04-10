package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class ToDos implements ToDoList{
    
    private List<ToDoList> toDoLists;

    public ToDos( List<ToDoList> toDoLists){
        this.toDoLists = toDoLists;
    }

    @Override
    public List<String> getItems(){
        List<String> toDos = new ArrayList<>();
  
        for( int toDoIndex=0;toDoIndex<toDoLists.size();toDoIndex++){
           List<String> items = toDoLists.get(toDoIndex).getItems();
           if(items.size()==1){
            toDos.add("\t"+(toDoIndex+1)+". "+items.get(0)+"\n");
           }else{
                for(int itemIndex=0;itemIndex<items.size();itemIndex++){
                    toDos.add("\t"+(toDoIndex+1)+"."+(itemIndex+1)+" "+items.get(itemIndex));
                }
           }
         
        }
        return toDos;
    }
}
