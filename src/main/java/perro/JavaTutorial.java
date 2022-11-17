package perro;

public class JavaTutorial{
		static int cost=1200, cost2=1300;
	public static void main(String args[]){
		String c="obet";
		System.out.println(cost);
		System.out.println(c);
		System.out.println(cost2);
		System.out.println(cotizacion(1, 1));
		System.out.println(cotizacion(2, 3));
	}
	static int cotizacion (int num1, int num2){
		return (num1*cost)+(num2*cost2);
	}



}
