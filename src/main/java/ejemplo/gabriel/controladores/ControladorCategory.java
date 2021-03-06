/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.gabriel.controladores;

import ejemplo.gabriel.modelo.datos.Category;
import ejemplo.gabriel.modelo.servicios.CategoryServicios;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author gabriel
 */
@RestController
@RequestMapping("/api")
public class ControladorCategory {
    
    @Autowired /**Inyectamos la dependencias*/
    CategoryServicios categoriaServicios;
    @GetMapping("/Category/all")
    public List<Category> buscarTodasLasCategory() {
        return categoriaServicios.buscarTodasLasCategorias();/**Retornamos todass lass categorias invocando el método buscarTodasLasCategorias*/
    }
    
    /**ok*/
    
    
    @GetMapping("/Category/{id}")
    public Category getPorId(@PathVariable("id") Integer id) {
        return categoriaServicios.buscarPorIdCategoria(id);
    }
    
    
    @PostMapping("/Category/save")
    public ResponseEntity<?> guardarCategory(@RequestBody Category input) {
        categoriaServicios.guardarCategory(input);/**Este input recibe el cuerpo de los datos que se van a cargar*/
            return ResponseEntity.status(201).build();
    }
    
       
    
    /**Estos metodos son para el reto4*/
   /** @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    */
}
