
import java.util.Scanner;
public class tugas{
    public static void tugas (string [] arga){
        scanner scan=new scanner ( system.in);
        
        string nama depan, namabelakang,alamat,tempatlahir,tanggallahir;
//        
        system.out.printin();
        system.out.printin("\t---------------------------------------------")
        system.out.printin("\t\program biodata dengan java");
        system.out.printin("\t---------------------------------------------")
        system.out.printin();
        system.out.printin("\tisi biodata diri dengan lengkap!");
        system.out.printin("\t---------------------------------------------")
                
        system.out.print("\tnama lemgkap\t");
        namadepan=scan.nextline();
            
        system.out.print("\tnama belkang\t");
        namabelakang=scan.nextline();
            
        system.out.print("\talamat lemgkap\t");
        alamat=scan.nextline();
            
        system.out.print("\tTempat lahir\t");
        tempatlahar=scan.nextline();
        
        system.out.print("\tTanggal lahir\t");
        tanggallahir=scan.nextline();
        
        system.out.printin();
        system.out.printin("\t=====================================================");
        system.out.printin("\t\t\t\tbiodataku");
        system.out.printin("\t=====================================================");
        system.out.printin("\tnamalengkap\t\t: "+namadepan+" "+namabelakang);    
        system.out.printin("\talamat\t\t\t: "+alamat);       
        system.out.printjn("tempat,tanggal lahir\t: "+tempatlahir+" "+tanggallahir);       
        system.out.printjn("\t====================================================="); 
               
    }
    
}
