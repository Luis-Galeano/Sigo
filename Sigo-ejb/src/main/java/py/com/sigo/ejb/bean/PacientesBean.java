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
import py.com.sigo.ejb.dao.HistorialClinicoDAO;
import py.com.sigo.ejb.dao.PacientesDAO;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.HistorialClinico;
import py.com.sigo.ejb.model.HistorialClinicoExample;
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
    @Inject
    HistorialClinicoDAO historialDao;
    
    public GenericResponse obtenerPacientes(long idClinica){
        logger.info("IN: {}",idClinica);
        PacientesExample pexample = new PacientesExample();
        GenericResponse resp = new GenericResponse();
        try {
            pexample.createCriteria().andIdClinicaEqualTo(idClinica);
            List<Pacientes> data = pacienteDao.selectByExample(pexample);
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
    
    public GenericResponse obtenerDatosPaciente(long idPaciente){
        logger.info("IN: {}",idPaciente);
        PacientesExample pexample = new PacientesExample();
        GenericResponse resp = new GenericResponse();
        try {
            pexample.createCriteria().andIdPacienteEqualTo(idPaciente);
            Pacientes data = pacienteDao.selectOneByExample(pexample);
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
    
    public GenericResponse agregarPaciente(Pacientes paciente){
        logger.info("IN: {}",paciente);
        GenericResponse resp = new GenericResponse();
        try {
            pacienteDao.insertSelective(paciente);
            resp.setDato(paciente);
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
    
    public GenericResponse actualizarDatosPaciente(Pacientes paciente){
        logger.info("IN: {}",paciente);
        GenericResponse resp = new GenericResponse();
        try {
            pacienteDao.updateByPrimaryKey(paciente);
            resp.setDato(paciente);
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
    
    public GenericResponse eliminarPaciente(long idPaciente){
        logger.info("IN: {}",idPaciente);
        GenericResponse resp = new GenericResponse();
        try {
            pacienteDao.deleteByPrimaryKey(idPaciente);
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
    
    public GenericResponse obtenerHistorialClinico(long  idPaciente){
        logger.info("IN: {}",idPaciente);
        GenericResponse resp = new GenericResponse();
        try {
            HistorialClinicoExample hexample = new HistorialClinicoExample();
            hexample.createCriteria().andIdPacienteEqualTo(idPaciente);
            HistorialClinico data = historialDao.selectOneByExample(hexample);
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
