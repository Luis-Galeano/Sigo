package py.com.sigo.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.sigo.ejb.mapper.ConsultasMapper;
import py.com.sigo.ejb.model.Consultas;
import py.com.sigo.ejb.model.ConsultasExample;

@RequestScoped
public class ConsultasDAO extends GenericDAO<Consultas, Long, ConsultasExample, ConsultasMapper> {
    @Inject
    @Mapper
    private ConsultasMapper mapper;

    @Override
    public ConsultasMapper getMapper() {
        return mapper;
    }
}