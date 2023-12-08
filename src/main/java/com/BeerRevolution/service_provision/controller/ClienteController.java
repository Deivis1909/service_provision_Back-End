package com.BeerRevolution.service_provision.controller;

import com.BeerRevolution.service_provision.model.Cliente;
import com.BeerRevolution.service_provision.repository.ClienteRepository;
import com.BeerRevolution.service_provision.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    //MODELO 1

   // @PostMapping
    //@ResponseStatus(HttpStatus.CREATED)
    //public Cliente salvar(Cliente cliente){
      //return  clienteService.salvar(cliente);

    //}

    //metodo 2
    @PostMapping
    public ResponseEntity salvar(@RequestBody Cliente cliente){

        try{
        return ResponseEntity.ok(clienteService.salvar(cliente));
        }catch(Exception e ){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        }


}
