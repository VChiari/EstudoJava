package oo.heranca;

public class Heroi extends Jogador {

    Heroi(int x, int y){
        super(x,y);
    }


    boolean atacar(Jogador oponente) {
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }

    public static class Jogo {
        public static void main(String[] args) {

            Monstro monstro = new Monstro();
            monstro.x = 10;
            monstro.y = 10;

            Heroi heroi = new Heroi(10,11);

            System.out.println("Monstro tem => " + monstro.vida);
            System.out.println("Heroi tem => " + heroi.vida);

            monstro.atacar(heroi);
            heroi.atacar(monstro);

            monstro.atacar(heroi);
            heroi.atacar(monstro);

            monstro.andar(Direcao.NORTE);
            monstro.atacar(heroi);
            heroi.atacar(monstro);

            System.out.println("Monstro tem => " + monstro.vida);
            System.out.println("Heroi tem => " + heroi.vida);
        }
    }
}
