package lk.ijse.ws.stater;
 
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")

public class MyRestController {

    @GetMapping(path = "/hello", produces = "text/plain")
    public ResponseEntity<Object> sayHello() {

        return new ResponseEntity<Object>("Hello Spring Boot ", HttpStatus.OK);
    }
}
