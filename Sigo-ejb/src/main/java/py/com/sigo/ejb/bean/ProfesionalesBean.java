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
import py.com.sigo.ejb.dao.ProfesionalesDAO;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Profesionales;
import py.com.sigo.ejb.model.ProfesionalesExample;

/**
 *
 * @author Luis Galeano
 */
@Stateless
public class ProfesionalesBean {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Inject
    ProfesionalesDAO profesinalDao;
    
    public GenericResponse agregarProfesional(Profesionales profesional){
        logger.info("IN: {}",profesional);
        GenericResponse resp = new GenericResponse();
        try {
            profesinalDao.insertSelective(profesional);
            resp.setDato(profesional);
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
    
    public GenericResponse obtenerProfesionales(long idClinica){
        logger.info("IN: {}",idClinica);
        GenericResponse resp = new GenericResponse();
        try {
            ProfesionalesExample pexample = new ProfesionalesExample();
            pexample.createCriteria().andIdClinicaEqualTo(idClinica);
            List<Profesionales> data  = profesinalDao.selectByExample(pexample);
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
    
    public GenericResponse actualizarProfesional(Profesionales profesional){
        logger.info("IN: {}",profesional);
        GenericResponse resp = new GenericResponse();
        try {
            profesinalDao.updateByPrimaryKey(profesional);
            resp.setDato(profesional);
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
    
    public GenericResponse eliminarProfesional(long idProfesional){
        logger.info("IN: {}",idProfesional);
        GenericResponse resp = new GenericResponse();
        try {
            profesinalDao.deleteByPrimaryKey(idProfesional);
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
