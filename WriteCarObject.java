//Write Car object to file
import java.io.*;

public class WriteCarObject
{
	public static void main(String []args) 
	{
		try{
			//Create object to open and write to file
			FileOutputStream carFile = new FileOutputStream("cars.txt");
			ObjectOutputStream car = new ObjectOutputStream(carFile);
		
			//Create an object of the car class
			Car car1 = new Car("221DL1", "Kia", "Sportage", 40000);
		
			//Write object to file
			car.writeObject(car1);
			car.close();
			}
			catch(FileNotFoundException ex)
			{
				System.out.println("File not found");
			}
			catch(IOException ex)
			{
				System.out.println("Error");
			}
		
		System.out.print("File added");
	
	}
}
		