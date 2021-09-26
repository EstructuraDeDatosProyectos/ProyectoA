import java.util.ArrayList;

public class gymCRUD {

    private ArrayList<Integer> cedu = new ArrayList<>();

    public boolean verificarCedula(int cedula){
        boolean resul = false;
        cedu.add(cedula);
        for (int i = 0; i < cedu.size(); i++){
            for (int j = 0; j < cedu.size(); j++){
                if ((cedu.get(i)==cedu.get(j)) && (i != j)){
                    resul = true;
                }
            }
        }
        return resul;
    }

    public boolean verificarNombre(String nombre){
        boolean resul = false;
        if ((nombre.length() >= 50) || (nombre.length() <= 1)){
            resul = true;
        }
        return resul;
    }

    public boolean borrarUsuario(String matriz[][], String matriz2[][], int cedula){
        boolean estadoU = true;
        for (int i = 0; i < cedu.size(); i++){
            if (cedu.get(i) ==  cedula) {
                cedu.remove(i);
            }
        }
        String matrizS = "";
        String matrizNombre = "";
        String cedulaS = "";
        int i,j = 0;
        for(i = 0; i < matriz2.length; i++){
            for (j = 0; j < matriz2[i].length; j++){
                matrizS = matriz2[i][j].substring(0, matriz2[i][j].indexOf(" "));
                cedulaS = String.valueOf(cedula);
                if (matrizS.equals(cedulaS)){
                    matrizNombre = "Se elimino " + matriz[i][j] + " de cubiculo " + (i+1) + " y casillero " + (j+1);
                    matriz[i][j] = (i+1) + "," + (j+1);
                    matriz2[i][j] = (i+1) + ", " + (j+1);
                    estadoU = false;
                }
            }
        }
        System.out.println(matrizNombre);
        for (int k = 0; k < matriz.length; k++){
            for (int l = 0; l < matriz[k].length; l++){
                System.out.println(matriz[k][l]);
            }
        }
        return estadoU;
    }

    public boolean buscarUsuario(String matriz[][], String matriz2[][], int cedula){
        boolean encontrado = false;
        String usuarioEncontrado = "";
        String cedulaS = "";
        String matrizS = "";
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matrizS = matriz[i][j].substring(0, matriz[i][j].indexOf(" "));
                cedulaS = String.valueOf(cedula);
                if (matrizS.equals(cedulaS)){
                    usuarioEncontrado = matriz2[i][j] + " esta ubicado en cubiculo " + (i+1) + " y casillero " + (j+1);
                    encontrado = true;
                }
            }
        }
        System.out.println(usuarioEncontrado);
        return encontrado;
    }
}
