import java.util.Scanner;

/**
 * 
 */

/**
 * @author Vlad
 *
 */
public class MyFractionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction();
		Fraction f3 = new Fraction();

		Scanner input = new Scanner(System.in);

		System.out.print("Enter two numbers making a fraction " );
		int n = input.nextInt();
		int d = input.nextInt();
		f1.create(n,d);

		System.out.print("Enter another fraction as two numbers ");
		n = input.nextInt();
		d = input.nextInt();
		f2.create(n,d);

		f3.add(f1,f2);
		f1.display() ;
		System.out.print( " + " );
		f2.display() ;
		System.out.print( " = " );
		f3.display();

		System.out.println();

		f3.subtract(f1,f2);   
		f1.display();                                                                                                                                                                            
		System.out.print( " - " );
		f2.display() ;
		System.out.print( " = " );
		f3.display();

		System.out.println();

		f3.multiply(f1,f2);
		f1.display();                                                                                                                                                                            
		System.out.print( " x " );
		f2.display();
		System.out.print( " = " );
		f3.display();

		System.out.println();

		f3.divide(f1,f2);
		f1.display();                                                                                                                                                                            
		System.out.print( " / " );
		f2.display() ;
		System.out.print( " = " );
		f3.display();
	}

}

