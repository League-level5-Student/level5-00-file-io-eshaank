package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {
	JFrame frame;
	JPanel panel;

	JButton addTask;
	JButton viewList;
	JButton removeTask;
	JButton saveList;
	JButton loadList;

	ArrayList<String> taskList = new ArrayList<String>();

	public static void main(String[] args) {
		ToDoList listMaker = new ToDoList();
		listMaker.taskMaster();

	}

	void taskMaster() {
		frame = new JFrame();
		panel = new JPanel();

		addTask = new JButton();
		viewList = new JButton();
		removeTask = new JButton();
		saveList = new JButton();
		loadList = new JButton();

		frame.setVisible(true);
		frame.add(panel);

		addTask.setLabel("Add Task");
		viewList.setLabel("View List");
		removeTask.setLabel("Remove Task");
		saveList.setLabel("Save List");
		loadList.setLabel("Load List");

		panel.add(addTask);
		panel.add(viewList);
		panel.add(removeTask);
		panel.add(saveList);
		panel.add(loadList);

		addTask.addActionListener(this);
		viewList.addActionListener(this);
		removeTask.addActionListener(this);
		saveList.addActionListener(this);
		loadList.addActionListener(this);

		frame.pack();
		frame.setDefaultCloseOperation(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == addTask) {
			String task = JOptionPane.showInputDialog("Enter a task to be saved");
			taskList.add(task);
		}

		String display = "";
		for (int i = 0; i < taskList.size(); i++) {
			display += taskList.get(i) + "\n";
		}

		if (e.getSource() == viewList) {
			JOptionPane.showMessageDialog(null, display);
		}

		if (e.getSource() == removeTask) {
			String remove = JOptionPane.showInputDialog("Enter a task to remove: \n" + display);
			for (int i = 0; i < taskList.size(); i++) {
				if (taskList.get(i).equalsIgnoreCase(remove)) {
					taskList.remove(i);
				}
			}
			System.out.println(taskList);
		}
		if (e.getSource() == saveList) {
			try {
				FileWriter saveFile = new FileWriter("src/_03_To_Do_List/savedList.txt");
				saveFile.write(display);
				saveFile.close();

			} catch (IOException p) {
				p.printStackTrace();
			}
		}
		if (e.getSource() == loadList) {
			try {
				BufferedReader load = new BufferedReader(new FileReader("src/_03_To_Do_List/savedList.txt"));

				String fileContents = "";
				String temp = "";
				temp = load.readLine();
				while (temp != null) {
					
					fileContents += temp + "\n";
					temp = load.readLine();
				}
				
				JOptionPane.showMessageDialog(null, fileContents);
				//fileContents = load.readLine();

				load.close();
			} catch (FileNotFoundException p1) {
				// TODO Auto-generated catch block
				p1.printStackTrace();
			} catch (IOException p2) {
				// TODO Auto-generated catch block
				p2.printStackTrace();
			}
		}
	}
}
/*
 * Create a program with five buttons, add task, view tasks, remove task, save
 * list, and load list.
 * 
 * When add task is clicked: ask the user for a task and save it to an array
 * list
 * 
 * When the view tasks button is clicked: show all the tasks in the list
 * 
 * When the remove task button is clicked: prompt the user for which task to
 * remove and take it off of the list.
 * 
 * When the save list button is clicked: Save the list to a file
 * 
 * When the load list button is clicked: Prompt the user for the location of the
 * file and load the list from that file
 * 
 * When the program starts, it should automatically load the last saved file
 * into the list.
 */