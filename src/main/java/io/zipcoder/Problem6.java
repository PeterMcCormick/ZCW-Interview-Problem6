package io.zipcoder;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    Pattern pattern = Pattern.compile("((1[012]|^[1-9]|0[1-9]):([0-5][0-9])([aApP][mM]))");
    Matcher matcher;

    public static void main(String[] args) {
        Problem6 problem = new Problem6();
        String input = problem.inputCollector();
        while (!problem.validTime(input)) {
           input = problem.inputCollector();
        }
        String output = problem.militaryTimeString(input);
        System.out.println(output);
    }

    public String hundred(String input) {
        int hundredsNumber = hourMeridiemAdder(input);
        String hundredsString = "";
        if (hundredsNumber != 12) hundredsString = " Hundred";
        String hundredOutput = Hundreds.values()[hundredsNumber].toString() + hundredsString;
        return hundredOutput;
    }

    public String hours(String input) {
        String hoursOutput;
        Integer minutesRaw = Integer.parseInt(timeMinuteHarvester(input));
        String hoursString;
        if (minutesRaw == 1) hoursString =  "Hour";
        else hoursString = "Hours";
        hoursOutput = Hours.values()[minutesRaw].toString() + " " + hoursString;
        return hoursOutput;
    }

    public String inputCollector() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a String number following the template (X)X:XXxm" +
                "for example 1:30pm or 12:24am ( x can either be p, a, P, or A)");
        String input = sc.nextLine();
        return input;
    }

    public String timeHarvester(String input) {
        matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return matcher.group(0);
        }
        return null;
    }

    public String timeHourHarvester(String input) {
        matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return matcher.group(2);
        }
        return null;
    }

    public String timeMinuteHarvester(String input) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return matcher.group(3);
        }
        return null;
    }

    public String timeMeridiemHarvester(String input) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return matcher.group(4).toLowerCase();
        }
        return null;
    }

    public Integer hourMeridiemAdder(String input) {
        Integer hour = Integer.parseInt(timeHourHarvester(input));
        String meridiem = timeMeridiemHarvester(input);
        if (meridiem.equals("pm")) {
            hour = hour + 12;
        }
        return hour;
    }

    public boolean validTime(String input) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            return true;
        }
        else {
            System.out.println("The time you have entered is not valid in this context.");
        }
        return false;
    }

    public String andForTimeString(String input) {
        String and;
        if (Integer.parseInt(timeMinuteHarvester(input)) < 10) {
            and = " ";
        } else {
            and = " and ";
        }
        return and;
    }

    public String militaryTimeString(String input) {
        return hundred(input) + andForTimeString(input) + hours(input);
    }
}
