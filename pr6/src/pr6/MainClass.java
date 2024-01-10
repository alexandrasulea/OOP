package pr6;
import java.math.BigInteger;

public class MainClass {

	public static void main(String[] args) {
		BigInteger suma=BigInteger.ZERO;
		for( int i=1; i<=64;i++)
			
		{   
			BigInteger variabila=BigInteger.ONE;
			for( int j=1; j<=i-1;j++)
			{ 
				variabila=variabila.multiply(BigInteger.valueOf(2));
		    }
			suma=suma.add(variabila);
		   
		}
		System.out.println("Suma este "+suma);

	}

}
