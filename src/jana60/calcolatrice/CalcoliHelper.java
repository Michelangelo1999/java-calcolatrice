package jana60.calcolatrice;

public class CalcoliHelper {
	
	private CalcoliHelper() {}
	
	public static double somma(double x, double y) {
		return x+y;
	}
	
	public static double differenza(double x, double y) {
		if(x > y) {
			return x-y;
		}else {
			return y-x;
		}
	}
	
	public static double prodotto(double x, double y) {
		return x*y;
	}
	
	public static double modulo(double x) {
		if(x < 0) {
			return -x;
		}else {
			return x;
		}
	}
	
	public static double min(double x, double y) {
		if(x < y) {
			return x;
		}else {
			return y;
		}
	}
	
	
	
	public static double max(double x, double y ) {
		if(x < y) {
			return y;
		}else {
			return x;
		}
	}
	
	public static double potenza(double base, int esp) {
		if (esp >= 0) {
			
			if (esp == 0) {
				return 1;
			}
			if (esp == 1) {
				return base;
			}
			return base * potenza(base, esp - 1);
			
		}else {
			
			if (esp == -1) {
				return 1/base;
			}
			return 1/base * potenza(base, esp + 1);
		}
	}
	
	
	//overloading
	public static int max(int x, int y) {
		return (int)max((double)x, (double)y);
	}
	
	public static int min(int x, int y) {
		return (int)min((double)x, (double)y);
	}
	
	public static int somma(int x, int y) {
		return (int)somma((double)x, (double)y);
	}
	
	public static int differenza(int x, int y) {
			return (int)differenza((double)x, (double)y);
	}
	
	public static int prodotto(int x, int y) {
		return (int)prodotto((double)x, (double)y);
	}
	
	public static int modulo(int x) {
		return (int)modulo((double)x);
	}
	
	
	//Bonus++, provo i fattoriali
	public static int fattoriale(int x) {
		if(x == 1) {
			return 1;
		}
		
		return x * fattoriale(x-1);
	}

}
