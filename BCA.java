import java.lang.*;
class BCA
{
static int total;
String name;
public BCA (String name)
{
 this.total++;
 this.name = name;
}

  public void show()
{
  System.out.println("\nName =" + name);
  System.out.println("\ntotal student=" + total);
}
public static void main(String[] args)
 {
  BCA obj1 = new BCA("Souvik");
  BCA obj2 = new BCA("Diamond");
  obj1.show();
  System.out.println("\nOBJ1:\n");
  obj2.show();
  System.out.println("\nOBJ2:\n");
  }
}
