package com.distribuida.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClienteTestUnitaria {

    private Cliente cliente;


    @BeforeEach
    public void setUp(){
        cliente = new Cliente(1,"1701234567","Juan","Taipe","Direccion1","0987654321","jtaipe@correo.com");
    }


    @Test
    public void testClienteConstructor(){
        assertAll("Validar datos Cliente - Constructor",
                () -> assertEquals(1, cliente.getIdCliente()),
                () -> assertEquals("1701234567", cliente.getCedula()),
                () -> assertEquals("Juan", cliente.getNombre()),
                () -> assertEquals("Taipe", cliente.getApellido()),
                () -> assertEquals("Direccion1", cliente.getDireccion()),
                () -> assertEquals("0987654321", cliente.getTelefono()),
                () -> assertEquals("jtaipe@correo.com", cliente.getCorreo())
        );
    }


    @Test
    public void testClienteSetters(){
        cliente.setIdCliente(2);
        cliente.setCedula("1701234522");
        cliente.setNombre("Juan2");
        cliente.setApellido("Taipe2");
        cliente.setDireccion("Direccion2");
        cliente.setTelefono("0987654222");
        cliente.setCorreo("jtaipe22@correo.com");

        assertAll("Validar datos Cliente - Setters",
                () -> assertEquals(2, cliente.getIdCliente()),
                () -> assertEquals("1701234522", cliente.getCedula()),
                () -> assertEquals("Juan2", cliente.getNombre()),
                () -> assertEquals("Taipe2", cliente.getApellido()),
                () -> assertEquals("Direccion2", cliente.getDireccion()),
                () -> assertEquals("0987654222", cliente.getTelefono()),
                () -> assertEquals("jtaipe22@correo.com", cliente.getCorreo())
        );

    }




}
