package day1;

public class Arrays {

	public static void main(String[] args) {
		
		
		/*int a=10;
		int b=20;
		int c, d, e;
		c=30, d=40, e=50;
		
		int a1=10;
		int a2=20; */
		
		int[] a={10, 20, 30, 40, 50};
		System.out.println(a[2] + " " + a[4]);
	//__________________________________________________	
		//enhanced for
		
		for(int temp :a){
			System.out.println(temp);
		}
		System.out.println("_____________");
		System.out.println("thank you");
		
		
	//____________________________________________________	
		int[] x= new int[5];
		x[3] =25;
		x[0] =12;
		
		for(int temp2:x){
			System.out.println(temp2);
		}
	//____________________________________________________
		
		System.out.println("_____________");
		String[] stx = new String[5];
		
		stx[3]="25";
		stx[0]="12";
		
		for(String temp1:stx){
			System.out.println(temp1);
			
		}

	}

}
