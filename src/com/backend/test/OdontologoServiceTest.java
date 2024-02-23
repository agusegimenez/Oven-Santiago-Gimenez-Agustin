package com.backend.test;

import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.dao.impl.OdontologoDaoMemoria;
import com.backend.entity.Odontologo;
import com.backend.service.impl.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import org.apache.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private OdontologoService odontologoService;
    private final Logger LOGGER = Logger.getLogger(OdontologoService.class);
    @Test
    void deberiaDevolverElListadoDeTodosLosOdontologosEnH2(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());
        Odontologo odontologo = new Odontologo(1234, "Santiago","Oven");
        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);
        LOGGER.info(odontologoRegistrado);
        Assertions.assertTrue(odontologoRegistrado.getId() != 0);
    }
    @Test
    void deberiaDevolverElListadoDeTodosLosOdontologosEnMemoria(){
        odontologoService = new OdontologoService(new OdontologoDaoMemoria(new ArrayList<>()));
        Odontologo odontologo = new Odontologo(1234, "Agustin","Gimenez");
        Odontologo odontologoRegistrado = odontologoService.registrarOdontologo(odontologo);
        LOGGER.info(odontologoRegistrado);
        Assertions.assertTrue(odontologoRegistrado!=null);
    }

}