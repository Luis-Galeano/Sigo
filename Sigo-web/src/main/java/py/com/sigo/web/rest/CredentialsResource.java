/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.com.sigo.web.rest;

import java.util.Map;
import javax.ejb.EJB;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import static py.com.sigo.ejb.Constantes.ESTADO_ERROR;
import static py.com.sigo.ejb.Constantes.MENSAJE_ERROR;
import py.com.sigo.ejb.bean.CredentialsBean;
import py.com.sigo.ejb.dto.GenericResponse;
import py.com.sigo.ejb.model.Credential;
import py.com.sigo.ejb.model.KeyCloakUser;

/**
 *
 * @author Luis Galeano
 */
@Path("password")
public class CredentialsResource {
    private final Logger logger = LogManager.getLogger(this.getClass());
    @EJB
    CredentialsBean credentialsBean;
    
    @Context
    private HttpServletRequest request;
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("restore")
    public GenericResponse restorePaswword(KeyCloakUser user) {
        logger.info("IN: {}",user);
        return credentialsBean.restoreCredentials(user.getEmail());
    }
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("update")
    public GenericResponse updatePaswword(Map<String,Object> mapCredential) {
        logger.info("IN: {}",mapCredential);
        String header = request.getHeader("Authorization");
        GenericResponse resp = new GenericResponse();
        try {
            String acPass = (String)mapCredential.get("actualPassword");
            String nwPass = (String)mapCredential.get("newPassword");
            Credential credential = new Credential();
            credential.setTemporary(false);
            credential.setType("password");
            credential.setValue(nwPass);
            resp =  credentialsBean.updateCredentials(credential,acPass, header);
        } catch (Exception e) {
            resp.setEstado(ESTADO_ERROR);
            resp.setMensaje(MENSAJE_ERROR);
            logger.error("",e);
        }
        return resp;
    }
}
