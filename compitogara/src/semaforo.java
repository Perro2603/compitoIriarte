public class semaforo {
    private int stato;

    public semaforo(){

        stato = 1;

    }

    public synchronized void P(String pilota){

        while(stato == 0){

            try {
                System.out.println("----------------------------------------------"+pilota + " in attesa-----------------------------------");

                wait();


            } catch (Exception e) {
                System.out.println("errore " + e.getMessage());
            }
        }
        stato = 0;
    



    }

    public synchronized void V(){

        stato = 1;

        notify();


    }






}
