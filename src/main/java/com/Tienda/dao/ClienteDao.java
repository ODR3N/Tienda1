package com.Tienda.dao;

import com.Tienda.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao 
        extends JpaRepository <Cliente, Long>{
    
    
    //Consultas ampliadas de JPA
    public List<Cliente> findByNombre(String nombre);
    
    public List<Cliente> findByApellidos(String apellidos);
    
    public List<Cliente> findByCorreo(String correo);
    
    public List<Cliente> findByTelefono(String telefono);
    //Se puede utilizar el "findbybetween" pazra buscar entre rangos
    
    
}
