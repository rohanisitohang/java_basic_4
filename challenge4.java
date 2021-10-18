public class challenge4 {

    public static void main(String[] args) {
        myMethod(2);
    }

     //method atau function
     static int myMethod(int angka) {
  
            if(angka >=0 && angka<= 25){
                System.out.println("E");
            } else if ( angka>= 26 && angka <= 50){
                System.out.println("D");
            } else if ( angka>= 51 && angka <= 75){
                System.out.println("C");
            } else if ( angka>= 76 && angka <= 90){
                System.out.println("B");
            } else if (angka>= 91 && angka<=100){
                System.out.println("A");   
            } else if (angka>=100) {
                System.out.println("Invalid Number");
            } 
            return angka;  
        }       
}