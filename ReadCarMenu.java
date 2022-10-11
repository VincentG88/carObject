import java.io.*;
import java.util.*;
public class ReadCarMenu
{
   //ArrayList<Employee> empList = new ArrayList<>();
   public static void main(String[]args) throws FileNotFoundException , IOException, ClassNotFoundException
   {
      Scanner keyboardIn = new Scanner(System.in);
      //Create objects to open file and read from it
      FileInputStream carFile = new FileInputStream("CarList.txt");
      ObjectInputStream readCarFile = new ObjectInputStream(carFile);
      
       ArrayList<Car>carList = (ArrayList<Car>) readCarFile.readObject();

      int option;
	  String make;
	  
      do
      {
         //Display Menu
         System.out.println("1. View all Cars");
         System.out.println("2. View Car by Make");
         System.out.println("0. Exit System");
         System.out.print("Enter your option");
         option = keyboardIn.nextInt();
		 
		 switch(option)
		 {
		 	case 1:
			viewCars(carList); //Call method viewCars and pass it the ArrayList called carList
			break;
			
			case 2:
			//Ask user to enter a make
			System.out.print("Enter make of a car: ");
			make = keyboardIn.next();
			searchMake(carList, make);
			break;
			
		}//Close switch
		
      }while(option != 0);
   }//Close main method
   
   //Method to View all cars
   //Passing down an ArrayList as parameter type with object "cars"
   public static void viewCars(ArrayList<Car> cars)
   {
   		for(int i = 0; i <cars.size(); i++)
		System.out.println(cars.get(i));	
   }//Close view cars method
   
   //Method to search for make of car
   public static void searchMake(ArrayList<Car> cars, String mk)
   {
   		for(int i = 0; i <cars.size(); i++)
		{
			if(mk.equalsIgnoreCase(cars.get(i).getMake()))
			{
				System.out.println(cars.get(i));
			}
		}
   }
}