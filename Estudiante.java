public class Estudiante {

    private static int  numero =0  ;


    public  Estudiante (){
        this.permitir();
    }


    public void increment (){
        Estudiante.numero +=1;
    }



    public void permitir (){
        if(Estudiante.numero >5){
            //creo la exepcion pero con throw la lanzo
            throw new RuntimeException("no se pueede incrementar mas el numero ");
        }else{
            increment();
        }
    }


    public static void main(String[] args) {


        try {

            for (int i = 0; i < 8; i++) {
                Estudiante estid = new Estudiante() ;    
                System.out.println(estid);
                System.out.println(Estudiante.numero);
            }
                


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }    
        

        


    }


}