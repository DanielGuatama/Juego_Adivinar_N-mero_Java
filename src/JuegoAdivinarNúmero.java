import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNúmero {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int generarNumeroAleatorio = new Random().nextInt(100);
        int intentosMaximos = 5;

        for (int intentos = 1; intentos <= intentosMaximos; intentos ++) {
            System.out.println("Intento " + intentos + " Digite un número de 1 a 100");
            int numeroDelusuario = teclado.nextInt();

            if (numeroDelusuario == generarNumeroAleatorio) {
                System.out.println("Haz acertado, ¡Ganaste!");
                break;
            } else if (numeroDelusuario < generarNumeroAleatorio) {
                System.out.println("El número es mayor que " + numeroDelusuario);
            } else {
                System.out.println("El número es menor que " + numeroDelusuario);
            }

            if (intentos == intentosMaximos){
                System.out.println("Lo siento no haz acertado, el número era " + generarNumeroAleatorio );
            }
        }
        teclado.close();
    }
}