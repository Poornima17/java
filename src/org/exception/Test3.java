package org.exception;

public class Test3 
{
	
    public static void main(String[] args)
      {
      try
      {
     System.out.printf("1");
       //int data = 5 / 0;
       }
    catch(ArithmeticException e)
      {
    Throwable obj = new Throwable("Sample"); //jst throwable class ku obj create panni atha throw pandrom
     try
      {
     throw obj;
       } 
     catch (Throwable e1) 
        {
    	 e1.printStackTrace();
     System.out.printf("8");
        }
        }
   finally
    {
   System.out.printf("3");
    }
 System.out.printf("4");
    }
     }

