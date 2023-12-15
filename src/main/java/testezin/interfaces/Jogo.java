package testezin.interfaces;

import testezin.enums.OcupanteEnum;

public interface Jogo {

    OcupanteEnum getVencedor();

    void setVencedor(OcupanteEnum vencedor);

    boolean isGameOver();

    <T> T getJogo();
}
