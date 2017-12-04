package pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models.services;

/**
 * Imports section
 */
import org.springframework.stereotype.Service;
import pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models.UserRegisterInput;

import java.io.*;

/**
 * Service responsible for all serialization logic using in this exercise.
 */
@Service
public class SerializationExercise {

    /**
     * Method try to save given object in listed file
     * @param file
     * @param object
     */
    public void saveObject(File file, UserRegisterInput object){
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method load object from given file
     * @param file
     * @return object from file
     */
    public UserRegisterInput loadObject(File file){
        UserRegisterInput object = new UserRegisterInput();
        if (!file.exists()){
            throw new IllegalArgumentException("File not exist!");
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            object = (UserRegisterInput)ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }


}
