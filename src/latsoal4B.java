
public class latsoal4B {


    public static void main(String[] args) {
           int  beda, Un = 5,sn; //deklarasi variabel
       
       
        beda = 5; //Sebagai penentu suku pertama
        sn=Un; //menjelaskan bahwa nilai sn = un 
        int n = 0; //untuk mendeklarasikan dan memulai pengulangan tiap ordo 
       

        for (int c = 0; c < 5; c++) { //perulangan Untuk mencetak pola kebawah
            for (int y = c; y < 5; y++) { //perulangan Untuk mencetak pola kesamping
                System.out.print(sn + " ");//mencetak hasil operasi bilangan
              
                sn +=beda;//operasi untuk mencari suku ke n
                n++;//+1 pada setiap angka
                
                 
            }
            System.out.println(""); //untuk membentuk pola matrix
        }
        }
    }
    

