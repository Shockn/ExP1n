public class P1nX {
    
    public static void main(String[] args){

        Mulher m1 = new Mulher("Yuri", "de Oliveira Costa", 'a', 28, 8, 2000);
        Homem h2 = new Homem("Claudia", "de Oliveira", 'a', 22, 6, 1977);
        Pessoa p3 = new Pessoa("Pollyana", "Lopes Silva", 14, 4, 2000);
        Pessoa p4 = new Pessoa("William", "Lopes Souza", 15, 10, 1996);

        System.out.println(m1);
        System.out.println(h2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.println(Pessoa.numPessoas());

    }

}
