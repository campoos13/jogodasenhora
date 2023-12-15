package testezin.Models;

import testezin.enums.OcupanteEnum;

public class Casa {
    private OcupanteEnum ocupante;

    public Casa(){}
    
    public void DefineOcupante(OcupanteEnum ocupante){
        this.ocupante=ocupante;
    }

    public OcupanteEnum getOcupante(){
        return ocupante;
    }
    

}
