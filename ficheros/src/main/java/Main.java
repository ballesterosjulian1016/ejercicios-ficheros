import controller.FileController;

public class Main {
    public static void main(String[] args){
        FileController controller = new FileController();
        System.out.println("info de folder");
      controller.getInfoFile("folder");
        System.out.println("info de example");
        controller.getInfoFile("example.txt");
    }
}
