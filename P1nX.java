public class P1nX {
    
    public static void main(String[] args){

        Pessoa pessoas[];

        if(args[2].charAt(0) == 'm' || args[2].charAt(0) == 'M' && args.length == 6){
            Homem p = new Homem(args[0], args[1], args[2].charAt(0), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
            System.out.println(p); 
        }else if(args[2].charAt(0) == 'm' || args[2].charAt(0) == 'M' && args.length == 9){
            Homem p = new Homem(args[0], args[1], args[2].charAt(0), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), args[6], Double.parseDouble(args[7]), Double.parseDouble(args[8]));
            System.out.println(p);
        }else if(args[2].charAt(0) == 'f' || args[2].charAt(0) == 'F'  && args.length == 6){
            Mulher p = new Mulher(args[0], args[1], args[2].charAt(0), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]));
            System.out.println(p);
        }else if(args[2].charAt(0) == 'f' || args[2].charAt(0) == 'F'  && args.length == 9){
            Mulher p = new Mulher(args[0], args[1], args[2].charAt(0), Integer.parseInt(args[3]), Integer.parseInt(args[4]), Integer.parseInt(args[5]), args[6], Double.parseDouble(args[7]), Double.parseDouble(args[8]));
            System.out.println(p);
        }

    }

}
