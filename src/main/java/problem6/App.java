/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem6;

/**
 *
 * @author kcarter
 */
public class App {
	public static void main(String args[] ) {
		long total1=0;
		long total2=0;
		
		for(long i=1;i<=100;i++) {
			total1+=i;
			total2+=(i*i);
		}
		total1*=total1;
		System.out.println(total1-total2);
	}
}
