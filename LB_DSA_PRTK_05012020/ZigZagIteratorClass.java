package org.ds.arrays;


public class ZigZagIteratorClass {

	int[] v1 = { 1, 2, 3, 4 };
	int[] v2 = { 5, 6, 7, 8, 9, 10 };
	int runUntil = v1.length + v2.length;
	int i = 0;

	boolean hasNext() {
		// 1-10
		return i < runUntil;
	}

	int next() {
		i++;
		int countofZigzag = Math.min(v1.length, v2.length); // 4
		int maxLength = Math.max(v1.length, v2.length); // 6
		
		if( i <= countofZigzag *2 ) {
			// 8
			if (i % 2 == 1) {
				return v1[i / 2];
			} else {
				return v2[(i / 2) - 1];
			}
			
		} else {
			// 2
			if (v1.length == maxLength) {
				// Read from v1
				return v1[i - countofZigzag -1];
			} else {
				// Read from v2
				return v2[i - countofZigzag - 1];
			}
		}

	}
	public static void main(String[] args) {
		ZigZagIteratorClass iterator = new ZigZagIteratorClass();
		while(iterator.hasNext())
			System.out.print("\t" + iterator.next() + "");
	}
}