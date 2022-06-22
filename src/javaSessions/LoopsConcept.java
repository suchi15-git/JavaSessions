package javaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			
			i++;
			//++i;
		}
		
		int p=1;
		while(p<=100) {
			System.out.println(p);
			if(p%5 ==0) {
				System.out.println("Hello");
				break;
			}
			p++;
			
		}
		
		System.out.println("--------------------");
		
//		boolean flag = false;
//		while(true) {
//			System.out.println("welcome to taj hotel!");
//		}
//		
		
		System.out.println("----------------");
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
			
		}
		
		//0,2,4,6,8,10
		for(int even=0;even<=10;even=even+2) {
			System.out.println(even);
			
		}
		
		//1,3,5,7,9
		
		
		System.out.println("--------------");
		
	
			
			
			///000 999
			
		for (int a=0; a<10;a++) {
			
			for (int b=0;b<10;b++) {
				
				for (int c=0;c<10;c++) {
					
					System.out.print(a+ "" +b+ "" +c +" ");					
				}
				
				System.out.println();
			}
		
			
		}
		}
		
	
	
		


	}
	

	
	


