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
import py.com.sigo.ejb.model.Pacientes;
import py.com.sigo.ejb.model.PacientesExample;

public interface PacientesMapper {
    @SelectProvider(type=PacientesSqlProvider.class, method="countByExample")
    long countByExample(PacientesExample example);

    @DeleteProvider(type=PacientesSqlProvider.class, method="deleteByExample")
    int deleteByExample(PacientesExample example);

    @Delete({
        "delete from pacientes",
        "where id_paciente = #{idPaciente,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idPaciente);

    @Insert({
        "insert into pacientes (nombres, apellidos, ",
        "telefono, id_clinica)",
        "values (#{nombres,jdbcType=VARCHAR}, #{apellidos,jdbcType=VARCHAR}, ",
        "#{telefono,jdbcType=VARCHAR}, #{idClinica,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idPaciente")
    int insert(Pacientes record);

    @InsertProvider(type=PacientesSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idPaciente")
    int insertSelective(Pacientes record);

    @SelectProvider(type=PacientesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT)
    })
    List<Pacientes> selectByExampleWithRowbounds(PacientesExample example, RowBounds rowBounds);

    @SelectProvider(type=PacientesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT)
    })
    List<Pacientes> selectByExample(PacientesExample example);

    @Select({
        "select",
        "id_paciente, nombres, apellidos, telefono, id_clinica",
        "from pacientes",
        "where id_paciente = #{idPaciente,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT)
    })
    Pacientes selectByPrimaryKey(Long idPaciente);

    @UpdateProvider(type=PacientesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Pacientes record, @Param("example") PacientesExample example);

    @UpdateProvider(type=PacientesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Pacientes record, @Param("example") PacientesExample example);

    @UpdateProvider(type=PacientesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Pacientes record);

    @Update({
        "update pacientes",
        "set nombres = #{nombres,jdbcType=VARCHAR},",
          "apellidos = #{apellidos,jdbcType=VARCHAR},",
          "telefono = #{telefono,jdbcType=VARCHAR},",
          "id_clinica = #{idClinica,jdbcType=BIGINT}",
        "where id_paciente = #{idPaciente,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Pacientes record);
}