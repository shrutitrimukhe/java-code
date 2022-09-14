class MethodOverload
{
  static void address(int pin)
  {  
   System.out.println("pincode:"+pin);
  }
  static void address(int pin, String ps)
  {
   System.out.println("pincode:"+pin+" "+"Ps:"+ps);
  }
   static void address(int pin,String ps,String assembly)
  {
   System.out.println("pincode:"+pin+" "+"ps:"+ps+" "+"assembly:"+assembly);
  }
  public static void main(String[] args)
  {
  address(421004);
  address(421003,"thane ps");
  address(421001,"kalyan ps","mumbai");
  }
}