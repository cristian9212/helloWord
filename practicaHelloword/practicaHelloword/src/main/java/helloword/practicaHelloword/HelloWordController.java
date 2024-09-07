package helloword.practicaHelloword;

import org.springframework.web.bind.annotation.*;

/**
 * @author Cristian Talero
 */
@RestController
@RequestMapping("/api")
public class HelloWordController {

    @GetMapping("/hello/{nombre}")
    public String hello(@PathVariable String nombre) {
        return "Hello World! es un tema de tiempo"+nombre;
    }
    @PostMapping("/hola/{nombre}")
    public  String salud(@PathVariable String nombre){
        return "Hola mundo! es un tema de tiempo"+nombre;
    }
  }

