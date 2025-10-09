package Aulas.Fundamentos;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:20:36");
        Instant d03 = Instant.parse("2022-07-20T01:20:36Z");

        LocalDate pastWeekLocalDate = d01.minusDays(7);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        System.out.println("Semana passada: " + pastWeekLocalDate);
        System.out.println("Hoje: " + d01);
        System.out.println("Proxima semana: " + nextWeekLocalDate);

        Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
        Instant nextInstant = d03.plus(7, ChronoUnit.DAYS);

        //Calculo de duração de hora;
       //converta o localDate para LocalDateTime
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekInstant, d03);
        System.out.println(t1.toDays());
        System.out.println(t2.toSeconds());
    }
}
