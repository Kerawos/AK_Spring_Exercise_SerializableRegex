package pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;

import java.util.regex.Pattern;

/**
 * Service responsible for all regex logic using in this exercise. All 'standards' for inputs are contain in redame file
 */
@Service
public class RegexExercise {

    /**
     * Method checks if given name is proper in way of 'proper name' standards
     * @param name user input
     * @return true if name fits standards
     */
    public boolean isProperName(String name){
        return Pattern.matches("([A-Z]{1})([a-z]+)", name);
    }

    /**
     * Method checks if given surname is proper in way of 'proper surname' standards (surname can be separated into
     * two parts
     * @param name user input
     * @return true if surname fits standards
     */
    public boolean isProperSurname(String name){
        return Pattern.matches("([A-Z]{1}[a-z]+)(\\-{1}([A-Z]{1}[a-z]+))*", name);
    }

    /**
     * Method checks if given email address is proper in way of 'proper email address' standards
     * @param potentialEmail user input
     * @return true if email address fits standards
     */
    public boolean isEmailAddress(String potentialEmail){
        return Pattern.matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$", potentialEmail);
    }

    /**
     * Method checks if given street name is proper in way of 'proper street name' standards
     * @param potentialStreet user input
     * @return true if street name fits standards
     */
    public boolean isStreetCorrected(String potentialStreet){
        return Pattern.matches("([A-Z]{1}[a-z]*)( [A-Z]{1}[a-z]*)? ([0-9]+[a-zA-Z]*)(/[0-9]+)?", potentialStreet);
    }

    /**
     * Method checks if given password is proper in way of 'proper password' standards
     * @param potentialPassword user input
     * @return true if password fits standards
     */
    public boolean isPasswordSecure(String potentialPassword){
        return Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", potentialPassword);
    }

}
