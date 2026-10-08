public class Fermat {
	public static void main (String[] args) {
		int n = (int) (Math.random()*);
		int a = (int) (Math.random()*100);
		int b = (int) (Math.random()*100);
		int c = (int) (Math.random()*100);
		
		if (n > 2 && Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
			System.out.println ("Holy smokes, Fermat was wrong!");
		} else {
			System.out.println ("No, that doesn’t work.");	
		}	
	}
}

