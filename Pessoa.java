import java.util.*;

public class Pessoa{

	private String nome;
	private String sobrenome;
	private GregorianCalendar dataNascimento;

	private int dia, mes, ano;
	private double peso;
	private double altura;
	private char genero;
	private String cpf;
	private static int contador = 0;

	private Pessoa pai;
	private Pessoa mae;


	//GETTERS AND SETTERS


	//NOME
	public void setNome(String n){this.nome = n;}
	public String getNome(){return this.nome;}
	
	//SOBRENOME
	public void setSobrenome(String n){this.sobrenome = n;}
	public String getSobrenome(){return this.sobrenome;}

	//CPF
	public void setCpf(String c){this.cpf = c;}
	public String getCpf(){return cpf;}

	//PESO
	public void setPeso(double n){
		if(n > 0 && n < 300){
			this.peso = n;
		}else{System.out.println("Peso invalido");}
	}
	
	public double getPeso(){return this.peso;}

	//ALTURA
	public void setAltura(double n){
		
		if(n > 1 && n < 3){
			this.altura = n;
		}else{System.out.println("Altura invalido");}
	}
	public double getAltura(){return this.altura;}
	
	//GÊNERO
	public void setGenero(char n){
		if(n == 'm' || n == 'f'){
			this.genero = n;
		}else{System.out.println("Genero invalido(entre com m ou f)");}
	}
	public char getGenero(){return this.genero;}

	//DATA DE NASCIMENTO
	public void setDataNascimento(int d, int m, int a){
		GregorianCalendar data = new GregorianCalendar(d, m, a);
		this.dataNascimento = data;
		this.dia = dataNascimento.get(Calendar.DAY_OF_MONTH);	
		this.mes = dataNascimento.get(Calendar.MONTH);
		this.ano = dataNascimento.get(Calendar.YEAR);
	}
	public GregorianCalendar getDataNascimento(){return(this.dataNascimento);}

	//CONTADOR
	private void setContador(){
		contador++;
	}
	public static int getContador(){return(contador);}

	//MAE
	public void setMae(Pessoa m){mae = m;}
	public Pessoa getMae(){return(mae);}

	//PAI
	public void setPai(Pessoa p){pai = p;}
	public Pessoa getPai(){return(pai);}

	//TO STRING
	public String toString(){
		return("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nCPF: " + cpf + "\nData de Nascimento: " + dia + "/" + mes + "/" + ano + "\nAltura: " + altura + "\nPeso: " + peso + "\nGenero: " + genero);	
	}

	//MÉTODO CONSTRUTOR DA CLASSE
	
	public Pessoa(){
	}

	public Pessoa(String n, String s, String c, double a, double p, char g, int dia, int mes, int ano){
		setNome(n);
		setSobrenome(s);
		setCpf(c);	
		setDataNascimento(ano, mes, dia);
		setAltura(a);
		setPeso(p);
		setGenero(g);
		setContador();
		setMae(null);
		setPai(null);
	}
	
	public static void main(String args[]){

		Pessoa p1 = new Pessoa();
		System.out.println(p1);
	
	}

}
