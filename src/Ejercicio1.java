import java.util.ArrayDeque;
import java.util.ArrayList;

public class Ejercicio1 {


    public String invertString(String texto){
        ArrayDeque<Character> pila = new ArrayDeque<>();

        for(char letra : texto.toCharArray()){
            pila.push(letra);
        }
        

        String invertido = "";
        while(!pila.isEmpty()){
            char letra = pila.pop();
            invertido += letra;
        }

        return invertido;
        



    }

    
}
