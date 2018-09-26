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
import py.com.sigo.ejb.dao.ProcedimientosDAO;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Procedimientos;

/**
 *
 * @author Luis Galeano
 */
@Stateless
public class ProcedimientosBean {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Inject
    ProcedimientosDAO procedimientoDao;
    
    public GenericResponse agregarProcedimiento(Procedimientos procedimiento){
        logger.info("IN: {}",procedimiento);
        GenericResponse resp = new GenericResponse();
        try {
            procedimientoDao.insertSelective(procedimiento);
            resp.setDato(procedimiento);
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
    
    public GenericResponse eliminarProcedimiento(long idProcedimiento){
        logger.info("IN: {}",idProcedimiento);
        GenericResponse resp = new GenericResponse();
        try {
            procedimientoDao.deleteByPrimaryKey(idProcedimiento);
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
    
    public GenericResponse actualizarProcedimiento(Procedimientos procedimiento){
        logger.info("IN: {}",procedimiento);
        GenericResponse resp = new GenericResponse();
        try {
            procedimientoDao.updateByPrimaryKey(procedimiento);
            resp.setDato(procedimiento);
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
