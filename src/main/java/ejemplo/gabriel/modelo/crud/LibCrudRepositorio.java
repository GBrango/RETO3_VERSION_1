/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.gabriel.modelo.crud;

import ejemplo.gabriel.modelo.datos.Lib;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author gabriel
 */
public interface LibCrudRepositorio extends CrudRepository<Lib, Integer> {
   
    
}
