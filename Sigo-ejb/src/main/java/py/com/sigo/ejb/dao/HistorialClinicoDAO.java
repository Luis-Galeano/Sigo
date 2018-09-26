package py.com.sigo.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.sigo.ejb.mapper.HistorialClinicoMapper;
import py.com.sigo.ejb.model.HistorialClinico;
import py.com.sigo.ejb.model.HistorialClinicoExample;

@RequestScoped
public class HistorialClinicoDAO extends GenericDAO<HistorialClinico, Long, HistorialClinicoExample, HistorialClinicoMapper> {
    @Inject
    @Mapper
    private HistorialClinicoMapper mapper;

    @Override
    public HistorialClinicoMapper getMapper() {
        return mapper;
    }
}