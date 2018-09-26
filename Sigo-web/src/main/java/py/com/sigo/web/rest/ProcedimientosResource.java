/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.sigo.ejb.bean.ProcedimientosBean;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Procedimientos;

/**
 *
 * @author Luis Galeano
 */
@Path("procedimientos")
public class ProcedimientosResource {
    
     private final Logger logger = LogManager.getLogger(this.getClass());
     @EJB
     ProcedimientosBean procedimientosBean;
     
     
     @POST
     @Produces(MediaType.APPLICATION_JSON)
     @Path("add")
     public GenericResponse agregarProcedimiento(Procedimientos procedimiento){
         return procedimientosBean.agregarProcedimiento(procedimiento);
     }
     
     @DELETE
     @Produces(MediaType.APPLICATION_JSON)
     @Path("delete")
     public GenericResponse eliminarProcedimiento(@QueryParam("id")long idProcedimiento){
         return procedimientosBean.eliminarProcedimiento(idProcedimiento);
     }
     
     @POST
     @Produces(MediaType.APPLICATION_JSON)
     @Path("update")
     public GenericResponse actualizarProcedimiento(Procedimientos procedimiento){
         return procedimientosBean.actualizarProcedimiento(procedimiento);
     }
     
}
