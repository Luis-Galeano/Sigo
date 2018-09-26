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
import py.com.sigo.ejb.model.Procedimientos;
import py.com.sigo.ejb.model.ProcedimientosExample;

public interface ProcedimientosMapper {
    @SelectProvider(type=ProcedimientosSqlProvider.class, method="countByExample")
    long countByExample(ProcedimientosExample example);

    @DeleteProvider(type=ProcedimientosSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProcedimientosExample example);

    @Delete({
        "delete from procedimientos",
        "where id_procedimiento = #{idProcedimiento,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idProcedimiento);

    @Insert({
        "insert into procedimientos (id_clinica, nombre, ",
        "costo)",
        "values (#{idClinica,jdbcType=BIGINT}, #{nombre,jdbcType=VARCHAR}, ",
        "#{costo,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idProcedimiento")
    int insert(Procedimientos record);

    @InsertProvider(type=ProcedimientosSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idProcedimiento")
    int insertSelective(Procedimientos record);

    @SelectProvider(type=ProcedimientosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_procedimiento", property="idProcedimiento", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="costo", property="costo", jdbcType=JdbcType.BIGINT)
    })
    List<Procedimientos> selectByExampleWithRowbounds(ProcedimientosExample example, RowBounds rowBounds);

    @SelectProvider(type=ProcedimientosSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_procedimiento", property="idProcedimiento", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="costo", property="costo", jdbcType=JdbcType.BIGINT)
    })
    List<Procedimientos> selectByExample(ProcedimientosExample example);

    @Select({
        "select",
        "id_procedimiento, id_clinica, nombre, costo",
        "from procedimientos",
        "where id_procedimiento = #{idProcedimiento,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_procedimiento", property="idProcedimiento", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT),
        @Result(column="nombre", property="nombre", jdbcType=JdbcType.VARCHAR),
        @Result(column="costo", property="costo", jdbcType=JdbcType.BIGINT)
    })
    Procedimientos selectByPrimaryKey(Long idProcedimiento);

    @UpdateProvider(type=ProcedimientosSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Procedimientos record, @Param("example") ProcedimientosExample example);

    @UpdateProvider(type=ProcedimientosSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Procedimientos record, @Param("example") ProcedimientosExample example);

    @UpdateProvider(type=ProcedimientosSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Procedimientos record);

    @Update({
        "update procedimientos",
        "set id_clinica = #{idClinica,jdbcType=BIGINT},",
          "nombre = #{nombre,jdbcType=VARCHAR},",
          "costo = #{costo,jdbcType=BIGINT}",
        "where id_procedimiento = #{idProcedimiento,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Procedimientos record);
}