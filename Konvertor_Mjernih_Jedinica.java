public class Konvertor_Mjernih_Jedinica {
    double konvert_KilometreUMilje (double duzina_km){
        double duzina_mi;
        duzina_mi = duzina_km / 1.609;
        return duzina_mi;
    }
    double konvert_MiljeUKilometre (double duzina_mi){
        double duzina_km;
        duzina_km = duzina_mi * 1.609;
        return duzina_km;
    }
    double konvert_StopeUCentimetre (double duzina_st){
        double duzina_cm;
        duzina_cm = duzina_st * 30.48;
        return duzina_cm;
    }
    double konvert_CentimetreUStope (double duzina_cm){
        double duzina_st;
        duzina_st = duzina_cm / 30.48;
        return duzina_st;
    }


    public static void main (String[] args){
        Konvertor_Mjernih_Jedinica k = new Konvertor_Mjernih_Jedinica();
        System.out.println("Duzina od 10.4 km je "+k.konvert_KilometreUMilje(10.4)+ "milja");
                System.out.println("Duzina od 50 milja je "+k.konvert_MiljeUKilometre(50)+"km");
                        System.out.println("Duzina 2 stope je "+k.konvert_StopeUCentimetre(2) +" cm");
        System.out.println("Duzina od 55 cm "+k.konvert_CentimetreUStope(55)+" stopa");
    }
}



