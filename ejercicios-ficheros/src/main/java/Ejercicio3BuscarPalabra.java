import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3BuscarPalabra {

   public  static void main(String[] args)  {

       Scanner sc = new Scanner(System.in);
       System.out.print("introduce la ruta: ");
       String ruta = sc.nextLine();
       System.out.print("palabra a buscar: ");
       String palabra = sc.nextLine();
       File archivo = new File(ruta);

       if(!archivo.exists()|| !archivo.isFile()){
           System.out.println("el archivo no existe");
           return;
       }
       int veces = 0;
       try (Scanner lector = new Scanner(archivo)) {
           while (lector.hasNextLine()){
               String linea = lector.nextLine();
               String[]palabras = linea.split(" ");
               for (String p : palabras){
                   if (p.equalsIgnoreCase(palabra)){
                       veces++;
                   }
               }


           }
       } catch (FileNotFoundException e) {
           System.out.println("No se pudo abrir el archivo");
       }
       System.out.println("La palabra " + palabra + " aparece " + veces + " veces en el archivo.");


   }


}
