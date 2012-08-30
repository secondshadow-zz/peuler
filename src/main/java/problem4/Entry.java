/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

/**
 *
 * @author kcarter
 */
public class Entry {
	public static void main(String args[]){ 
		int rhs=0,lhs=0,res=0;
		for(int i=999;i>=100;i--) {
			for(int j=999;j>=100;j--){
				String str = Integer.toString(i*j);
				StringBuilder sb = new StringBuilder(str);
				if(sb.reverse().toString().equals(str) && (i*j)>res){
					rhs=i;
					lhs=j;
					res=i*j;
				}
			}
		}
		System.out.println(lhs + " * " + rhs +" = " + res);
	}
}
