import java.util.Scanner;
public class Main
{
  public static void main(String[] args)
  {
    final int x = 5;
    final boolean y = false;
    final double z = 5.5;
    System.out.println(x);  
    System.out.println(y);  
    System.out.println(z);
    double xz = x + z;
    System.out.println(xz + z * x);
    Scanner s = new Scanner(System.in);
    System.out.println("What's your favorite number?");
    int favNum = s.nextInt();
    System.out.println("Now let's try and divide your favorite number by 0");
    try {
    System.out.println(favNum / 0);
        }
    catch (Exception e) {
    System.out.println(e + "\nYou can't divide an integer by 0");
    }
    System.out.println("Pick a new number to divide by.");
    double newNum = s.nextDouble();
    System.out.println(favNum / newNum);
    System.out.println("\nCool beans dude! \nOh, I never caught your name. What's your name?");
    s = new Scanner(System.in);
    String name = s.nextLine();
    System.out.println("Hi, " + name + "!");
    s.close();
                         
    
  }
}