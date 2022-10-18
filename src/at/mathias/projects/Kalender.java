package at.mathias.projects;

import groovy.lang.GString;

public class Kalender {
    public static void main(String[] args) {



    //String[] namesOfMonths = {"Jänner", "Februar", "März", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
    String[] nameOfWeekdays = {"MO", "DIE", "MI", "DO", "FR", "SA", "SO"};

        for(int i = 0; i < nameOfWeekdays.length; i++) {
            String separator= " | ";
            String endSeparator = "";

            if(i == 6) {
                endSeparator = " |\n";
            }
            System.out.print(separator + nameOfWeekdays[i] + endSeparator);

        }
    }
}
