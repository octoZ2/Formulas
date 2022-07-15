// Rowan Surkan Java File Restoration Process "file 1". 
import java.util.*;


public class Formulas {

   public static void main(String[] args) {
   
   Scanner console = new Scanner(System.in);
   System.out.print("Input your desired shape: Sphere, Cylinder, Cone or Cube: ");
   String shape = console.next();
   
   if (shape.equalsIgnoreCase("Sphere")) {
      System.out.println(sphere());
      
   }
   if (shape.equalsIgnoreCase("Cylinder")) {
      System.out.println(cylinder());
      
      
   
   }
   if (shape.equalsIgnoreCase("Cone")) {
      System.out.println(cone());
   
   }
   if (shape.equalsIgnoreCase("Cube")) {
      System.out.println(cube());
   
   }
   
      
      
   }
   
   public static double sphere() {
      Scanner console2 = new Scanner(System.in);
      System.out.print("Input the radius in cm: ");
      double rad = console2.nextDouble();
      double vol = 4/3*(Math.PI)*(Math.pow(rad,3));
      return vol;
   
   }
   
   public static double cylinder() {
      Scanner console2 = new Scanner(System.in);
      System.out.print("Input the radius of the cylinder: ");
      double rad = console2.nextDouble();
      Scanner console3 = new Scanner(System.in);
      System.out.print("Input the height of the cylinder: ");
      double height = console3.nextDouble ();
      double vol = height*Math.PI*Math.pow(rad,2);
      return vol;
   
   
   }
   
   public static double cone() {
      Scanner console2 = new Scanner(System.in);
      System.out.print("Input the radius of the cone: ");
      double rad = console2.nextDouble();
      Scanner console3 = new Scanner(System.in);
      System.out.print("Input the height of the cone: ");
      double height = console3.nextDouble();
      double vol = (0.333333)*height*(Math.PI)*(Math.pow(rad,2));
      return vol;
   
   }
   
   public static double cube() {
      Scanner console2 = new Scanner(System.in);
      System.out.print("Input the length of one of the sides of the cube: ");
      double length = console2.nextDouble();
      double vol = Math.pow(length, 3);
      return vol;
   
   }
}