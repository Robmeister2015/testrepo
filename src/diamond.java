
public class diamond {

	 public static void main(String[] args) {
		
		 diamond();
		internalDiamond();
		
		
		 
	 }
	 
	 public static void diamond(){
		 
		 for(int i = 1; i < 10; i ++){
			 for(int j = 0; j < 10 - i; j ++){
				 System.out.print(" ");
			 }
			 for(int k = 1; k < i * 2; k ++){
				 System.out.print("*");
			 }
			 System.out.println();
			 }
			 
			 for(int i = 10; i > 0; i --){
				 for(int j = 10; j > i; j --){
					 System.out.print(" ");
				 }
				 for(int k = 1; k < i * 2; k ++){
					 System.out.print("*");
				 }
				 System.out.println();
				 }
		 
	 }
	 
	 public static void internalDiamond(){
		 
		 for(int i = 1; i < 10; i ++){
			 for(int j = 0; j < 10 - i; j ++){
				 System.out.print("*");
			 }
			 for(int k = 1; k < i * 2; k ++){
				 System.out.print(" ");
			 }
			 for(int j = 0; j < 10 - i; j ++){
				 System.out.print("*");
			 }
			 System.out.println();
			
			 }
			 
			 for(int i = 9; i > 0; i --){
				 for(int j = 10; j > i; j --){
					 System.out.print("*");
				 }
				 for(int k = 1; k < i * 2; k ++){
					 System.out.print(" ");
				 }
				 
				 for(int j = 10; j > i; j --){
					 System.out.print("*");
				 }
				 System.out.println();
				 }
		 
	 }
	
}
