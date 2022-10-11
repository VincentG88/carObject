/*Car class
Create objects with Car reg No, Make, Model and value  */
import java.io.*;

public class Car implements Serializable
{
   //instance variables
   private String carReg;
   private String carMake;
   private String carModel;
   private double value;
   
   //Constructor
   public Car(String reg, String make, String model, double val)
   {
      carReg = reg;
      carMake = make;
      carModel = model;
      value = val;
   }
   
   //Methods
   public String getReg()
   {
      return carReg;
   }
   public String getMake()
   {
      return carMake;
   }
   public String getModel()
   {
      return carModel;
   }
   public double getValue()
   {
      return value;
   }
   
   public String toString()
   {
      return "Reg Number" + carReg+ "\t Make "+carMake+ " \t Model "+carModel+ "\t Value "+value;
   }
} 