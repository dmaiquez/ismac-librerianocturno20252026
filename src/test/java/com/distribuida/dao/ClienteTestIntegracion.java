package com.distribuida.dao;

import com.distribuida.model.Cliente;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
public class ClienteTestIntegracion {

    @Autowired
    private ClienteRepository clienteRepository;


    @Test
    public void testClienteFindAll(){
        List<Cliente> clientes = clienteRepository.findAll();
        for (Cliente item: clientes){
            System.out.println(item.toString());
        }

    }

    @Test
    public void testClienteFindOne(){
        Optional<Cliente> cliente = clienteRepository.findById(1);
        System.out.println(cliente);

    }


    @Test
    public void testClienteSave(){
        Cliente cliente = new Cliente(0,"1701234577","Juan77","Taipe77","Direccion77","0987654777","jtaipe77@correo.com");
        clienteRepository.save(cliente);
    }

    @Test
    public void testClienteActualizar(){
        Optional<Cliente> cliente2 = clienteRepository.findById(39);

        cliente2.orElse(null).setCedula("17012345688");
        cliente2.orElse(null).setNombre("Juan88");
        cliente2.orElse(null).setApellido("Taipe88");
        cliente2.orElse(null).setDireccion("Direccion88");
        cliente2.orElse(null).setTelefono("0978654388");
        cliente2.orElse(null).setCorreo("jtaipe88@correo.com");

        clienteRepository.save(cliente2.orElse(null));


    }

    @Test
    public void testClienteBorrar(){
        clienteRepository.deleteById(39);
    }
}
