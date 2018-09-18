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
import py.com.sigo.ejb.model.Agendamientos;
import py.com.sigo.ejb.model.AgendamientosExample;

public interface AgendamientosMapper {
    @SelectProvider(type=AgendamientosSqlProvider.class, method="countByExample")
    long countByExample(AgendamientosExample example);

    @DeleteProvider(type=AgendamientosSqlProvider.class, method="deleteByExample")
    int deleteByExample(AgendamientosExample example);

    @Delete({
        "delete from agendamientos",
        "where id_agendamiento = #{idAgendamiento,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idAgendamiento);

    @Insert({
        "insert into agendamientos (id_profesional, id_paciente, ",
        "fecha)",
        "values (#{idProfesional,jdbcType=BIGINT}, #{idPaciente,jdbcType=BIGINT}, ",
        "#{fecha,jdbcType=DATE})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idAgendamiento")
    int insert(Agendamientos record);

    @InsertProvider(type=AgendamientosSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idAgendamiento")
    int insertSelective(Agendamientos record);

    @SelectProvider(type=AgendamientosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_agendamiento", property="idAgendamiento", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_profesional", property="idProfesional", jdbcType=JdbcType.BIGINT),
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.DATE)
    })
    List<Agendamientos> selectByExampleWithRowbounds(AgendamientosExample example, RowBounds rowBounds);

    @SelectProvider(type=AgendamientosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_agendamiento", property="idAgendamiento", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_profesional", property="idProfesional", jdbcType=JdbcType.BIGINT),
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.DATE)
    })
    List<Agendamientos> selectByExample(AgendamientosExample example);

    @Select({
        "select",
        "id_agendamiento, id_profesional, id_paciente, fecha",
        "from agendamientos",
        "where id_agendamiento = #{idAgendamiento,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_agendamiento", property="idAgendamiento", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_profesional", property="idProfesional", jdbcType=JdbcType.BIGINT),
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT),
        @Result(column="fecha", property="fecha", jdbcType=JdbcType.DATE)
    })
    Agendamientos selectByPrimaryKey(Long idAgendamiento);

    @UpdateProvider(type=AgendamientosSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Agendamientos record, @Param("example") AgendamientosExample example);

    @UpdateProvider(type=AgendamientosSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Agendamientos record, @Param("example") AgendamientosExample example);

    @UpdateProvider(type=AgendamientosSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Agendamientos record);

    @Update({
        "update agendamientos",
        "set id_profesional = #{idProfesional,jdbcType=BIGINT},",
          "id_paciente = #{idPaciente,jdbcType=BIGINT},",
          "fecha = #{fecha,jdbcType=DATE}",
        "where id_agendamiento = #{idAgendamiento,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Agendamientos record);
}