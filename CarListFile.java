/*Create any number of Car objects, add them to an ArrayList and
write the ArrayList to file */

import java.io.*;
import java.util.*;

public class CarListFile
{
   public static void main(String []args) throws IOException, FileNotFoundException
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Create ArrayList for car object
	  ArrayList<Car> carList = new ArrayList<>();
      //Create objects to open and write to file
	  FileOutputStream carFile = new FileOutputStream("CarList.txt");
	  ObjectOutputStream car = new ObjectOutputStream(carFile);
	  
      //declare variables
      String reg, make, model;
      double value;
      char ans;
      do
      {
         System.out.print("Enter reg num of car:");
         reg = keyboardIn.next();
         System.out.print("Enter make of car:");
         make = keyboardIn.next();
         System.out.print("Enter model of car:");
         model = keyboardIn.next();
         System.out.print("Enter value of car:");
         value = keyboardIn.nextDouble();
         //Add car object to the ArrayList
		 carList.add(new Car(reg, make, model, value));
         
         System.out.print("Would you like to add another car (Y/N): ");
         ans = keyboardIn.next().charAt(0);
      }while(ans == 'y' || ans == 'Y');  //continue entering cars if user enters y or Y 
	  //Write ArrayList to file
	  car.writeObject(carList);
	  System.out.println("File created");
	  //Close output stream
	  car.close();
   }
}