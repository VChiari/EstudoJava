package DesafiosAleatorios;

import java.util.Arrays;
import java.util.List;

public class ex03 {
    public static void main(String[] args) {
        List<Object> lista = Arrays.asList(1, "Sim", 4);

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

    }
}
