import java.util.ArrayList;

public class gymCRUD {

    public boolean verificarCedula(ArrayList<Integer> cedula){
        boolean resul = false;
        if (cedula.size() >= 2){
            for (int i = 0; i < cedula.size()-1; i++){
                for (int j = i; j < cedula.size(); j++){
                    if ((cedula.get(i) == cedula.get(j)) && (i != j)){
                        resul = true;
                    }
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
}
