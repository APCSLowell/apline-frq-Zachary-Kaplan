public class APLine
{
  /* your code here */
  int a,b,c;
  public APLine(aInt,bInt,cInt)
  {
    a = aInt;
    b = bInt;
    c = cInt;
  }
  public double getSlope()
  {
    return -a/b;
  }
  public boolean isOnLine(int x. int y)
  {
    return (((a*x) + (b*y)) == c);
  }
}
