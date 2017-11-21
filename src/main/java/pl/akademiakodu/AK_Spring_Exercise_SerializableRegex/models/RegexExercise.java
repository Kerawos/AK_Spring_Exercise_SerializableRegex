package pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models;

import java.util.regex.Pattern;

public class RegexExercise {

    public boolean isProperName(String name){
        return Pattern.matches("([A-Z]{1})([a-z]+)", name);
    }

    public boolean isProperSurname(String name){
        return Pattern.matches("([A-Z]{1}[a-z]+)(\\-{1}([A-Z]{1}[a-z]+))*", name);
    }

    public boolean isEmailAddress(String potentialEmail){
        System.out.println(Pattern.matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$", "Maresowa@gmail.com"));
        return Pattern.matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$", potentialEmail);
    }

    public boolean isStreetCorrected(String potentialStreet){
        return Pattern.matches("([A-Z]{1}[a-z]*)( [A-Z]{1}[a-z]*)? ([0-9]+[a-zA-Z]*)(/[0-9]+)?", potentialStreet);
    }

    public boolean isPasswordSecure(String potentialPassword){
        return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", potentialPassword);
    }

}
