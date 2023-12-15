package testezin.Models;

import testezin.enums.OcupanteEnum;

public class Jogador {
    private OcupanteEnum simbolo;

    public Jogador(OcupanteEnum simbolo){
        this.simbolo=simbolo;
    }

    public OcupanteEnum getSimbolo(){
        return simbolo;
    }
}
