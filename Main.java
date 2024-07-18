import java.util.Scanner;
public class Main {
  public static void main(String[] args) {

    // create a new todo object
    toDo taskList = new toDo();

    // print instructions 
    System.out.println("Welcome to a simple to-do list application. Here are the menu options.");
    System.out.println(" 1. Add a new task. \n 2. View the list. \n 3. Delete an item / Mark as completed. \n 4. Save tasks to a file \n 5. Exit.");
    System.out.println("");

    // set up scanner
    Scanner input = new Scanner(System.in);

    // enter loop
    while (true) {

      // ask user what option they choose and save it
      System.out.println("What would you like to do? ");
      int choice = input.nextInt();
      input.nextLine();
      System.out.println();

      // if they wish to exit, break now
      if (choice == 5) {
        System.out.println("Thank you for using the to-do list.");
        break;
      }

      // perform the correct function on the toDo object
      switch(choice) {
        case 1: 
          System.out.println(taskList.add());
          break;
        case 2:
          System.out.println(taskList.view());
          break;
        case 3:
          System.out.println(taskList.delete());
          break;
        case 4:
          System.out.println(taskList.save());
          break;
        default:
          System.out.println("Invalid choice. Please try again");
      }
    }

    input.close();

    
  }
}
