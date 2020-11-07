package lk.ijse.ws.stater.api;

import lk.ijse.ws.stater.data.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import java.util.Date;


@RestController
@RequestMapping("/api")

public class  MyRestController {

    @GetMapping(path = "/api/hello")
    public Message greeting(){
        Message msg = new Message();
        msg.setSender("Server");
        msg.setMessage("Hello World");
        msg.setSentTime((new Date()));
        return msg;
    }

    @GetMapping(path = "/api/message")
   public Message messageBuilder(
           @RequestParam("username")
           Spring user,
           @RequestParam("message")
           String message){
        Message msg = new Message();
        msg.setSender("Server");
        msg.setMessage("Hello World");
        msg.setSentTime((new Date()));
        return msg;
    }

    @RequestMapping(value = "/api/message", method = RequestMethod.POST)
    public Message createMessage(@RequestBody() Message message) {
        System.out.println(message);
        return message;
    }
}
