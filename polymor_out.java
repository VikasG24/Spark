package org.viv.poly;


public class Polymor_out {

		   public static void main (String args [])
	   {
	       polymor_overload Obj = new polymor_overload();
	       double result;
	       Obj.oload(20);
	       Obj.oload(20, 30);
	       Obj.oload(2.5);
	       result = Obj.oload(2.5);
	      
	       polymor_overrid obj = new polymor_overrid();
	       obj.poverid();
	       over ob = new over();
	       ob.poverid();
	   }
	}



package org.viv.poly;

public class polymor_overload {

	
	   void oload(int num)
	   {
	       System.out.println ("Overload Value 1 : " + (num*100));
	   }
	   void oload(int num1, int num2)
	   {
	       System.out.println ("Overload Value 2 : " + (num1 + num2));
	   }
	   double oload(double num) {
	       System.out.println("Overload Value 3: " + (1000/num));
	       return num;
	   }
	}
	
	
	package org.viv.poly;

public class polymor_overrid {


	int i =1000;
	    public void poverid () {
      System.out.println (" Intial Deposited value  " + i);
 }
	    
}
class over extends polymor_overrid {
	int i = 7000;
 public void poverid () {
   
   System.out.println ("Correction in Deposited Value  " +i);
 }

}



	
	
	
