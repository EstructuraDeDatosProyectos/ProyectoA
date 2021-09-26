import java.util.ArrayList;

public class gymCRUD {

    private ArrayList<Integer> cedu = new ArrayList<>();

    public boolean verificarCedula(int cedula){
        boolean resul = false;
        cedu.add(cedula);
        System.out.println("gymCRUD " + cedu.toString());
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

        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz2[i].length; j++){
                String matrizS = matriz2[i][j].substring(matriz2[i][j].indexOf(" ") + 1, matriz2[i][j].length());
                int matrizI = Integer.parseInt(matrizS);
                if (matrizI == cedula){
                    estadoU = false;
                }
            }
        }
        return estadoU;
    }
}
