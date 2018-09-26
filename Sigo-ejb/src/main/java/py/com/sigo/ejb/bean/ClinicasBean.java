/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.ejb.bean;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static py.com.sigo.ejb.Constantes.ESTADO_ERROR;
import static py.com.sigo.ejb.Constantes.ESTADO_EXITO;
import static py.com.sigo.ejb.Constantes.MENSAJE_ERROR;
import static py.com.sigo.ejb.Constantes.MENSAJE_EXITO;
import py.com.sigo.ejb.dao.ClinicasDAO;
import py.com.sigo.ejb.dao.ProcedimientosDAO;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Clinicas;
import py.com.sigo.ejb.model.ClinicasExample;
import py.com.sigo.ejb.model.Procedimientos;
import py.com.sigo.ejb.model.ProcedimientosExample;

/**
 *
 * @author Luis Galeano
 */
@Stateless
public class ClinicasBean {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @Inject
    ClinicasDAO clinicaDao;
    @Inject
    ProcedimientosDAO procedimientoDao;
    
    public GenericResponse obtenerDatosClinica(long idClinica){
        logger.info("IN: {}",idClinica);
        ClinicasExample cexample = new ClinicasExample();
        GenericResponse resp = new GenericResponse();
        Clinicas data = null;
        try {
            cexample.createCriteria().andIdClinicaEqualTo(idClinica);
            data = clinicaDao.selectOneByExample(cexample);
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
    
    public GenericResponse obtenerClinicas(){
        logger.info("IN: ");
        GenericResponse resp = new GenericResponse();
        List<Clinicas> data = null;
        try {
            data = clinicaDao.selectByExample(null);
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
    
    public GenericResponse agregarnuevaClinica(Clinicas clinica){
        logger.info("IN: {}",clinica);
        GenericResponse resp = new GenericResponse();
        try {
            clinicaDao.insertSelective(clinica);
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
    public GenericResponse actualizarDatosClinica(Clinicas clinica){
        logger.info("IN: {}",clinica);
        GenericResponse resp = new GenericResponse();
        try {
            clinicaDao.updateByPrimaryKey(clinica);
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
    
    public GenericResponse obtenerProcedimientosClinica(long idClinica){
        logger.info("IN: {}",idClinica);
        ProcedimientosExample pexample = new ProcedimientosExample();
        GenericResponse resp = new GenericResponse();
        List<Procedimientos> data = null;
        try {
            pexample.createCriteria().andIdClinicaEqualTo(idClinica);
            data = procedimientoDao.selectByExample(pexample);
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
