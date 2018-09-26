package py.com.sigo.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.sigo.ejb.mapper.ProcedimientosMapper;
import py.com.sigo.ejb.model.Procedimientos;
import py.com.sigo.ejb.model.ProcedimientosExample;

@RequestScoped
public class ProcedimientosDAO extends GenericDAO<Procedimientos, Long, ProcedimientosExample, ProcedimientosMapper> {
    @Inject
    @Mapper
    private ProcedimientosMapper mapper;

    @Override
    public ProcedimientosMapper getMapper() {
        return mapper;
    }
}