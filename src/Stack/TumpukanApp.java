package Stack;

public class TumpukanApp {
     public static void main (String [] args){
        Tumpukan tumpukan=new Tumpukan(10);
        tumpukan.push(5);
        tumpukan.baca();
        tumpukan.push(30);
        tumpukan.baca();
        long nilai1 = tumpukan.peek();
        System.out.println("nilai teratas = "+nilai1);  
        System.out.println();
        System.out.println("Nama saya adalah Ayikwati Muhfiyati");
        
        long nilai2 = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+nilai2);  
        System.out.println();
       
        
        tumpukan.push(40);
        tumpukan.baca();
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");

     }
}
        
