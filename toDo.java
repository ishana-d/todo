import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class toDo {
  // Instanciate ArrayLists and Scanner
  private ArrayList<String> list;
  private Scanner input;
  private ArrayList<String> completed;
  
  // Constructor 
  public toDo() {
    list = new ArrayList<String>();
    input = new Scanner(System.in);
    completed = new ArrayList<String>();
  }

  // Method to add a new task
  public String add() {
    System.out.println("Enter the task you want to add: ");
    String task = input.nextLine();
    list.add(task);
    return "Task successfully added to the list \n";
  }

  // Method to view all the tasks (both to do and completed)
  public String view() {
    String taskList = "Here are your tasks to do \n";
    for (int i = 0; i < list.size(); i++) {
      taskList += (i+1) + ". " + list.get(i) + "\n";
    }
  
    taskList += "\nHere are your completed tasks \n";
    for (int i = 0; i < completed.size(); i++) {
      taskList += (i+1) + ". " + completed.get(i) + "\n";
    }
    
    return taskList;
  }

  // Method to check if an index in the ArrayList is valid
  // Will use this method later when deleting tasks
  public boolean isValid(int number) {
    int index = number - 1;
    if (index >= 0 && index < list.size()) {
      return true;
    }
    return false;
  }

  // Method to delete an item from the list (and mark as completed)
  public String delete() {
    System.out.println("Enter the task number you want to delete: ");
    int number = input.nextInt();
    input.nextLine();

    System.out.println("Do you want to mark this item as completed? (yes/no)");
    String mark = input.nextLine();
    
    if (isValid(number)) {
      if (mark.equals("yes")) {
        completed.add(list.get(number-1));
      }
      list.remove(number - 1);
      return "Item successfully removed \n";
    }
    return "Item not found. Try again. \n";
  }

  // Method to save to do list and completed list as CSV files
  public String save() {
    File todo = new File("tasks.csv");
    File done = new File("completed.csv");
    try {
      FileWriter toDoCSV = new FileWriter(todo);
      FileWriter completedCSV = new FileWriter(done);
      for (String item : list) {
        toDoCSV.write(item + ", ");
      }
      toDoCSV.close();       
      for (String item : completed) {        
        completedCSV.write(item + ", ");
      }
      completedCSV.close();
      return "Successfully created 2 new files. \n";
    } 
    catch (IOException e) {
      return "Error saving to files: "; 
    }
  }
  
}
