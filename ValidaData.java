import java.util.*;

public class ValidaData{

    //MÉTODOS DE VALIDAÇÃO DO DIA
    boolean isDay(int dia){

        if(dia < 1 || dia > 31){return(false);}
        return(true);

    }
    boolean isDay(String dia){

        int d = Integer.parseInt(dia);
        if(d < 1 || d > 31){return(false);}
        return(true);

    }

    //MÉTODOS DE VALIDAÇÃO DO MÊS
    boolean isMonth(int mes){

        if(mes < 1 || mes > 12){return(false);}
        return(true);

    }
    boolean isMes(String mes){

        int m = Integer.parseInt(mes);
        if(m < 1 || m > 12){return(false);}
        return(true);

    }

    //MÉTODOS DE VALIDAÇÃO DO ANO
    boolean isAno(int anoP){

        return(true);        
    }
    boolean isAno(String anoP){

        return(true);   
    }

    //MAIN
    public static void main(String args[]){


    }

}
