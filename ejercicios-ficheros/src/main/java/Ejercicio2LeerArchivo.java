import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio2LeerArchivo {
   public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in) ;

        System.out.print("Introduce la ruta del archivo: ");
        String ruta = sc.nextLine();
        File archivo = new File(ruta);

       if (!archivo.exists() || !archivo.isFile()) {
           System.out.println("El archivo no existe");
           return;
       }
       System.out.println("Contenido del archivo:");
       try (Scanner lector = new Scanner(archivo)) {
           while (lector.hasNextLine()) {
               String linea = lector.nextLine();
               System.out.println(linea);
           }
       } catch (FileNotFoundException e) {
           System.out.println("No se pudo abrir el archivo");
       }

    }
}
