import java.util.Scanner;

    public class kariyawan {
        
        public static void main(String[] args) {
           
            String nama, alamat;
            int usia, gaji;
           
            
            
            
            Scanner keyboard = new Scanner (System.in);
            
            
            System.out.println("### pendapatan karyawan PT. fantastic ###");
            System.out.println("Tolong isi data");
            System.out.print("Nama karyawan: ");
            nama = keyboard.nextLine();
   
            System.out.print("Alamat: ");
            alamat = keyboard.nextLine();
            
            System.out.print("Usia: ");
            usia = keyboard.nextInt();
            
            System.out.print("Gaji: ");
            gaji = keyboard.nextInt();
            
             
            
            System.out.println("-------------------------------------------------------------");
            System.out.println("Nama karyawan: " + nama);
            System.out.println("Alamat: " + alamat);
            System.out.println("Usia " + usia + " tahun");
            System.out.println("Gaji: Rp " + gaji);
            
            
        }
        
    
    }
