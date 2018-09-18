package py.com.sigo.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.sigo.ejb.mapper.AgendamientosMapper;
import py.com.sigo.ejb.model.Agendamientos;
import py.com.sigo.ejb.model.AgendamientosExample;

@RequestScoped
public class AgendamientosDAO extends GenericDAO<Agendamientos, Long, AgendamientosExample, AgendamientosMapper> {
    @Inject
    @Mapper
    private AgendamientosMapper mapper;

    @Override
    public AgendamientosMapper getMapper() {
        return mapper;
    }
}