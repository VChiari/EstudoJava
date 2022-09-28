package classe;

public class AreaCirc {
    double raio;
    double pi;
    static int count = 0;

    AreaCirc(double raioInicial){
        pi = 3.14;
        raio = raioInicial;
    }
    AreaCirc(){
        count += 1;
    }

    double area(){
        return raio*raio*pi;
    }
}

