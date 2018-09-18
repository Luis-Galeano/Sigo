/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.ejb.bean;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static py.com.sigo.ejb.Constantes.ESTADO_ERROR;
import static py.com.sigo.ejb.Constantes.ESTADO_EXITO;
import static py.com.sigo.ejb.Constantes.MENSAJE_ERROR;
import static py.com.sigo.ejb.Constantes.MENSAJE_EXITO;
import py.com.sigo.ejb.dao.PacientesDAO;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Pacientes;
import py.com.sigo.ejb.model.PacientesExample;

/**
 *
 * @author Luis Galeano
 */
@Stateless
public class PacientesBean {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Inject
    PacientesDAO pacienteDao;
    
    public GenericResponse obtenerPacientes(){
        PacientesExample pexample = new PacientesExample();
        GenericResponse resp = new GenericResponse();
        List<Pacientes> data = new ArrayList<>();
        try {
            data = pacienteDao.selectByExample(null);
            resp.setDato(data);
            resp.setMensaje(MENSAJE_EXITO);
            resp.setEstado(ESTADO_EXITO);
        } catch (Exception e) {
            resp.setMensaje(MENSAJE_ERROR);
            resp.setEstado(ESTADO_ERROR);
            logger.error("",e);
        }
        logger.info("OUT: {}",resp);
        return resp;
    }
}
