package com.BeerRevolution.service_provision.service;

import com.BeerRevolution.service_provision.model.Cliente;
import com.BeerRevolution.service_provision.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
  private  Cliente cliente;

    @Autowired
   private ClienteRepository clienteRepository;

    @Transactional
      public Cliente salvar(Cliente cliente){

        return clienteRepository.save(cliente);

    }





}
