package _02_File_Encrypt_Decrypt;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileEncryptor {
	// Create a program that takes a message from the user.
	// Use the methods in the String and Character classes to save
	// an encrypted form of the message to a file
	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("Type a message to encrypt");
		String messageEncrypt = "";
		for (int i = message.length(); i > 0; i--) {
			messageEncrypt += message.substring(i-1, i );
		}
			try {
				FileWriter fw = new FileWriter("src/_02_File_Encrypt_Decrypt/encryptedFile.txt");
				
				fw.write(messageEncrypt);
				fw.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}
}
