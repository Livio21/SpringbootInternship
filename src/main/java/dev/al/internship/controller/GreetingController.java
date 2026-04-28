package dev.al.internship.controller;

import dev.al.internship.models.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
class GreetingController {

    Map<String,String> greetings = new HashMap<>();



    @GetMapping("/greetings")
    public Map<String,String> getGreetings(){
        return greetings;
    }

    @GetMapping("/get-greet/{language}")
    public String getGreetBasedOnLanguage(@PathVariable String language){

        return greetings.getOrDefault(language.toLowerCase(),"Not found.");
    }


    @PostMapping("/add-greeting")
    public String addGreeting(@RequestBody Greeting greet){

        this.greetings.put(greet.getLanguage().toLowerCase(),greet.getGreeting());

        return "Added new greeting " + greet;
    }
}
