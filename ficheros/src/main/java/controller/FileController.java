package controller;

import java.io.File;
import java.io.IOException;

public class FileController {

    private final String basePath= "src/main/java/files/";

    public void getInfoFile(String path)  {
        File file= new File(basePath+path);


            if (!file.exists()){
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("Error en tarea de IO");
                }

            }else{
                System.out.println("existe " +file.exists());
                System.out.println("se puede escribir " +file.canWrite());
                System.out.println("se puede leer " +file.canRead());
                System.out.println("existe " + file.getAbsolutePath());
                File[] ficheros = file.listFiles();
                if(file.isDirectory()){
                    for(File item: ficheros){
                        System.out.println(item.getAbsolutePath());

                    }
                }
            }




        }


    }

