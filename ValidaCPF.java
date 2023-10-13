import java.util.*;

public class ValidaCPF{

	public static boolean isCPF(String cpf){

		//VALIDANDO SE O CPF INSERIDO SÃO REPETIÇÕES
		if(cpf.equals("00000000000") || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") ||
		   cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") || cpf.equals("77777777777") ||	
		   cpf.equals("88888888888") || cpf.equals("99999999999")){return(false);}

		//VALIDANDO ENTRADA APENAS COM NÚMEROS
		if(cpf.length() == 11){
		
			for(int i = 0; i < 11; i++){
				
				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}
			}
		
		//VALIDANDO ENTRADA COM OS SEPARADORES
		}else if(cpf.length() == 14){
			
			//VALIDANDOS OS CARACTERES QUE SEPARAM OS NÚMEROS
			if(cpf.charAt(3) == '.' || cpf.charAt(7) == '.' || cpf.charAt(3) == ' ' || cpf.charAt(7) == ' '){
				
			}else{return(false);}

			//VALIDANDO O CARACTERE QUE SEPARAM OS 2 ÚLTIMOS DÍGITOS DO RESTO
			if(cpf.charAt(11) == ' ' || cpf.charAt(11) == '/' || cpf.charAt(11) == '-'){

			}else{return(false);}

			//VALIDANDO SE OS 3 PRIMEIROS DÍGITOS SÃO NÚMEROS
			for(int i = 0; i < 3; i++){

				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

			}

			//VALIDANDO SE OS 3 DÍGITOS DO MEIO SÃO NÚMEROS
			for(int i = 4; i < 7; i++){

				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

			}

			//VALIDANDO SE OS 3 ÚLTIMOS DÍGITOS SÃO NÚMEROS
			for(int i = 8; i < 11; i++){

				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

			}

			//VALIDANDO SE OS 2 ÚLTIMOS DÍGITOS SÃO NÚMEROS
			for(int i = 12; i <= 13; i++){

				if(Character.isDigit(cpf.charAt(i)) == false){
				
					return(false);
			
				}

			}

		//VALIDANDO ENTRADAS COM TAMANHOS ERRADOS	
		}else{return(false);}
	
			//VALIDANDO OS DÍGITOS DE VERIFICAÇÃO
			
				
			
			return(true);

		}	
	
	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		String cpf;

		System.out.print("Digite o CPF: ");
		cpf = input.nextLine();

		System.out.println(isCPF(cpf));
		input.close();

	}

}
