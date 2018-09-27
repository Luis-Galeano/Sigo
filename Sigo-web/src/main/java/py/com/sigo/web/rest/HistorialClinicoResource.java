/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.sigo.ejb.bean.HistorialClinicoBean;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.HistorialClinico;

/**
 *
 * @author Luis Galeano
 */
@Path("historial-clinico")
public class HistorialClinicoResource {
    
     private final Logger logger = LogManager.getLogger(this.getClass());
     @EJB
     HistorialClinicoBean historialBean;
     
     
     @POST
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     @Path("add")
     public GenericResponse agregarHistorial(HistorialClinico historial){
         return historialBean.agregarHistorial(historial);
     }
     
     @DELETE
     @Produces(MediaType.APPLICATION_JSON)
     @Path("delete")
     public GenericResponse eliminarProcedimiento(@QueryParam("id")long idHistorial){
         return historialBean.eliminarHistorial(idHistorial);
     }
     
     @POST
     @Produces(MediaType.APPLICATION_JSON)
     @Consumes(MediaType.APPLICATION_JSON)
     @Path("update")
     public GenericResponse actualizarProcedimiento(HistorialClinico historial){
         return historialBean.actualizarHistorial(historial);
     }
     
}
