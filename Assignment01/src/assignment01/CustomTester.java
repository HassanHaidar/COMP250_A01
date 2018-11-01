package assignment01;
import java.math.BigInteger;
public class CustomTester {
	
	public static void main(String[] args) throws Exception{
		String s1 = "34568797967563455643765446789708089682215429858421764012964219601298751298451298475129849125864791285712456218758126512847";
		String s2 = "246386385486547486548";
		
		BigInteger N1 = new BigInteger("34568797967563455643765446789708089682215429858421764012964219601298751298451298475129849125864791285712456218758126512847", 10);
		BigInteger N2 = new BigInteger("246386385486547486548", 10);
		
		NaturalNumber n1 = new NaturalNumber(s1, 10);
		NaturalNumber n2 = new NaturalNumber(s2, 10);
		
		/*NaturalNumber sum = n1.plus(n2);
		
		System.out.println(sum.toString());
		
		
		NaturalNumber product = new NaturalNumber(10);
		product = n1.times(n2);
		System.out.println(product.toString());
		
		
		
		NaturalNumber difference = n1.minus(n2);
		
		System.out.println(difference.toString());*/
		
	
		
		NaturalNumber q = n1.divide(n2);
		System.out.println(q.toString());
		
		System.out.println(N1.divide(N2).toString());
		
		
		
	}

}
