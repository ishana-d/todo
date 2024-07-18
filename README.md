# Simple To-Do List Application

This is a simple to-do list application implemented in Java. The application allows users to add, view, delete (or mark as completed), save tasks to a file, and upload tasks from a file.

## Features

1. **Add a New Task:** Add a new task to your to-do list.
2. **View Tasks:** View all tasks in your to-do list, including completed tasks.
3. **Delete or Mark Task as Completed:** Delete a task or mark it as completed.
4. **Save Tasks to a File:** Save the current list of tasks to a CSV file.
5. **Upload Tasks from a File:** Load tasks from a CSV file.

## Usage

When you run the application, you will be presented with a menu of options:


### Menu Options

1. **Add a New Task:** Prompts you to enter a task, which will be added to the to-do list.
2. **View Tasks:** Displays all tasks in the to-do list, along with completed tasks.
3. **Delete or Mark Task as Completed:** Prompts you to enter the task number you want to delete, and asks if you want to mark it as completed.
4. **Save Tasks to a File:** Saves the current to-do list and completed tasks to separate CSV files.
5. **Upload Tasks from a File:** Prompts you to enter the filename to upload tasks from.
6. **Exit:** Exits the application.

## Code Overview

### Main.java

The `Main` class handles user input and interacts with the `toDo` class to perform various tasks.

### toDo.java

The `toDo` class contains methods to manage the to-do list, including adding, viewing, deleting tasks, and saving/loading tasks to/from files.

