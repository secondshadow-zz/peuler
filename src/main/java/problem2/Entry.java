/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem2;

import java.util.Iterator;

/**
 *
 * @author kcarter
 */
public class Entry {
	public static void main(String args[]) {
		long var=-1;
		long sum=0;
		Iterator<Long> itr = new FibGen().iterator();
		while((var=itr.next())<4000000) {
			if(var%2==0) {
				sum+=var;
			}
		}
		System.out.println(sum);
	}
}
