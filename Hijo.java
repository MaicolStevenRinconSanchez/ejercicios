public class Hijo  extends Padre{


    public String  h = super.decirHola();

    

    @Override
    public String decirHola(){
        return "hola como estas brother";
    }

    public String  ii = this.decirHola();

    
    public static void main(String[] args) {
        Hijo sh = new Hijo() ;
        // super clase
        System.out.println(sh.h);
        // mi clase 
        System.out.println(sh.ii);


        Hijo miHiho =new Padre();
        
    }
}
