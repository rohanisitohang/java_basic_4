public class challenge4{

    // method atau function
    public static void main(String[] args){
        Nama ("Rohani Susanti Sitohang");
        Kampus ("UMRAH");
        Jurusan ("Teknik Elektro");
        Semester (7);
        Dapatkannilai (85);
    }

    // Nama
    static void Nama(String Nama){
        System.out.println("Nama :" + Nama);
    }

    // Kampus
    static void Kampus(String Kampus){
        System.out.println("Kampus :" + Kampus);
    }

    // Jurusan
    static void Jurusan(String Jurusan){
        System.out.println( "Jurusan: " + Jurusan);
    }

// Semester
static void Semester(int Semester){
    System.out.println( "Semester :" + Semester);
}

    // untuk mendapatkan nilai (E= 0-20) (D= 21-40) (C= 41-60) (B= 61-80) (A= 81-100)
    static void Dapatkannilai(int nilai){
        if(nilai >= 0 && nilai <= 20){
            System.out.println("nilai = E");
        }else if(nilai >= 21 && nilai <= 40){
            System.out.println("nilai =D");
        }else if (nilai >= 41 && nilai <= 60){
            System.out.println("nilai = C");
        }else if (nilai >= 61 && nilai <= 80){
            System.out.println("nilai = B");
        }else if (nilai >= 81 && nilai <= 100){
            System.out.println("nilai = A");
        }else if (nilai >=100){
            System.out.println("Tidak ada nilai");
        }
    }
}