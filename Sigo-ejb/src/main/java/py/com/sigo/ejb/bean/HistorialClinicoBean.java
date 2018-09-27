/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.ejb.bean;

import javax.ejb.Stateless;
import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static py.com.sigo.ejb.Constantes.ESTADO_ERROR;
import static py.com.sigo.ejb.Constantes.ESTADO_EXITO;
import static py.com.sigo.ejb.Constantes.MENSAJE_ERROR;
import static py.com.sigo.ejb.Constantes.MENSAJE_EXITO;
import py.com.sigo.ejb.dao.HistorialClinicoDAO;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.HistorialClinico;

/**
 *
 * @author Luis Galeano
 */
@Stateless
public class HistorialClinicoBean {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Inject
    HistorialClinicoDAO historialDao;
    
    public GenericResponse agregarHistorial(HistorialClinico historial){
        logger.info("IN: {}",historial);
        GenericResponse resp = new GenericResponse();
        try {
            historialDao.insertSelective(historial);
            resp.setDato(historial);
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
    
    public GenericResponse eliminarHistorial(long idHistorial){
        logger.info("IN: {}",idHistorial);
        GenericResponse resp = new GenericResponse();
        try {
            historialDao.deleteByPrimaryKey(idHistorial);
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
    
    public GenericResponse actualizarHistorial(HistorialClinico historial){
        logger.info("IN: {}",historial);
        GenericResponse resp = new GenericResponse();
        try {
            historialDao.updateByPrimaryKey(historial);
            resp.setDato(historial);
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
