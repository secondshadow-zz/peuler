/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem5;

/**
 *
 * @author kcarter
 */
public class App {
	public static void main(String args[]) {
		int[] divisors = buildDivisorArray();
		int step = divisors[divisors.length-1];
		divisors = chomp(divisors);
		long i=-1;
		for(i=step;!div(i,divisors);i+=step);
		System.out.println(i);
	}
	
	private static int[] chomp(int[] arry) {
		int retval[] = new int[arry.length-1];
		System.arraycopy(arry, 0, retval, 0, arry.length-1);
		return retval;
	}

	private static boolean div(long dividend, int[] divisors) {
		boolean retval = true;
		for(int i=0;i<divisors.length && (retval = (dividend%divisors[i]==0));i++);
		return retval;
	}

	private static int[] buildDivisorArray() {
		return new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
	}
}
