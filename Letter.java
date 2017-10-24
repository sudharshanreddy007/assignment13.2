package word;
//Package is a grouping of related types providing access protection and name
public class Letter {
		public static void main(String[] args) {


			// TODO Auto-generated method stub
			//Creating a string object 
			 String Str = new String("My-name-is-Sudharshan");
		      System.out.println("Output Value :" );      
		      //Applying for each loop
//The string split() method breaks a given string around matches of the given regular expression.
		      for (String retval: Str.split("-")) {
		         System.out.println(retval);
		      }
		      	//Creating another string 
		         String Str1 = new String("M-y-n-a-m-e-i-s-s-u-d-h-a-r-s-h-a-n");
		         System.out.println("Output value:");
		         //Applying for each loop
		         for(String s:Str1.split("-")){
//
		        	 System.out.println(s);
		         }
		      }
		   }
