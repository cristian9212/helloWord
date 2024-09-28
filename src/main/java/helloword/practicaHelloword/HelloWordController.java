package helloword.practicaHelloword;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristian Talero
 */
@RestController
@RequestMapping("/api/v1")
public class HelloWordController {

    //Creación de elementos
    private List<String> items = new ArrayList<String>();

    public HelloWordController(){
        items.add("Colombia");
        items.add("Brasil");
        items.add("Argentina");
        items.add("Peru");
        items.add("Chile");
        items.add("Venezuela");
        items.add("Bolivia");
    }
    @PostMapping
    public String addItem(@RequestBody String newItem) {
        items.add(newItem);
        return "iTem insertado con exito!";
    }
    @GetMapping("/hello/{nombre}")
    public String hello(@PathVariable String nombre) {
        return "Hello World! es un tema de tiempo"+nombre;
    }
    @PostMapping("/hola/{nombre}")
    public  String salud(@PathVariable String nombre){
        return "Hola mundo! es un tema de tiempo"+nombre;
    }
    @GetMapping
    public  List<String>getAllItems(){
        return items;
    }
    @GetMapping("/{index}")
    public String getItem(@PathVariable int index) {
        if(index >= 0 && index < items.size()) {
            return items.get(index);
        }else {
            return "Item no encontrado";
        }
    }
    @PutMapping("/{index}")
    public String modyfyItem(@PathVariable int index,@RequestBody String newItem ) {
        if (index >= 0 && index < items.size()) {
            return "Item actulizado con extio";
        } else {
            return "Item no encontrado";
        }
    }
       @DeleteMapping("/{index}")
       public String  elemento(@PathVariable int index) {
           if (index >= 0 && index < items.size()) {
               return "Item eliminado";
           } else {
               return "Item no encontrado";
           }
    }
  }

