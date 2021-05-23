import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual exercício você quer ver? ");
		int exercicio = sc.nextInt();
		
		switch (exercicio) {
		case 1:
			exercicio01();
			break;
		case 2:
			exercicio02();
			break;
		case 3:
			exercicio03();
			break;
		case 4:
			exercicio04();
			break;
		case 5:
			exercicio05();
			break;
		case 6:
			exercicio06();
			break;
		case 7:
			exercicio07();
			break;
		}
		
		sc.close();
	}
	
	public static void exercicio01() {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		for (int i=0; i<=X; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
	
	public static void exercicio02() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i=1; i<=N; i++) {
			int Y = sc.nextInt();
			
			if (Y >= 10 && Y <= 20) {
				in++;
			} else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
	
	public static void exercicio03() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
			double valor3 = sc.nextDouble();
			double mediaPonderada = ((valor1 * 2.0) + (valor2 * 3.0) + (valor3 * 5.0)) / (2.0 + 3.0 + 5.0);
			
			System.out.printf("%.1f\n", mediaPonderada);
		}
		
		sc.close();
	}
	
	public static void exercicio04() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=0; i<=N; i++) {
			double valor1 = sc.nextDouble();
			double valor2 = sc.nextDouble();
					
			if (valor2 == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(valor1 / valor2);
			}
		}
		
		sc.close();
	}
	
	public static void exercicio05() {
		Scanner sc = new Scanner(System.in);
		
		long fatorial = sc.nextLong();
		
		if (fatorial == 0) {
			fatorial = 1;
		} else {
			for (long i=(fatorial - 1); i>=1; i--) {
				fatorial = fatorial * i;
			}
		}
		
		System.out.println(fatorial);
		
		sc.close();
	}
	
	public static void exercicio06() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
	
	public static void exercicio07() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {
			int quadrado = (int) Math.pow(i, 2);
			int cubo = (int) Math.pow(i, 3);
			
			System.out.print(i + " ");
			System.out.print(quadrado + " ");
			System.out.println(cubo);
		}
		
		sc.close();
	}
}
