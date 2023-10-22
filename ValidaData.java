import java.util.*;

public class ValidaData{

    private static GregorianCalendar dataAtual = new GregorianCalendar();
    private static int ano = dataAtual.get(Calendar.YEAR);

    //MÉTODOS DE VALIDAÇÃO DO DIA
    public static boolean isDay(int dia){

        if(dia < 1 || dia > 31){return(false);}
        return(true);

    }
    public static boolean isDay(String dia){

        int d = Integer.parseInt(dia);
        if(d < 1 || d > 31){return(false);}
        return(true);

    }

    //MÉTODOS DE VALIDAÇÃO DO MÊS
    public static boolean isMonth(int mes){

        if(mes < 1 || mes > 12){return(false);}
        return(true);

    }
    public static boolean isMes(String mes){

        int m = Integer.parseInt(mes);
        if(m < 1 || m > 12){return(false);}
        return(true);

    }

    //MÉTODOS DE VALIDAÇÃO DO ANO
    public static boolean isAno(int ano){

        if(ano < 1900 || ano > ValidaData.ano){return(false);}
        return(true);        
    
    }
    public static boolean isAno(String ano){

        int a = Integer.parseInt(ano);
        if(a < 1900 || a > ValidaData.ano){return(false);}
        return(true);    
    
    }

    /*MAIN
    public static void main(String args[]){

        int ano = 2024;
        String anoS = "2024";

        System.out.println(anoS.getClass().getSimpleName());

    }*/

    
}
