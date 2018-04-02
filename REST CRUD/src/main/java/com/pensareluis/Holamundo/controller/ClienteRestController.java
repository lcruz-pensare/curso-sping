package com.pensareluis.Holamundo.controller;

import com.pensareluis.Holamundo.modelsEntity.Cliente;
import com.pensareluis.Holamundo.services.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

//@CrossOrigin(origins={"http://localhost:4200"}) // Se pone 4200 para que angular pueda trabajar o acceder
@RestController
@RequestMapping("/api")
public class ClienteRestController {

    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }

    @GetMapping("/clientes/{id}") // Lo que esta entre llaves se tiene como parametro y sera el ID
    public Cliente show(@PathVariable Long id){ // Se pone lo de path variable porque cambiara en funcion del ID del usuario
      return  clienteService.findById(id);
    }

    @PostMapping("/clientes") //Se utiliza la misma URL que index, la diferencia es que sera un post para modificar
    @ResponseStatus(HttpStatus.CREATED) // Indica que se ha creado un contenido en nuestra aplicacion
    public Cliente create(@RequestBody Cliente cliente){ // El request body es porque es un json
        return clienteService.save(cliente); //Se regresa el objeto ya persistido
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/clientes/{id}")
    public Cliente update(@RequestBody Cliente cliente,@PathVariable Long id){
        Cliente clienteActual=clienteService.findById(id);
        clienteActual.setApellido(cliente.getApellido()); // Le pasamos los parametros del cliente recibido al cliente actual
        clienteActual.setEmail(cliente.getEmail());
        clienteActual.setNombre(cliente.getNombre());
        return clienteService.save(clienteActual); // Se persist con clienteService guardando los datos actualizados de cliente actual
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/clientes/{id}")
    public void delete(@PathVariable Long id){
        clienteService.deleteById(id);
    }
}
