package exercise6;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ToDoListManagement {

    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        while (true) {
            System.out.println("-----MENU-------");
            System.out.println("1. Add anew task.");
            System.out.println("2.View list.");
            System.out.println("3.Remove a task by its position(index");
            System.out.println("4.Exit");
            System.out.print("Choose options: ");
            int choice = kb.nextInt();
            kb.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter a number of tasks: ");
                    int n=kb.nextInt();
                    kb.nextLine();
                    for(int i=0;i<n;i++){
                     System.out.print("Enter task "+(i+1)+": ");
                    String task = kb.nextLine();
                    tasks.add(task);}
                    break;
                case 2:
                    if (tasks.size() == 0) {
                        System.out.println("Your to do list is empty.");
                    } else {
                        System.out.println("Your to do list: ");
                       
          System.out.println("View list->" + Arrays.toString(tasks.toArray()));
          //System.out.println(i+". "+tasks.get(i));
                        
                    }
                    break;
                case 3:
                    System.out.print("Enetr the index of the task to remove: ");
                    int index=kb.nextInt();
                    if(index>=0&&index<tasks.size()){
                        tasks.remove(index);
                    }else{
                        System.out.println("Error");
                    }
                    break;
                case 4:
                    System.out.println("Exit!");
                    return;
                default:
                    System.out.println("Invalid choice, please try agian.");
            }
        }
    }
}
