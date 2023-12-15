package testezin.Models;

import testezin.enums.OcupanteEnum;

public class Partida {

    private Jogador jogador1;
    private Jogador jogador2;
    private JogoExterno jogo;
    private Jogador jogadorDoTurno;

    public Partida(){
        jogador1 = new Jogador(OcupanteEnum.X);
        jogador2 = new Jogador(OcupanteEnum.O);
        jogo = new JogoExterno();
        jogadorDoTurno = jogador1;
    }

    public void switchPlayerTurn(){
        if (jogadorDoTurno.getSimbolo() == OcupanteEnum.O)jogadorDoTurno = jogador1;
        else jogadorDoTurno = jogador2;
    }

//    public void jogadaDaVez(int x,int y){
//        jogo.jogadaDaVez(jogadorDoTurno.getSimbolo(), jogo.getJogo());
//        if (jogo.getVencedor()==null && jogo.isGameOver()) {
//            jogo.setVencedor(jogadorDoTurno.getSimbolo());
//        }
//    }
}
