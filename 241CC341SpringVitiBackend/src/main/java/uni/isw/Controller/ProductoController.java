package uni.isw.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uni.isw.entity.Producto;
import uni.isw.service.ProductoService;

@RestController
@RequestMapping("/productos")
public class ProductoController {
    
    @Autowired
    private ProductoService productoservice;
    
    @GetMapping
    public List<Producto> listar(){
        return productoservice.listar();
    }
    
    @PostMapping
    public Producto insertar(@RequestBody Producto prod){
        return productoservice.insertar(prod);
    }
    
    @PutMapping
    public Producto actualizar(@RequestBody Producto prod){
        return productoservice.actualizar(prod);
    }
    
    @DeleteMapping
    public void eliminar(@RequestBody Producto prod){
        productoservice.eliminar(prod);
    }
}
