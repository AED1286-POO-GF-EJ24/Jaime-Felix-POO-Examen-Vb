package miPrincipal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner( System.in );

        System.out.println("Rectangulo");
        System.out.println("==========");

        System.out.println();

        // Datos del rectanguki
        System.out.print("Proporcione el ancho:");
        System.out.print("Proporcione la altura:");

        try
        {
            // Crear Rectangulo
            Rectangulo r = new Rectangulo( ancho, altura );
            
            // Mostrar los datos del rectangulo
            System.out.println();
        }
        catch (RectanguloException re )
        {
            // Mostrar mensaje de la excepcion
        }
        finally
        {
            entrada.close();
        }
    }
}