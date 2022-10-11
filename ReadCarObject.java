//Read Car object from file
import java.io.*;

public class ReadCarObject
{
	public static void main(String []args)throws IOException, FileNotFoundException, ClassNotFoundException
	{
	
		//Create object to open and read from file
		FileInputStream carFile = new FileInputStream("cars.txt");
		ObjectInputStream car = new ObjectInputStream(carFile);
		//Read object in and cast as Car object
		//Assign to object c1
		Car c1 = (Car) car.readObject();
		
		//Print object to screen
		System.out.println(c1);
		
		car.close();
		
	}
}