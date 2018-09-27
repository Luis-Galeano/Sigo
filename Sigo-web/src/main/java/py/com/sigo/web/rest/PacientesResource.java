/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.sigo.ejb.bean.PacientesBean;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Pacientes;

/**
 *
 * @author Luis Galeano
 */
@Path("pacientes")
public class PacientesResource {
    
    private final Logger logger = LogManager.getLogger(this.getClass());
    @EJB
    PacientesBean pacientesBean;   
     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GenericResponse obtenerPacientes(@QueryParam("idClinica") long idClinica){
        return pacientesBean.obtenerPacientes(idClinica);
    }
     
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("add")
    public GenericResponse agregarPaciente(Pacientes paciente){
        return pacientesBean.agregarPaciente(paciente);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public GenericResponse obtenerDatosPaciente(@PathParam("id") long idPaciente){
        return pacientesBean.obtenerDatosPaciente(idPaciente);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("{id}/historialClinico")
    public GenericResponse obtenerHistorialClinico(@PathParam("id") long idPaciente){
        return pacientesBean.obtenerHistorialClinico(idPaciente);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("update")
    public GenericResponse actualizarDatosPaciente(Pacientes paciente){
        return pacientesBean.actualizarDatosPaciente(paciente);
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("delete")
    public GenericResponse eliminarDatosPaciente(@QueryParam("idPaciente") long idPaciente){
        return pacientesBean.eliminarPaciente(idPaciente);
    }
     
}
