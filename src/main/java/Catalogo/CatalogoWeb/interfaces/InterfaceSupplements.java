package Catalogo.CatalogoWeb.interfaces;

import Catalogo.CatalogoWeb.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface InterfaceSupplements extends MongoRepository<Supplements, String>{
    
}
