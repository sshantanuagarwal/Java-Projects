package org.ds.arrays;

public class TowerOfHanoi {
	void toh( char a, char b, char c, int n ) {
		if( n == 1 ) {
			System.out.println( "Move disk 1 from " + a + " to " + c );
			return;
		}
		
		toh( a, b, c, n-1);
		System.out.println( "Move disk " + n + " from " + a + " to " + b );
		toh( a, c, b, n-1 );
	}
	public static void main(String[] args) {
		TowerOfHanoi hot = new TowerOfHanoi();
		hot.toh( 'A', 'C', 'B', 4 );
	}
}
