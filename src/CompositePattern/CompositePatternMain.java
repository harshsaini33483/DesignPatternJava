package CompositePattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositePatternMain {

    public static void main(String[] args) {

        ToDoList item1 = new Items("Item1");
        ToDoList item2 = new Items("Item2");
        ToDoList item3 = new Items("Item3");
        ToDoList item4 = new Items("Item4");
        ToDoList item5 = new Items("Item5");
        ToDoList item6 = new Items("Item6");
        ToDoList item7 = new Items("Item7");
        ToDoList item11 = new Items("Item11");
        ToDoList item12 = new Items("Item12");

        ToDoList toDos1 = new ToDos(Arrays.asList(item6, item7));
        ToDoList toDos2 = new ToDos(Arrays.asList(item3, item2));

        List<ToDoList> list = new ArrayList<>();
        list.add(item1);
        list.add(item4);
        list.add(item5);
        list.add(toDos1);
        list.add(toDos2);
        list.add(item11);
        list.add(item12);
        
        ToDoList topList = new ToDos(list);
        for (String s : topList.getItems()) {
            System.out.print(s);
        }
    }
}
