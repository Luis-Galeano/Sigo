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
import py.com.sigo.ejb.model.Clinicas;
import py.com.sigo.ejb.model.ClinicasExample;

public interface ClinicasMapper {
    @SelectProvider(type=ClinicasSqlProvider.class, method="countByExample")
    long countByExample(ClinicasExample example);

    @DeleteProvider(type=ClinicasSqlProvider.class, method="deleteByExample")
    int deleteByExample(ClinicasExample example);

    @Delete({
        "delete from clinicas",
        "where id_clinica = #{idClinica,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idClinica);

    @Insert({
        "insert into clinicas (nombre, direccion, ",
        "telefono, dias_atencion, ",
        "horarios_atencion, activo)",
        "values (#{nombre,jdbcType=VARCHAR}, #{direccion,jdbcType=VARCHAR}, ",
        "#{telefono,jdbcType=VARCHAR}, #{diasAtencion,jdbcType=VARCHAR}, ",
        "#{horariosAtencion,jdbcType=VARCHAR}, #{activo,jdbcType=BIT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idClinica")
    int insert(Clinicas record);

    @InsertProvider(type=ClinicasSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idClinica")
    int insertSelective(Clinicas record);

    @SelectProvider(type=ClinicasSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="dias_atencion", property="diasAtencion", jdbcType=JdbcType.VARCHAR),
        @Result(column="horarios_atencion", property="horariosAtencion", jdbcType=JdbcType.VARCHAR),
        @Result(column="activo", property="activo", jdbcType=JdbcType.BIT)
    })
    List<Clinicas> selectByExampleWithRowbounds(ClinicasExample example, RowBounds rowBounds);

    @SelectProvider(type=ClinicasSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="dias_atencion", property="diasAtencion", jdbcType=JdbcType.VARCHAR),
        @Result(column="horarios_atencion", property="horariosAtencion", jdbcType=JdbcType.VARCHAR),
        @Result(column="activo", property="activo", jdbcType=JdbcType.BIT)
    })
    List<Clinicas> selectByExample(ClinicasExample example);

    @Select({
        "select",
        "id_clinica, nombre, direccion, telefono, dias_atencion, horarios_atencion, activo",
        "from clinicas",
        "where id_clinica = #{idClinica,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="direccion", property="direccion", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR),
        @Result(column="dias_atencion", property="diasAtencion", jdbcType=JdbcType.VARCHAR),
        @Result(column="horarios_atencion", property="horariosAtencion", jdbcType=JdbcType.VARCHAR),
        @Result(column="activo", property="activo", jdbcType=JdbcType.BIT)
    })
    Clinicas selectByPrimaryKey(Long idClinica);

    @UpdateProvider(type=ClinicasSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Clinicas record, @Param("example") ClinicasExample example);

    @UpdateProvider(type=ClinicasSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Clinicas record, @Param("example") ClinicasExample example);

    @UpdateProvider(type=ClinicasSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Clinicas record);

    @Update({
        "update clinicas",
        "set nombre = #{nombre,jdbcType=VARCHAR},",
          "direccion = #{direccion,jdbcType=VARCHAR},",
          "telefono = #{telefono,jdbcType=VARCHAR},",
          "dias_atencion = #{diasAtencion,jdbcType=VARCHAR},",
          "horarios_atencion = #{horariosAtencion,jdbcType=VARCHAR},",
          "activo = #{activo,jdbcType=BIT}",
        "where id_clinica = #{idClinica,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Clinicas record);
}