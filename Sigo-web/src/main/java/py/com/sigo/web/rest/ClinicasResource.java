/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.sigo.ejb.bean.ClinicasBean;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Clinicas;

/**
 *
 * @author Luis Galeano
 */
@Path("clinicas")
public class ClinicasResource {
    
    private final Logger logger = LogManager.getLogger(this.getClass());
    @EJB
    ClinicasBean clinicasBean; 
     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GenericResponse obtenerClinicas(){
        return clinicasBean.obtenerClinicas();
    }
     
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}")
    public GenericResponse obtenerDatosClinica(@PathParam("id") long idClinica){
        return clinicasBean.obtenerDatosClinica(idClinica);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("add")
    public GenericResponse agregarNuevaClinica(Clinicas clinica){
        return clinicasBean.agregarnuevaClinica(clinica);
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("update")
    public GenericResponse actualizarDatosClinica(Clinicas clinica){
        return clinicasBean.actualizarDatosClinica(clinica);
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{id}/procedimientos")
    public GenericResponse obtenerProcedimientosClinica(@PathParam("id") long idClinica){
        return clinicasBean.obtenerProcedimientosClinica(idClinica);
    }
}
