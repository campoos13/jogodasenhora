package testezin.Models;

import testezin.enums.OcupanteEnum;
import testezin.interfaces.Jogo;

public class JogoExterno implements Jogo{
    
    private JogoInterno[][] jogo = new JogoInterno[3][3];
    private OcupanteEnum vencedor = null;

    public JogoExterno(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j<3;j++){
                jogo[i][j] = new JogoInterno();
            }
//            jogo[i/3][i%3] = new Casa();
        }
    }

    public Jogo[][] getJogo(){
        return jogo;
    }

    public OcupanteEnum getVencedor(){
        return vencedor;
    }

    public void setVencedor(OcupanteEnum vencedor){
        this.vencedor=vencedor;
    }

    public boolean isGameOver(){ // Deixar legivel
        if (jogo[0][0].getVencedor() == jogo[0][1].getVencedor() && jogo[0][1].getVencedor() == jogo[0][2].getVencedor()) {
            return true;   
        }
        else if (jogo[1][0].getVencedor() == jogo[1][1].getVencedor() && jogo[1][1].getVencedor() == jogo[1][2].getVencedor()) {
            return true;
        }
        else if (jogo[1][0].getVencedor() == jogo[2][1].getVencedor() && jogo[2][1].getVencedor() == jogo[2][2].getVencedor()) {
            return true;
        }
        else if (jogo[0][0].getVencedor() == jogo[1][0].getVencedor() && jogo[1][0].getVencedor() == jogo[2][0].getVencedor()) {
            return true;
        }
        else if (jogo[0][1].getVencedor() == jogo[1][1].getVencedor() && jogo[1][1].getVencedor() == jogo[2][1].getVencedor()) {
            return true;
        }
        else if (jogo[0][2].getVencedor() == jogo[1][2].getVencedor() && jogo[1][2].getVencedor() == jogo[2][2].getVencedor()) {
            return true;
        }
        else if (jogo[0][0].getVencedor() == jogo[1][1].getVencedor() && jogo[1][1].getVencedor() == jogo[2][2].getVencedor()) {
            return true;
        }
        else if (jogo[0][2].getVencedor() == jogo[1][1].getVencedor() && jogo[1][1].getVencedor() == jogo[2][0].getVencedor()) {
            return true;
        }
        return false;
    }

    public void jogadaDaVez(OcupanteEnum jogadorDaVez,JogoInterno jogoInt){
        if (jogoInt.getVencedor()==null && jogoInt.isGameOver()){
            jogoInt.setVencedor(jogadorDaVez);
        }
    }   

}
