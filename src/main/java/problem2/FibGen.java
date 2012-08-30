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
public class FibGen implements Iterable{
	public class FibGenIterator implements Iterator<Long> {
		long oneBack=1;
		long twoBack=0;
		
		private FibGenIterator() {
			
		}

		public boolean hasNext() {
			return true;
		}

		public Long next() {
			long current = oneBack+twoBack;
			twoBack=oneBack;
			oneBack=current;
			return current;
		}

		public void remove() {
			throw new UnsupportedOperationException("Not supported yet.");
		}
	}
	public Iterator<Long> iterator() {
		return new FibGenIterator();
	}
	
}
