public class Mulher extends Pessoa{
    
    private char genero;

    public void setGenero(char g){
        this.genero = g;
    }
    public char getGenero(){return this.genero;}

    /*public Mulher(String nome, String sobrenome, int dia, int mes, int ano){
		setNome(nome);
		setSobrenome(sobrenome);
		setDataNascimento(ano, mes, dia);
		setNumPessoas();
	}

	public Mulher(String nome, String sobrenome, String cpf, double altura, double peso, int dia, int mes, int ano){
		setNome(nome);
		setSobrenome(sobrenome);
		setCpf(cpf);	
		setDataNascimento(ano, mes, dia);
		setAltura(altura);
		setPeso(peso);
		setNumPessoas();
	}*/

}
