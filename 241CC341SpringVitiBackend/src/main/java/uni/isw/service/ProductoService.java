package uni.isw.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uni.isw.entity.Producto;
import uni.isw.repo.ProductoRepo;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepo productorepo;
    
    public Producto insertar(Producto prod){
        return productorepo.save(prod);
    }
    
    public Producto actualizar(Producto prod){
        return productorepo.save(prod);
    }
    
    public List<Producto> listar(){
        return productorepo.findAll();
    }
    
    public void eliminar(Producto prod){
        productorepo.delete(prod);
    }
}
