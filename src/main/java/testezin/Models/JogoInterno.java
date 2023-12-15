package testezin.Models;

import testezin.enums.OcupanteEnum;
import testezin.interfaces.Jogo;

public class JogoInterno implements Jogo {
    private Casa[][] jogo = new Casa[3][3];
    private OcupanteEnum vencedor;

    public JogoInterno() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                jogo[i][j] = new Casa();
            }
//            jogo[i/3][i%3] = new Casa();
        }
    }

    public Casa[][] getJogo() {
        return jogo;
    }

    public OcupanteEnum getVencedor() {
        return vencedor;
    }

    public void setVencedor(OcupanteEnum vencedor) {
        this.vencedor = vencedor;
    }

    private boolean checkRow() {
        // Check rows
//        jogo[i][0];
        for (int i = 0; i < 3; i++) {
            if (vencedor == null) {
                if (jogo[i][0].getOcupante() == jogo[i][1].getOcupante() &&
                        jogo[i][1].getOcupante() == jogo[i][2].getOcupante()) {
                    setVencedor(jogo[i][1].getOcupante());
                }
                return true;
            }
        }
        return false;
    }

    private boolean checkColumn() {
        for (int i = 0; i < 3; i++) {
            if (vencedor == null) {
                if (jogo[0][i].getOcupante() == jogo[1][i].getOcupante() &&
                        jogo[1][i].getOcupante() == jogo[2][i].getOcupante()) {
                    setVencedor(jogo[1][i].getOcupante());
                }
                return true;
            }
        }
        return false;
    }

    //
//        jogo[0][0] jogo[1][1] jogo[2][2]
//                                        jogo[0][2] jogo[1][1] jogo[2][0]
    private boolean checkDiagonal() {
        if (jogo[0][0].getOcupante() == jogo[1][1].getOcupante() &&
                jogo[1][1].getOcupante() == jogo[2][2].getOcupante()) {
            setVencedor(jogo[1][1].getOcupante());
            return true;
        }
        if (jogo[0][2].getOcupante() == jogo[1][1].getOcupante() && jogo[1][1].getOcupante() == jogo[2][0].getOcupante()) {
            setVencedor(jogo[1][1].getOcupante());
            return true;
        }

        return false;
    }

//    private boolean checkTie(){
//        for (int i = 0; i < 3 * 3;i++){
//            if(jogo[i/3][i%3]){
//
//            }
//
//        }
//    }

    public boolean isGameOver() {
        if (checkRow()) {
            return true;
        }
        if (checkColumn()) {
            return true;
        }
        if (checkDiagonal()) {
            return true;
        }
//        if (/*checkTie*/) {
//            return true;
//        }
            return false;
        }

    }
