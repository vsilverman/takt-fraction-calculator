/**
 * 
 */

/**
 * @author Vlad
 *
 */
public class Fraction {

	private int num=0;
	private int denom=1;

	// helper function - for auto testing
	// initializes fraction with
	// up parameter as numerator,
	// down parameter as denominator.
	// returns 0 if no error
	public int create( int up, int down ) {
	     int errorCode = 0;
	     if (down == 0)
	    	 errorCode = -1;
	     else {
	    	 if (down < 0) {
	    		 up = up * -1;
	    		 down = down * -1;
	    	 }
	    	 num = up;
	    	 denom = down;
	     }

	     return errorCode;
	}

	public void display() {
		if (num > denom)
			System.out.print(num/denom + " " + num%denom + "/" + denom);
		else
			System.out.print( num + "/" + denom );
	}

	// reduce to lowest terms
	public void simplify()	{
		// use Euclidean algorithm to find gcd
		int gcd = GreatestCommonDivisor(num, denom);
		num /= gcd;
		denom /= gcd;
	}

	//Euclidean algorithm
	private int GreatestCommonDivisor(int A, int B)  {
		int a = Math.abs (A);
		int b = Math.abs (B);
		int temp = a % b;

		while (temp > 0) {
			a = b;
			b = temp;
			temp = a % b;
		}

		return b;
	}

	// adds two fractions to produce third in
	// simplified form
	public void add( Fraction f1, Fraction f2 )	{
		denom = f1.denom*f2.denom;
		num = (f1.num*f2.denom) + (f2.num*f1.denom);
		simplify();
	}

	public void subtract( Fraction f1, Fraction f2 ) {
		denom = f1.denom*f2.denom; 
		num = (f1.num*f2.denom) - (f2.num*f1.denom);
		simplify();
	}

	public void multiply( Fraction f1, Fraction f2 ) {
		denom = f1.denom*f2.denom; 
		num = f1.num*f2.num;
		simplify();
	}

	public void divide( Fraction f1, Fraction f2 ) {
		denom = f1.denom*f2.num; 
		num = f1.num*f2.denom;
		simplify();
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		Fraction f3 = new Fraction();
		
		f1.create(1,2);   // fl is 1/2
		f2.create(1,4);   // f2 is 1/4
		f3.add(f1,f2);
		f1.display() ;
		System.out.print( " + " );
		f2.display() ;
		System.out.print( " = " );
		f3.display();
	}

}
