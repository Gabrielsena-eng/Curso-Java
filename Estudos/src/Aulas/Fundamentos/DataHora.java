package Aulas.Fundamentos;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DataHora {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDateTime d04 = LocalDateTime.parse("2025-07-25T01:30:26");
        Instant d05 = Instant.parse("2025-07-25T01:30:26Z");

        LocalDate d10 = LocalDate.of(2022, 7, 20);

        //Converter horario Global para o Local
        LocalDate r1 = LocalDate.ofInstant(d05, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d05, ZoneId.of("Asia/Jayapura"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d05, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d05, ZoneId.of("Asia/Jayapura"));

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d10);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("Hora d04 =" + d04.getHour());
        System.out.println("Dia d04 =" + d04.getDayOfMonth());
        System.out.println("Ano d04 =" + d04.getYear());
    }
}
