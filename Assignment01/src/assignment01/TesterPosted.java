package assignment01;

import java.math.BigInteger;

public class TesterPosted {

	public static void main(String[] args) throws Exception {

		//  You can test the correctness of your NaturalNumber implementation 
		//  by using Java's BigInteger class.  

		//  Here is an example.  
		String s1 = "134324151413451435143514353415035151325252135215023514514252352305135251325123520532152412352350123521351235031245123524";
		String s2 = "321412341204125125132501324124123512352304123545132412350";

		int base = 6;
		//String s1 = "52600";
		//String s2 = "375";

		BigInteger big1 = new BigInteger(s1,base);
		BigInteger big2 = new BigInteger(s2,base);

		NaturalNumber n1 = new NaturalNumber(s1, base);
		System.out.println("n1 is    " + n1);
		NaturalNumber n2 = new NaturalNumber(s2, base);
		System.out.println("n2 is    " + n2);
		System.out.println("");

		//  The BigInteger class uses an 'add' method for addition, but NaturalNumber 
		//  uses 'plus' instead, to avoid confusion with the LinkedList's 'add' method
		//  which inserts an element.

		System.out.print("sum: big1+big2 =        (");
		System.out.println(big1.add(big2).toString(base) + ")_" + base );  // BigInteger
		System.out.print("sum: n1+n2     =        ");
		System.out.println(n1.plus(n2));                     // NaturalNumber
		System.out.println();
		

		//  The BigInteger class uses a 'subtract' method for addition, but NaturalNumber 
		//  uses 'minus' instead.  This name was chosen because it was a better match 
		//  for 'plus'.

		System.out.print("diff: big1-big2 =       (");
		System.out.println(big1.subtract(big2).toString(base)  + ")_" + base );  // BigInteger
		System.out.print("diff: n1-n2     =       ");
		System.out.println(n1.minus(n2));                         // NaturalNumber

		//  The BigInteger class uses a 'multiply' method for addition. NaturalNumber 
		//  uses 'times' instead.  
		System.out.println();

		System.out.print("multiply: big1*big2   = ("  );              // BigInteger
		System.out.print(big1.multiply(big2).toString(base)  );
		System.out.println( ")_" + base);

		System.out.print("multiply: n1*n2       = ");               // NaturalNumber
		System.out.println(n1.times(n2));
		System.out.println();

		System.out.print("slow multiply: n1*n2  = ");               // NaturalNumber
		//System.out.println(n1.slowTimes(n2));
		System.out.println();

		System.out.print("divide: big1/big2     = (");              // BigInteger  
		System.out.println(big1.divide(big2).toString(base)  + ")_" + base);
		
		System.out.print("divide: n1/n2         = ");                 // NaturalNumber
		System.out.println(n1.divide(n2));
		System.out.println();

		//System.out.print("slow divide: n1/n2    = ");               // NaturalNumber
		//	System.out.println(n1.slowDivide(n2));

		/*   mod

		System.out.print("mod = ");
		System.out.println(big1.subtract(big1.divide(big2).multiply(big2)));
		System.out.println(big1.mod(big2));

		 */
	}

}