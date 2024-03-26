//Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
//Formatta la data ottenendo 01 marzo 2023
//Stampa sulla console
//Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime dataEsercizio3 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        dataFormattata(dataEsercizio3);
    }

    public static String dataFormattata(OffsetDateTime dataEsercizio3) {

        String datePat = dataEsercizio3.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println ("Data per pattern = " + datePat);
        return datePat;
    }

}

