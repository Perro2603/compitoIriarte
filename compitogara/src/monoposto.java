public class monoposto extends Thread{
    private int Id;
    private String scudiero;
    private int giri;
    private String pilota;
    private semaforo s;
    private Box b;

    

    public monoposto(int id, String scudiero, String pilota, semaforo s, Box b) {
        Id = id;
        this.scudiero = scudiero;
        this.pilota = pilota;
        this.s = s;
        this.b = b;
        this.giri = 0;
    }



    @Override
    public void run(){

        
        while(giri<10){
            try{
    
                sleep((int)(1000*Math.random()+1));


            }
            catch(Exception e){

                System.out.println("errore sleep");

            }
            giri++;
            System.out.println("GIRO " + giri + " completato il : " + pilota);

            if(giri%3 == 0){
                s.P(pilota);
                b.cambiaGomma(pilota);
                System.out.println("PIT-STOP " + pilota + " FINITO ");
                s.V();

            }
            


        }
        



    }


}
