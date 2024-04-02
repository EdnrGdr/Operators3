public class Main {


    public static void main (String[] args) {

        /*Mantıksal operatörler

        &&  --> And Operatörü ( ve)  İki kosulda true olursa sonuc true olur. En az bir islem false ise sonuc false olur.

        ||   --> Or Operatörü (Veya) Sonuclardan en az biri true ise sonuc true olur. hepsi false ise sonuc false olur

        !   -->  Not Operatörü. Değil işlemi

         */

        System.out.println( 3 == 3 );
        System.out.println(2<3);
        System.out.println(3 == 3 &&  2<3  && "Edoli" == "Edoli");

        System.out.println(4==2  &&  5<3);

        System.out.println("Eda" =="Ayaz"  || 5 < 7  );
        System.out.println("Eda" == "Ayaz" ||  5<=2 || 9<6 );

        System.out.println(! ( 3<4));  // sonucu terse ceviriyor.

        System.out.println(!true);

        // Hepsini aynı yerde kullanma . Parantez kullanabiliriz :)

        System.out.println("Örnekk");

        System.out.println( (3<4 && "Eda" == "Eda") ||  (3.4 == 3.4  && 5<8));
        System.out.println( ! ((3<4 && "Eda" == "Eda") ||  (3.4 == 3.4  && 5<8)));



    }
}
