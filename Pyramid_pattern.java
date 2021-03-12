package pattern_programs;

public class Pyramid_pattern {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++) {// rows 
			
			for(int j=4; j>=i; j--) {//columns
				
				System.out.print(" "); //removing sapces
			}
			
			for(int k=1; k<=i; k++) { //pattern
				
				System.out.print("*");
			}
			
			for(int a=2; a<=i; a++) { //second pyramid starts from 2nd row
				
				System.out.print("*");	
			}
			
			System.out.println();
		}
	}

}
