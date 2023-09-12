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
    try {
    System.out.println(x / 0);
        }
    catch (Exception e) {
    System.out.println("You can't divide an integer by 0");
                         }
    
  }
}