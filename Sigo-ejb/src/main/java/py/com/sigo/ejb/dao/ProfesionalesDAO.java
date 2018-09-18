package py.com.sigo.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.sigo.ejb.mapper.ProfesionalesMapper;
import py.com.sigo.ejb.model.Profesionales;
import py.com.sigo.ejb.model.ProfesionalesExample;

@RequestScoped
public class ProfesionalesDAO extends GenericDAO<Profesionales, Long, ProfesionalesExample, ProfesionalesMapper> {
    @Inject
    @Mapper
    private ProfesionalesMapper mapper;

    @Override
    public ProfesionalesMapper getMapper() {
        return mapper;
    }
}