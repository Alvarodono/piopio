import java.io.File;


public class Main
{
	
	public static void main(String[] args)
	{
		
		Tablero.getTablero().imprimirTablero();
		
		Reloj.getReloj().ponerACero();
		Reloj.getReloj().imprimirHoraActual();
		
		String dirActual = System.getProperty("user.dir");
		System.out.println("\n\n\nDirectorio actual: " + dirActual);
		String path = dirActual + File.separator + "datos.txt";
		System.out.println("\nPath: " + path);
		
		
		GestorFicheros.getGestorFicheros().escribirEnFicheroHolaMundo(path);
		GestorFicheros.getGestorFicheros().imprimirDatos(path);
		
		
		System.out.println("\n\n\nPausa de 3 segundos...");
		Reloj.getReloj().pausar(3);
		
		String nombre = Teclado.getTeclado().leerString("Escribe tu nombre: ");
		
		int nSegs = Reloj.getReloj().obtenerSegundosTranscurridos();
		System.out.println("Hola " + nombre + ". Han transcurrido " + nSegs + " segundos.");
		
		for (int tiradaObjetivo = 1; tiradaObjetivo<=6; tiradaObjetivo++)
		{
			int tirada = Dado.getDado().tirarDado();
			int cont = 1;
			
			while (tirada != tiradaObjetivo)
			{
				cont++;
				tirada = Dado.getDado().tirarDado();
			}
			System.out.println("Tirada de dado: " + tiradaObjetivo + " ha requerido " + cont + " lanzamientos.");
		}
		
		int tiradaTrucada = Dado.getDado().tirarDadoTrucado();
		System.out.println("Tirada del dado: " + tiradaTrucada);
		
		System.out.println("Baraja al principio\n");
		Baraja.getBaraja().imprimirBaraja();
		Baraja.getBaraja().barajar();
		
		System.out.println("\nBaraja tras ser barajada\n");
		Baraja.getBaraja().imprimirBaraja();
		
		Baraja.getBaraja().colocarCarta("As", "Oros", 0);
		System.out.println("\nBaraja tras mover el as de oros a la primera posicion\n");
		Baraja.getBaraja().imprimirBaraja();
		
		
		nSegs = Reloj.getReloj().obtenerSegundosTranscurridos();
		System.out.println("Han transcurrido " + nSegs + " segundos.");

	}

}
