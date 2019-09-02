package _04_Serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * Complete this class so that it can be serialized.
 */
public class SaveData implements Serializable{
	public final String name;
	public final int age;

	public static void main(String[] args) throws IOException{
		Serialization test = new Serialization();
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("src/_04_Serialization/oos.ser")));
		
        oos.writeObject(test);
     
        oos.close();
	}
	
	
	
	public SaveData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
}
