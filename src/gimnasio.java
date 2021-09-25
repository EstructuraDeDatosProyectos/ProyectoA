import java.util.ArrayList;
import java.util.Scanner;

public class gimnasio {

    private static Scanner leer = new Scanner(System.in);
    private static gymCRUD gym = new gymCRUD();

    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;
        System.out.println("cubiculo:");
        int cubiculo = leer.nextInt();
        System.out.println("casillero");
        int casillero = leer.nextInt();
        String matriz[][] = new String[cubiculo][casillero];
        System.out.println(matriz.length);
        boolean c = true;
        while (c){
            System.out.println("Opcion");
            int option = leer.nextInt();
            switch (option){
                case 1:
                    boolean a = true;
                    System.out.println("cedula");
                    int cedula = leer.nextInt();
                    if((cedula <= 99999999) || (cedula >= 1)){
                        //Agrega la cedula a un ArrayLists para verificarla
                        if (gym.verificarCedula(cedula)){
                            System.out.println(gym.verificarCedula(cedula));
                            System.out.println("La cedula ingresada ya esta registrada");
                            c = false;
                        }else{
                            System.out.println("nombre completo");
                            leer.nextLine();
                            String nombreC = leer.nextLine();
                            String nombre = nombreC.substring(0, nombreC.indexOf(" "));
                            String apellido = nombreC.substring(nombreC.indexOf(" ") + 1, nombreC.length());
                            if(gym.verificarNombre(nombre)){
                                System.out.println("El nombre no cumple con los parametros");
                            }
                            while(a){
                                if(fila < matriz.length){
                                    if (matriz[fila][columna] == null){
                                        String datosU = nombre + " " + cedula;
                                        String datosUN = datosU.substring(0, datosU.indexOf(" "));
                                        matriz[fila][columna] = datosUN;
                                        fila += 1;
                                        a = false;
                                    }else{
                                        columna += 1;
                                    }
                                }else {
                                    fila = 0;
                                }
                            }
                            for (int i = 0; i < matriz.length; i++){
                                //toma el numero de columnas de cada fila de la matriz
                                for (int j = 0; j < matriz[i].length; j++){
                                    System.out.println(matriz[i][j]);
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    int cedulaB = leer.nextInt();

            }
        }
    }
}
