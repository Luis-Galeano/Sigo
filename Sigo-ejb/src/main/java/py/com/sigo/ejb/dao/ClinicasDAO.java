package py.com.sigo.ejb.dao;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import org.mybatis.cdi.Mapper;
import py.com.sigo.ejb.mapper.ClinicasMapper;
import py.com.sigo.ejb.model.Clinicas;
import py.com.sigo.ejb.model.ClinicasExample;

@RequestScoped
public class ClinicasDAO extends GenericDAO<Clinicas, Long, ClinicasExample, ClinicasMapper> {
    @Inject
    @Mapper
    private ClinicasMapper mapper;

    @Override
    public ClinicasMapper getMapper() {
        return mapper;
    }
}