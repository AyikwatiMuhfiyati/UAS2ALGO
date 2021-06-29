package Queue;

public class AntrianApp {
    public static void main (String[] args){
        Antrian antrian = new Antrian(10);
        antrian.enqueque(50);
        antrian.display();
        antrian.enqueque(60);
        antrian.display();
        System.out.println("nilai yang paling depan = "+ antrian.peek());
        
        System.out.println();
        System.out.println("Nama saya adalah Ayikwati Muhfiyati");
        
        antrian.enqueque(70);
        antrian.display();
        
        System.out.println("nilai yang diambil dari antrian = "+ antrian.dequeue());
        antrian.display();
        System.out.println();
        
        System.out.println("nilai yang paling depan =  "+ antrian.peek());
    }
}
    
   
