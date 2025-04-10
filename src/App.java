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
        double valorsalariominimo = 1423500;
        double auxiliotransporte =2000000;
        double cantidadhorasextras = 0;
        double valorhoraextra =0;
        double totalvalorhoraextra =0;

        System.out.println("ingrese el nombre del empleado: ");
        nombreempleado = sc.nextLine();
        System.out.println("ingrese el documento del empleado");
        documentoempledo = sc.nextLine();
        System.out.println("ingrese el dia de descanso solo de lunes a viernes");
        diasdescanso = sc.nextLine();
        System.out.println("ingrese el valor de la hora" );
        valorhora = sc.nextDouble();
        System.out.println("ingrese la cantidad de horas trabajadas" );
        horastrabajadas = sc.nextDouble();

        salariobruto = horastrabajadas * valorhora;
        if(salariobruto <= valorsalariominimo*2){
            auxiliotransporte = 200000;
            bonificacionempleado =salariobruto * 0.1;
        } else {
            auxiliotransporte =0;
            bonificacionempleado = 0;
        } 
        deduccionpensión = salariobruto * 0.04;
        deducciosalud = salariobruto * 0.04;
        if(horastrabajadas > 96){
            cantidadhorasextras = horastrabajadas - 96;
            valorhoraextra = valorhora * 1.25;
            totalvalorhoraextra = cantidadhorasextras * valorhoraextra;
        } else {
            cantidadhorasextras = 0;
            valorhoraextra = 0;
            totalvalorhoraextra = 0;
        }    
        if(horastrabajadas < 24); }
        System.out.println("aun no le puedo pagar trabaje mas; ") 
        } else {
            salarioneto = salariobruto - deduccionpensión - deducciosalud + auxiliotransporte +bonificacionempleado + totalvalorhoraextra;
            system.out.println("el empleado: " + nombreempleado  + "con su indetificacion: " + documentoempleado + "su salario neto es: " 
            + salarioneto + "su salariobutoes: " + salariobruto + "su deducccion por pension es: " +deduccionpensión 
            + auxiliotransporte + "su deduccion por salud es: " + deducciosalud + "su bonificacion es: " + bonificacionempleado + "su auxilio de transporte: "
            + auxiliotransporte + "su total por horas extras: " + totalvalorhoraextra);
    
        }

    }
}
