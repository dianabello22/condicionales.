import java.util.Scanner;

 public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner (System.in);
        String nombreempleado ="";
        String documentoempledo ="";
        String diasdescanso ="";
        double salariobruto =0;
        double salarioneto =0;
        double deduccionpensión =0;
        double deducciosalud =0;
        double horastrabajadas =0;
        double valorhora =0;
        double bonificacionempleado =0;
        double salariominimo =1423500;
        double auxiliotransporte =2000000;
        double cantidadhorasextras = 0;
        double valorhoraestra =0;

        System.out.println("ingrese el nombre del empleado: ");
        nombreempleado = sc.nextLine();
        System.out.println("ingrese el documento del empleado");
        documentoempledo = sc.nextLine();
        System.out.println("ingrese el dia de descanso solo de lunes a viernes");
        
    }
}
