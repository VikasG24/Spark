
package org.viv.oops;


	class Inhert {
	
		int i,j;
		
			void supshow()
			{
				System.out.println("Transaction Values are "+i + " and " +j + "  --> " +(i-j)  ) ;
			}
	}
		
 class sub extends Inhert {
	int m,a,b;
	
		void subshow()
		 
		{	
			System.out.println("Opening Balance  ---> " +m);
		}
		
		void allshow()
		
		{
			System.out.println(" Closing Balance ---> " +(a-b+m));
		}
		
 }
 
	class SampleInheritance {
		public static void main(String args []) {
		Inhert supobj= new Inhert();
		sub subobj = new sub();
		
		
		supobj.i = 1000;
		supobj.j = 500;		
		supobj.supshow();
				
	    subobj.a = supobj.i;
		subobj.b = supobj.j;
		subobj.m = 2500;
		subobj.subshow();	
		subobj.allshow();

		}
	}



