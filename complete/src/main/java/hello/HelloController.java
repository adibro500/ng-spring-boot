package hello;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

class Str {
    String msg;
    public Str (String msg) {
        this.msg = msg;
    }
}
@RestController
public class HelloController {
   
    @RequestMapping(value = "/api/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Map getString() {
        return Collections.singletonMap("response", "Welcome to hi");
    }
    
    @RequestMapping(value = "/api/greet", produces = "application/json")
    public Map indexGreet() {
        HashMap<String, String> hp = new HashMap<String, String>();
        hp.put("data", "Helloooooo");
        hp.put("name", "aditya");
        hp.put("mobile", "9999999999");
        return hp;
    }
    
}
