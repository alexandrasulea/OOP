package lab;
import java.util.Scanner;


public class MainClass {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	    int inputValue=input.nextInt();
		System.out.println("Valoarea citita de la tastatura este "+inputValue);
		int maxInt=Integer.MAX_VALUE;
		System.out.println(maxInt+1);
		
	//	int minInt=Integer.MIN_VALUE;
	//	System.out.println(minInt-1);
		
	//	float maxFloat=Float.MAX_VALUE;
	//	System.out.println(maxFloat*3);
		
		
	
		//System.out.println(maxFloat/inputValue);
		try {
			System.out.println(maxInt/inputValue);
		}
			catch(ArithmeticException exception) {
				System.out.println("hei,ai introdus o valoare gresita, introdu o valoare noua");
				
				inputValue=input.nextInt();
				
			}
			System.out.println("Noua valoarea "+inputValue);
		}

	}



