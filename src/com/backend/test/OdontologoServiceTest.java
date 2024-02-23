package com.backend.test;

import com.backend.dao.impl.OdontologoDaoH2;
import com.backend.dao.impl.OdontologoDaoMemoria;
import com.backend.entity.Odontologo;
import com.backend.service.impl.OdontologoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import static org.junit.jupiter.api.Assertions.*;

class OdontologoServiceTest {
    private OdontologoService odontologoService;
    private final Logger LOGGER = Logger.getLogger(OdontologoService.class);
    @Test
    void deberiaDevolverElListadoDeTodosLosOdontologosEnH2(){
        odontologoService = new OdontologoService(new OdontologoDaoH2());
        List<Odontologo> odontologoLista = odontologoService.listarOdontologos();
        LOGGER.info(odontologoLista);
        Assertions.assertTrue(odontologoLista != null);
    }
    @Test
    void deberiaDevolverElListadoDeTodosLosOdontologosEnMemoria(){
        odontologoService = new OdontologoService(new OdontologoDaoMemoria(new ArrayList<>()));
        Odontologo odontologo = new Odontologo(5555,"JuanPe","Rodriguez");
        List<Odontologo> odontologoLista = odontologoService.listarOdontologos();
        odontologoLista.add(odontologo);
        LOGGER.info(odontologoLista);
        Assertions.assertTrue(odontologoLista != null);
    }

}