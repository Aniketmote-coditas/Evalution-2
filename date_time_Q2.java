package Evalution_2;
import java.time.DayOfWeek;
import java.util.*;
import java.time.LocalDate;

public class date_time_Q2 {
    public static void main(String[] args){
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dow = currentDate.getDayOfWeek();
        String [] weekname = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        String day =  dow.toString().toLowerCase();
        switch (day){
            case "monday":
                System.out.println("Its a start of week");
                break;
            case "tuesday":
                System.out.println("Its a second day of week");
                break;
            case "wednesday":
                System.out.println("Its a third day of week");
                break;
            case "thursday":
                System.out.println("Its a fourth day of week");
                break;
            case "friday":
                System.out.println("yay!!! its a last day of week....enjoy your weekend");
                break;
            case "saturday":
                System.out.println("its a weekend!!! majjaa life");
                break;
            case "sunday":
                System.out.println("last day of weekend");
                break;
        }
        for(int i=0;i<weekname.length;i++){
            if(weekname[i]!=day){
                System.out.println(weekname[i]);
            }

        }
    }
}
/*
Its a fourth day of week
sunday
monday
tuesday
wednesday
thursday
friday
saturday
 */
