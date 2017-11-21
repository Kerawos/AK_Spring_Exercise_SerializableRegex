package pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models;

import java.util.regex.Pattern;

public class RegexExercise {

        public boolean isEmailAddress(String potentialEmail){
            return Pattern.matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$", potentialEmail);
        }

        public boolean isPasswordSecure(String potentialPassword){
            return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", potentialPassword);
        }

        
}
