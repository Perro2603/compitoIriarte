public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        


        semaforo s = new semaforo();
        Box b= new Box();
        monoposto p1 = new monoposto(1,"ferrari","iriarte",s,b);
        monoposto p2 = new monoposto(1,"Redbull","pan",s,b);
        monoposto p3 = new monoposto(1,"MERCEDES","botez",s,b);
        monoposto p4 = new monoposto(1,"redbull","jose",s,b);
        monoposto p5 = new monoposto(1,"ferrari","peres",s,b);



        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        p1.join();
        p1.join();
        p1.join();
        p1.join();
        p1.join();
        
        System.out.println("Fine Gara");



    }

    


}
