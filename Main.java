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
    System.out.println(name + ", how old are you?");
    s = new Scanner(System.in);
    int age = s.nextInt();
    age++;
    System.out.println("Next year you're going to turn " + age + "!\nWow that's old!");
    age-=1;
    System.out.println("What's the biggest number you can think of? (don't go over 2 billion)");
    int bignum = s.nextInt();
    System.out.println("Wow, " + bignum + ", that's a big number!");
    int maxnum = Integer.MAX_VALUE;
    int difrence = Integer.MAX_VALUE - bignum;
    System.out.println(difrence);
    System.out.println("We can add " + difrence + " until we hit our max.");
    bignum =+ difrence;
    System.out.println("Our max number is " + bignum + "\nNow let's add a tiny bit and see what happens");
    s = new Scanner(System.in);
    Double add = s.nextDouble();
    bignum += add;
    System.out.println(bignum);
  }
}