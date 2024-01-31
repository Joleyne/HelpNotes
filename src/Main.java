import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> myTask = new ArrayList<>();
        System.out.println("What task would you like to add");
        String taskToAddToList = input.nextLine();

        while(!(taskToAddToList.equals("quit"))){
            if(taskToAddToList.equals("quit"))
                break;
            myTask.add(taskToAddToList);
            System.out.println(myTask);
            System.out.println("What task would you like to add");
            taskToAddToList = input.nextLine();
        }

        myTask.add("Walk the dog");
        myTask.add("Walk the Cat");
        myTask.add("Walk the fish");
        System.out.println(myTask);
        myTask.remove(2);
        System.out.println(myTask);

        myTask =  addTask(myTask);
        System.out.println(myTask);
    }
    static ArrayList <String> addTask(ArrayList a){
        a.add("This i the newly added special task");
        return a;
    }
}