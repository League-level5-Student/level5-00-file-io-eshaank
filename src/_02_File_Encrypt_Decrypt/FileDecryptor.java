package _02_File_Encrypt_Decrypt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class FileDecryptor {
	// Create a program that opens the file created by FileEncryptor and display
	// the decrypted message to the user in a JOptionPane.
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/_02_File_Encrypt_Decrypt/encryptedFile.txt"));
			
			String message = br.readLine();
			String messageDecrypt = "";
			
			for (int i = message.length(); i > 0; i--) {
				messageDecrypt += message.substring(i-1, i );
			}
			
			while(messageDecrypt != null){
				JOptionPane.showMessageDialog(null, messageDecrypt);
				messageDecrypt = br.readLine();
			}
			
			br.close();
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
