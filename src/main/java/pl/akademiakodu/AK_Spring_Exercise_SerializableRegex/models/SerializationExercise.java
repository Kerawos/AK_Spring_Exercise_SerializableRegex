package pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models;

import java.io.*;

public class SerializationExercise {

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
