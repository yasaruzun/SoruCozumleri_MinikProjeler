package miniATMProjesi;

import static miniATMProjesi.AtmProjesi.scan;

public class ParaGonderme {

    static BakiyeSorgulama bakiSorgula=new BakiyeSorgulama();


    public static void paraGonderme(String iban, double miktar) {
        if (miktar <= AUserATM.bakiye) {
            AUserATM.bakiye -= miktar;
            System.out.println(iban + " NOLU IBANA " + miktar + " GONDERILDI");
            bakiSorgula.bakiyeSorgula();
        } else {
            System.out.println("GECERLI MIKTAR GIRINIZ:");
            paraGonderme(iban, scan.nextDouble());
        }
    }
}
