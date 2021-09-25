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

    public boolean borrarUsuario(){
        boolean estadoU = true;
        for(int i = 0; i < cedu.size(); i++){

        }
        return estadoU;
    }
}
