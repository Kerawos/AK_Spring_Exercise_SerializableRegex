package pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models.SerializationExercise;
import pl.akademiakodu.AK_Spring_Exercise_SerializableRegex.models.UserRegisterInput;

import java.io.File;

public class SerialController {

    private File file = new File("fileTest.txt");
    private SerializationExercise serializationExercise = new SerializationExercise();

    @GetMapping("/ser") public String serialGet(Model model){
        //model.addAttribute("message", "No user has been registered.. Go to '/reg' and register user..");
        return "serial";
    }

//    @PostMapping("/ser") public String serialPost(@ModelAttribute("userRegisterInput")UserRegisterInput userRegisterInput,
//                                                  Model model){
//        serializationExercise.saveObject(file, userRegisterInput);
//        model.addAttribute("loadedLastObject", serializationExercise.loadObject(file));
//        return "serial";
//    }
}
