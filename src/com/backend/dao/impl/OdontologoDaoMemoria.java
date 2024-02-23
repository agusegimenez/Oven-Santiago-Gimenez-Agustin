package com.backend.dao.impl;

import com.backend.dao.IDao;
import com.backend.entity.Odontologo;

import java.util.List;
import org.apache.log4j.Logger;

public class OdontologoDaoMemoria implements IDao<Odontologo> {

    private final Logger LOGGER = Logger.getLogger(OdontologoDaoMemoria.class);
    private List<Odontologo> odontologoRepository;

    public OdontologoDaoMemoria(List<Odontologo> odontologoRepository) {
        this.odontologoRepository = odontologoRepository;
    }

    @Override
    public Odontologo registrar(Odontologo odontologo) {
        int id = odontologoRepository.size() + 1;
        Odontologo odontologoGuardado = new Odontologo(id, odontologo.getMatricula(), odontologo.getNombre(), odontologo.getApellido());
        odontologoRepository.add(odontologo);
        LOGGER.info("Odontólogo guardado: " + odontologoGuardado);
        return odontologoGuardado;
    }

    @Override
    public List<Odontologo> listarTodos() {
        LOGGER.info("Listando todos los odontólogos:");
        for (Odontologo odontologo : odontologoRepository) {
            LOGGER.info("Odontólogo ID: " + odontologo.getId() +
                    ", Matrícula: " + odontologo.getMatricula() +
                    ", Nombre: " + odontologo.getNombre() +
                    ", Apellido: " + odontologo.getApellido());
        }
        return odontologoRepository;
    }

}
