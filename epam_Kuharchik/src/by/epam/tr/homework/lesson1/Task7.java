package by.epam.tr.homework.lesson1;

public class Task7 {
	
	public static void function(double a, double b, double h) {
		double x = a;
		double F = 0;
		System.out.println("         x            F");
		while (x <= b)
		{
			F = Math.pow(Math.sin(x), 2) - Math.cos(2*x);  
			System.out.printf("%+11.2f%+15.6f\n", x,F);
			x += h;
		}
	}

	public static void main(String[] args) {
		double a = 0;
		double b = 100;
		double h = 5;
		function(a, b, h);
	}
}