import java.lang.*;
class  AllInterger
{
  int x;
  public void getValue(int n)
  {
    x = n;
  }
  public void showValue()
  {
    System.out.print("Integer ="+x+"\n");
  }
}
class AllNumber extends AllInterger
{
  int j;
  float y;
  public void getValue(float n)
  {
    y = n;
  }
  public void  showValue()
  {
  System.out.print("Float ="+y+"\n");
  }
}
class Number
{
  public static void main(String[] args)
  {
    AllNumber obj = new AllNumber();
    obj.getValue((float)8);
    obj.showValue();
  }
}
