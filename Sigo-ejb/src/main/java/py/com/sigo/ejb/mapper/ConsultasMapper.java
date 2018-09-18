package py.com.sigo.ejb.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import py.com.sigo.ejb.model.Consultas;
import py.com.sigo.ejb.model.ConsultasExample;

public interface ConsultasMapper {
    @SelectProvider(type=ConsultasSqlProvider.class, method="countByExample")
    long countByExample(ConsultasExample example);

    @DeleteProvider(type=ConsultasSqlProvider.class, method="deleteByExample")
    int deleteByExample(ConsultasExample example);

    @Delete({
        "delete from consultas",
        "where id_consulta = #{idConsulta,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idConsulta);

    @Insert({
        "insert into consultas (id_agendamiento)",
        "values (#{idAgendamiento,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idConsulta")
    int insert(Consultas record);

    @InsertProvider(type=ConsultasSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idConsulta")
    int insertSelective(Consultas record);

    @SelectProvider(type=ConsultasSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_consulta", property="idConsulta", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_agendamiento", property="idAgendamiento", jdbcType=JdbcType.BIGINT)
    })
    List<Consultas> selectByExampleWithRowbounds(ConsultasExample example, RowBounds rowBounds);

    @SelectProvider(type=ConsultasSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_consulta", property="idConsulta", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_agendamiento", property="idAgendamiento", jdbcType=JdbcType.BIGINT)
    })
    List<Consultas> selectByExample(ConsultasExample example);

    @Select({
        "select",
        "id_consulta, id_agendamiento",
        "from consultas",
        "where id_consulta = #{idConsulta,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_consulta", property="idConsulta", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_agendamiento", property="idAgendamiento", jdbcType=JdbcType.BIGINT)
    })
    Consultas selectByPrimaryKey(Long idConsulta);

    @UpdateProvider(type=ConsultasSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Consultas record, @Param("example") ConsultasExample example);

    @UpdateProvider(type=ConsultasSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Consultas record, @Param("example") ConsultasExample example);

    @UpdateProvider(type=ConsultasSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Consultas record);

    @Update({
        "update consultas",
        "set id_agendamiento = #{idAgendamiento,jdbcType=BIGINT}",
        "where id_consulta = #{idConsulta,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Consultas record);
}