package py.com.sigo.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.sigo.ejb.mapper.PacientesMapper;
import py.com.sigo.ejb.model.Pacientes;
import py.com.sigo.ejb.model.PacientesExample;

@RequestScoped
public class PacientesDAO extends GenericDAO<Pacientes, Long, PacientesExample, PacientesMapper> {
    @Inject
    @Mapper
    private PacientesMapper mapper;

    @Override
    public PacientesMapper getMapper() {
        return mapper;
    }
}