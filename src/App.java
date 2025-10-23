import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué tipo de billete desea comprar?");
        int tipoMagnetico = sc.nextInt();
        System.out.println("¿Cuál es el nombre del billete?");
        String nombre = sc.next();
        System.out.println("¿Qué tipo de billete es?");
        String tipo = sc.next();
        System.out.println("¿De qué papel está hecho?");
        String papel = sc.next();
        System.out.println("¿Cuál es el valor del billete?");
        int valor = sc.nextInt();

        Billete billete = new Billete(tipoMagnetico, nombre, tipo, papel, valor);
        System.out.println("Billete creado: " + billete.getNombre());

    }
}

