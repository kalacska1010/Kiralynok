package kiralynok;

import java.io.IOException;

public class Kiralynok {
    public static void main(String[] args) throws IOException {
       //4. feladat
        System.out.println("4. feladat: üres tábla megjelenítése");
        Tabla tabla = new Tabla('#');
        tabla.megjelenit();
        
       // 6. feladat
       
        System.out.println("6. feladat: feltöltött tábla:");
        
        tabla.elhelyez(8);
        tabla.megjelenit();
    }
    
}
