import java.util.ArrayList;
import java.util.Scanner;

public class gimnasio {

    private static Scanner leer = new Scanner(System.in);
    private static gymCRUD gym = new gymCRUD();

    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;
        int cedula = 0;
        int cubiculo = leer.nextInt();
        int casillero = leer.nextInt();
        String matriz[][] = new String[cubiculo][casillero];
        String matriz2[][] = new String[cubiculo][casillero];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (i+1) + "," + (j+1);
                matriz2[i][j] = (i+1) + ", " + (j+1);
            }
        }

        boolean c = true;
        while (c){
            int option = leer.nextInt();
            switch (option){
                case 1:
                    fila = 0;
                    columna = 0;
                    boolean a = true;
                    cedula = leer.nextInt();
                    if((cedula <= 99999999) || (cedula >= 1)){
                        //Agrega la cedula a un ArrayLists para verificarla
                        if (gym.verificarCedula(cedula)){
                            System.out.println("La cedula ingresada ya esta registrada");
                            System.exit(0);
                        }else{
                            leer.nextLine();
                            String nombreC = leer.nextLine();
                            String nombre = nombreC.substring(0, nombreC.indexOf(" "));
                            String apellido = nombreC.substring(nombreC.indexOf(" ") + 1, nombreC.length());
                            if(gym.verificarNombre(nombre)){
                                System.out.println("El nombre no cumple con los parametros");
                                System.exit(0);
                            }
                            while(a){
                                if(fila < matriz.length){
                                    if (matriz[fila][columna].length() <= 3){
                                        String datosU = cedula + " " + nombre;
                                        matriz[fila][columna] = nombre;
                                        matriz2[fila][columna] = datosU;
                                        a = false;
                                    }else{
                                        fila += 1;
                                    }
                                }else {
                                    fila = 0;
                                    columna += 1;
                                }
                            }
                            for (int i = 0; i < matriz.length; i++){
                                //toma el numero de columnas de cada fila de la matriz
                                for (int j = 0; j < matriz[i].length; j++){
                                    System.out.println(matriz[i][j] + "\n");
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    int cedulaB = leer.nextInt();
                    if (!gym.borrarUsuario(matriz,matriz2,cedulaB)){

                    }else{
                        System.out.println("Usuario no encontrado, no se realizo la eliminacion");
                    }
                    break;
                case 3:
                    int cedulaE = leer.nextInt();
                    if (gym.buscarUsuario(matriz2, matriz, cedulaE)){
                    }else{
                        System.out.println("Usuario no encontrado");
                    }
                    break;
                case 4:
                    c = false;
                    break;
                default:
                    break;
            }
        }
    }
}