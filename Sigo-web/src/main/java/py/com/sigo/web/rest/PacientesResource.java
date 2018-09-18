/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.web.rest;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import py.com.sigo.ejb.bean.PacientesBean;
import py.com.sigo.ejb.dto.GenericResponse;

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
     public GenericResponse obtenerPacientes(){
         return pacientesBean.obtenerPacientes();
     }
     
}
