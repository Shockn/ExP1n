import java.util.*;

public class Pessoa{

	//VARIÁVEIS
	private String nome;
	private String sobrenome;
	private GregorianCalendar dataNascimento;

	private int dia, mes, ano;
	private double peso;
	private double altura;
	private long cpf;
	private static int contador = 0;

	private Scanner input = new Scanner(System.in);

	//GETTERS AND SETTERS

	//NOME
	public void setNome(String n){

		if(n.length() <= 1){
			System.out.print("\nNome inválido, digite novamente: ");
			n = input.nextLine();
			setNome(n);
		}else{this.nome = n;}

	}
	public String getNome(){return this.nome;}
	
	//SOBRENOME
	public void setSobrenome(String n){
		
		if(n.length() <= 1){
			System.out.print("\nSobrenome inválido, digite novamente: ");
			n = input.nextLine();
			setSobrenome(n);
		}else{this.sobrenome = n;}

	}
	public String getSobrenome(){return this.sobrenome;}

	//CPF
	public void setCpf(String c){

		if(ValidaCPF.isCPF(c)){
			this.cpf = ValidaCPF.isLong(c);
		}else{
			System.out.print("\nCPF inválido, digite novamente: ");
			c = input.nextLine();
			setCpf(c);
		}

	}
	public long getCpf(){return cpf;}

	//PESO
	public void setPeso(double n){

		if(n > 0 && n < 300){
			this.peso = n;
		}else{
			System.out.print("\nPeso inválido, digite novamente: ");
			n = input.nextDouble();
			setPeso(n);
		}

	}
	
	public double getPeso(){return this.peso;}

	//ALTURA
	public void setAltura(double n){
		
		if(n > 1 && n < 3){
			this.altura = n;
		}else{
			System.out.print("\nAltura inválida, digite novamente: ");
			n = input.nextDouble();
			setAltura(n);
		}
	}
	public double getAltura(){return this.altura;}

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
	private void setNumPessoas(){
		contador++;
	}
	public static int numPessoas(){return(contador);}

	//TO STRING
	public String toString(){
		return("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nCPF: " + cpf + "\nData de Nascimento: " + dia + "/" + mes + "/" + ano + "\nAltura: " + altura + "cm\nPeso: " + peso + "kg");	
	}

	//MÉTODOS CONSTRUTORES DA CLASSE
	public Pessoa(String n, String s, int dia, int mes, int ano){
		setNome(n);
		setSobrenome(s);
		setDataNascimento(ano, mes, dia);
		setNumPessoas();
	}

	public Pessoa(String n, String s, String c, double a, double p, int dia, int mes, int ano){
		setNome(n);
		setSobrenome(s);
		setCpf(c);	
		setDataNascimento(ano, mes, dia);
		setAltura(a);
		setPeso(p);
		setNumPessoas();
	}
	
	//MAIN
	public static void main(String args[]){
		
		Pessoa p1 = new Pessoa("Yuri", "de Oliveira Costa", 28, 8, 2000);
		p1.setCpf("12691412775");
		p1.getDataNascimento();
		System.out.println(p1);

		/*if(p1.nome instanceof String){
			System.out.println(p1.nome.getClass().getSimpleName() + " " + true);
		}else{
			System.out.println(p1.nome.getClass().getSimpleName() + " " + false);
		}/* */
	
	}

}
