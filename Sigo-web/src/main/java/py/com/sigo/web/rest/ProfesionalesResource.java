/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.sigo.ejb.bean.ProfesionalesBean;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Profesionales;

/**
 *
 * @author Luis Galeano
 */
@Path("profesionales")
public class ProfesionalesResource {
    
    private final Logger logger = LogManager.getLogger(this.getClass());
    @EJB
    ProfesionalesBean profesionalBean;
     
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("add")
    public GenericResponse agregarProfesional(Profesionales profesinal){
        return profesionalBean.agregarProfesional(profesinal);
    }
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public GenericResponse agregarProfesional(@QueryParam("idClinica") long idClinica){
        return profesionalBean.obtenerProfesionales(idClinica);
    }
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Path("update")
    public GenericResponse actualizarProfesional(Profesionales profesinal){
        return profesionalBean.actualizarProfesional(profesinal);
    }
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("delete")
    public GenericResponse eliminarProfesional(long idProfesinal){
        return profesionalBean.eliminarProfesional(idProfesinal);
    }
     
}
