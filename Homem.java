public class Homem extends Pessoa{
    
	//VARIÁVEL GÊNERO E O SETTER E GETTER
    private char genero;

    public void setGenero(char g){
		String gen;
        if(g == 'm' || g == 'M'){
			this.genero = g;
		}else{
			System.out.print("\nGênero inválido, a classe mulher só pode ser instânciada com o gênero masculino (entre com m): ");
			gen = input.next();
			g = gen.charAt(0);
			setGenero(g);
		}
    }
    public char getGenero(){return this.genero;}

	//TO STRING
	public String toString(){
		return("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nGênero: Masculino" + "\nData de Nascimento: " + dia + "/" + mes + "/" + ano + " - Idade: " + idade + " anos" + "\nCPF: " + cpf + "\nAltura: " + altura + "cm\nPeso: " + peso + "kg");	
	}

	//CONSTRUTORES
    public Homem(String nome, String sobrenome, char genero, int dia, int mes, int ano){
		super(nome, sobrenome, dia, mes, ano);
		setGenero(genero);
	}

	public Homem(String nome, String sobrenome,char genero, int dia, int mes, int ano, String cpf, double altura, double peso){
		super(nome, sobrenome, cpf, altura, peso, dia, mes, ano);
		setGenero(genero);
	}

}
