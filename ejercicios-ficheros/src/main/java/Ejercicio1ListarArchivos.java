import java.io.File;
import java.util.Scanner;

public class Ejercicio1ListarArchivos {
   public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Directorio a listar: ");
        String ruta = sc.nextLine();

        File carpeta = new File(ruta);

        File[] contenido = carpeta.listFiles();

       System.out.println("Archivos en el directorio " + ruta + ":");
        int contador = 1;
        for (File f : contenido){
            if (f.isFile()){
                System.out.println(contador + "," + f.getName());
                contador++;
            }

        }

    }
}
