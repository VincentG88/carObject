//Program to demonstrate reading an ArrayList back from a file

import java.io.*;
import java.util.*;

public class ReadCarList
{
   public static void main(String args[]) throws IOException, ClassNotFoundException
   {
      //Create objects to read from file
      FileInputStream carFile = new FileInputStream("CarList.txt");
      ObjectInputStream readCarFile = new ObjectInputStream(carFile);
      
      //Read ArrayList from file
      ArrayList<Car> cars = (ArrayList<Car>) readCarFile.readObject();
    
     
      //Print the ArrayList
	  for(int i=0; i <cars.size(); i++)
	  {
	  	System.out.println(cars.get(i));
	  }
	  
	  //For loop short version
      /*for(Car c: carList)
      {
         System.out.println(c);
      }*/
      
      readCarFile.close();
   }//close main method
}//close class