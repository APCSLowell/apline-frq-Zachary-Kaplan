public class APLine
{
  /* your code here */
  int a,b,c;
  public APLine(int aInt,int bInt,int cInt)
  {
    a = aInt;
    b = bInt;
    c = cInt;
  }
  public double getSlope()
  {
    return (double)(0-a)/(b);
  }
  public boolean isOnLine(int x, int y)
  {
    return (((a*x) + (b*y)) == 0-c);
  }
}
