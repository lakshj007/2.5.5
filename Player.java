import java.util.Scanner;
/*
 * Activity 2.5.2
 */
public class Player
{
 private String name = ""; 
 private double points;

public Player( String inputName)
{
  name = inputName;
  points = 0;

  System.out.println("Hello " + name);

}


public Player()
{
  System.out.println("Enter Player Name: ");
  Scanner sc = new Scanner(System.in);
  String newName = sc.nextLine();

  name = newName;
  System.out.println("Hello " + name);

}

 public String getName()
 {
   return name;
 }
 
 public void setName(String x)
 {
   name = x;
 }
  
 public double getPoints()
 {
   return points;
 }
  
} 