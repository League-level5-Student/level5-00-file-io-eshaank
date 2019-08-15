package _03_To_Do_List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ToDoList {
	JFrame frame;
	JPanel panel;
	
	JButton addTask;
	JButton viewTask;
	JButton removeTask;
	JButton saveList;
	JButton loadList;
	
	public static void main(String[] args) {
		ToDoList listMaker = new ToDoList();
		listMaker.taskMaster();
	}
	
	void taskMaster() {
		frame = new JFrame();
		panel = new JPanel();
		
		addTask = new JButton();
		viewTask = new JButton();
		removeTask = new JButton();
		saveList = new JButton();
		loadList = new JButton();
		
		frame.setVisible(true);
		frame.add(panel);
		
		addTask.setLabel("Add Task");
		viewTask.setLabel("View Task");
		removeTask.setLabel("Remove Task");
		saveList.setLabel("Save List");
		loadList.setLabel("Load List");
		
		panel.add(addTask);
		panel.add(viewTask);
		panel.add(removeTask);
		panel.add(saveList);
		panel.add(loadList);
		
		
		
		
		frame.pack();
		frame.setDefaultCloseOperation(0);
	}
}
/*
 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list. 
 * 
 * When add task is clicked:
 * 		ask the user for a  task and save it to an array list
 * 
 * When the view tasks button is clicked:
 *		show all the tasks in the list
 * 
 * When the remove task button is clicked:
 * 		prompt the user for which task to remove and take it off of the list.
 * 
 * When the save list button is clicked:
 * 		Save the list to a file
 * 
 * When the load list button is clicked:
 * 		Prompt the user for the location of the file and load the list from that file
 * 
 * When the program starts, it should automatically load the last saved file into the list.
 */