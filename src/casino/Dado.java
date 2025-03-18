package casino;

import java.util.Arrays;
import java.util.Random;

public class Dado {
	private int lanzamiento;
	private int caras;
	private int[] historicoDeLanzamientos;

	public Dado(int caras, int elementosDelHistorico) {
		this.caras = caras;
		historicoDeLanzamientos = new int[elementosDelHistorico];
	}

	// mostrar histórico
	public void mostrarHistorico() {
		for (int tirada : historicoDeLanzamientos) {
			if (tirada != 0) {
				System.out.printf("%d ", tirada);
			}
		}
	}

	// lanzar dado
	public int lanzar() {
		Random random = new Random();
		lanzamiento = random.nextInt(caras);

		for (int i = 1; i < historicoDeLanzamientos.length; i++) {
			historicoDeLanzamientos[i - 1] = historicoDeLanzamientos[i];
		}
		historicoDeLanzamientos[historicoDeLanzamientos.length - 1] = lanzamiento;
		return lanzamiento;
	}

	// reset el historico
	public int[] reseteoHistorico() {
		for (int i = 0; i < historicoDeLanzamientos.length; i++) {
			historicoDeLanzamientos[i] = 0;
		}
		return historicoDeLanzamientos;
	}

	// poder lanzarse n veces
	public int[] lanzarNumeroVeces(int n) {
		int[] vecesLanzadas = new int[n];
		for (int i = 0; i < n; i++) {
			Random random = new Random();
			vecesLanzadas[i] = random.nextInt(caras);
		}
		return vecesLanzadas;
	}

	// numero de veces que sale el valor de una cara
	public int vecesUnaCara(int numeroRepetido) {
		int contadorNumeroRepetido = 0;
		for (int tirada : historicoDeLanzamientos) {
			if (tirada == numeroRepetido) {
				contadorNumeroRepetido++;
			}

		}
		return contadorNumeroRepetido;
	}

	// Pruebas
	public static void main(String[] args) {
		Dado d1 = new Dado(6, 10);
		System.out.printf("Comprobaciones de lanzamientos%n");
		System.out.printf("==============================%n");
		for (int i = 0; i < 5; i++) {
			System.out.printf("%d ", d1.lanzar());
		}
		System.out.println();
		System.out.printf("%nHistorico de lanzamientos%n");
		System.out.printf("===========================%n");
		d1.mostrarHistorico();

		System.out.println();
		System.out.printf("%nReseteo del historico%n");
		System.out.printf("=======================%n");
		System.out.println(Arrays.toString(d1.reseteoHistorico()));

		System.out.println();
		System.out.printf("%nLanzar 7 veces%n");
		System.out.printf("================%n");
		System.out.println(Arrays.toString(d1.lanzarNumeroVeces(7)));

		System.out.println();
		System.out.printf("%nContador numero repetido%n");
		System.out.printf("==========================%n");
		System.out.printf("%d ", d1.vecesUnaCara(5));
	}

}
