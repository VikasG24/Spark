
package org.viv.encap;

public class encaps_out {
	
	public static void main(String[] args) {
							
			  encaps obj = new encaps();
		 
		        obj.setcName("Ram");
		        obj.setcustBal(10000);
		        obj.setcustacNo("KS00821");
		        System.out.println("Customer A/c No  : " + obj.getcustacNo());
		        System.out.println("Customer Name    : " + obj.getcName());
		        System.out.println("Customer Balance : " + obj.getcustBal());
			 }
	 }

package org.viv.encap;

public class encaps {

	     private String custName;  
		 private String custacNo;  
		 private int    custBal;  
		  
		 public String getcName() {  
		  return custName;  
		 }  
		  
		 public void setcName(String custName) {  
		  this.custName = custName;  
		 }  
		  
		 public String getcustacNo() {  
		  return custacNo; 
		 }  
		  
		 public void setcustacNo(String custacNo) {  
		  this.custacNo = custacNo;  
		 }  
		  
		 public int getcustBal() {  
		  return custBal;  
		 }  
		  
		 public void setcustBal(int custBal) {  
		  this.custBal = custBal;  
		 } 
		 
	}

		
		

		





