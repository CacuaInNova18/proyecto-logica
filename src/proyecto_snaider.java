import java.util.Scanner;

public class proyecto_snaider {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        boolean zona = true;
        System.out.println("ESTE ES EL MENU DESIGNADO PARA TI: ");
        System.out.println("MENU");
        System.out.println("ingrese los siguientes datos designados al orden que se le facilite del menu:");
        System.out.println("1). Nombre y Apellido");
        System.out.println("2). Edad");
        System.out.println("3). Correo Electronico");
        System.out.println("4). Estado Civil");
        System.out.println("5). Nacionalidad");
        System.out.println("6). Profesion");
        System.out.println("7). Telefono");
        System.out.println("8). Tipo de Sangre");
        System.out.println("INFORMACION ADICIONAL: ");
        System.out.println("Si deseas salir ingresa el codigo: 9");
        System.out.println("___________INGRESA OPCION___________");
        int num = captura.nextInt();
        while (zona) {
            if (num == 1) {
                System.out.println("Primer Nombre: ");
                String nombre1 = captura.next();
                System.out.println("Segundo Nombre: ");
                String nombre2 = captura.next();
                System.out.println("Primer Apellido: ");
                String apellido1 = captura.next();
                System.out.println("Segundo Apellido: ");
                String apellido2 = captura.next();
                System.out.println("Su nombre es: "+ nombre1 +" "+ nombre2 +" "+ apellido1 +" "+ apellido2 );
                break;
            } else if (num == 2) {
                System.out.println("Ingrese su Edad");
                int edad = captura.nextInt();
                System.out.println("Tienes:"+ edad);
            } if (num == 3) {
                System.out.println("Ingrese su Correo Electronico");
                String correo = captura.next();
                System.out.println("Su correo es:"+ correo);
            } if (num == 4) {
                System.out.println("¿En que estado civil se encuentra actualmente");
                String Estado = captura.next();
                System.out.println("Su estado civil es: "+ Estado);
            } if (num == 5) {
                System.out.println("NACIONALIDAD");
                System.out.println("1). ¿De que pais eres");
                String pais = captura.next();
                System.out.println("2). ¿De que departamento?");
                String departamento = captura.next();
                System.out.println("3). ¿De que lugar?");
                String lugar = captura.next();
                System.out.println("Señor/ra del pais:"+ pais +"del departamento: "+ departamento+"del lugar: "+lugar);
            } if (num == 6) {
                System.out.println("PROFESION");
                System.out.println("¿Te dediicas a alguna profesion?__Si/No");
                String VoF = captura.next();
            } if (num == 7) {
                boolean cell = true;
                if (cell) {
                    System.out.println("NUMERO DE TELEFONO");
                    int telefono = captura.nextInt();
                    System.out.println("Su numero de telefono es"+ telefono);
                } else {
                    cell = false;
                    break;
                }
            } if (num == 8) {
                System.out.println("¿Que tipo de sangre es?");
                System.out.println("Si eres (O+) marca 1");
                System.out.println("Si eres (O-) marca 2");
                System.out.println("Si eres (A+) marca 3");
                System.out.println("Si eres (A-) marca 4");
                System.out.println("Si eres (B+) marca 5");
                System.out.println("Si eres (B-) marca 6");
                System.out.println("Si eres (AB+) marca 7");
                System.out.println("Si eres (AB-) marca 8");
                int sangre = captura.nextInt();
                sangre = captura.nextInt();
                if (sangre == 1) {
                    System.out.println(" O+");
                } else if (sangre == 2) {
                    System.out.println(" O- ");
                } else if (sangre == 3) {
                    System.out.println(" A+ ");
                } else if (sangre == 4) {
                    System.out.println(" A- ");
                } else if (sangre == 5) {
                    System.out.println(" B+ ");
                } else if (sangre == 6) {
                    System.out.println(" B- ");
                } else if (sangre == 7) {
                    System.out.println(" AB+ ");
                } else if (sangre == 8) {
                    System.out.println(" AB- ");
                }
            } else if (num == 9){
                System.out.println("HAS ESCOGIDO SALIR...");
                System.out.println("Gracias Por La Informacion Proporcionada");
                break;
            }
        }int i = 0;
        for (i=0;i<2;i++){
            if (i == 1) {
                System.out.println("UN GUSTO TRABAJAR PARA TI");
            } else if (i == 2) {
                System.out.println("ESPERO TENGAS UN MARAVILLOSO DIA");
            }
        }
    }
}