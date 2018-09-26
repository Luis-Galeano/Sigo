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
import py.com.sigo.ejb.model.HistorialClinico;
import py.com.sigo.ejb.model.HistorialClinicoExample;

public interface HistorialClinicoMapper {
    @SelectProvider(type=HistorialClinicoSqlProvider.class, method="countByExample")
    long countByExample(HistorialClinicoExample example);

    @DeleteProvider(type=HistorialClinicoSqlProvider.class, method="deleteByExample")
    int deleteByExample(HistorialClinicoExample example);

    @Delete({
        "delete from historial_clinico",
        "where id_historial_clinico = #{idHistorialClinico,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idHistorialClinico);

    @Insert({
        "insert into historial_clinico (id_paciente)",
        "values (#{idPaciente,jdbcType=BIGINT})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idHistorialClinico")
    int insert(HistorialClinico record);

    @InsertProvider(type=HistorialClinicoSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idHistorialClinico")
    int insertSelective(HistorialClinico record);

    @SelectProvider(type=HistorialClinicoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_historial_clinico", property="idHistorialClinico", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT)
    })
    List<HistorialClinico> selectByExampleWithRowbounds(HistorialClinicoExample example, RowBounds rowBounds);

    @SelectProvider(type=HistorialClinicoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_historial_clinico", property="idHistorialClinico", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT)
    })
    List<HistorialClinico> selectByExample(HistorialClinicoExample example);

    @Select({
        "select",
        "id_historial_clinico, id_paciente",
        "from historial_clinico",
        "where id_historial_clinico = #{idHistorialClinico,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_historial_clinico", property="idHistorialClinico", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_paciente", property="idPaciente", jdbcType=JdbcType.BIGINT)
    })
    HistorialClinico selectByPrimaryKey(Long idHistorialClinico);

    @UpdateProvider(type=HistorialClinicoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") HistorialClinico record, @Param("example") HistorialClinicoExample example);

    @UpdateProvider(type=HistorialClinicoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") HistorialClinico record, @Param("example") HistorialClinicoExample example);

    @UpdateProvider(type=HistorialClinicoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(HistorialClinico record);

    @Update({
        "update historial_clinico",
        "set id_paciente = #{idPaciente,jdbcType=BIGINT}",
        "where id_historial_clinico = #{idHistorialClinico,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(HistorialClinico record);
}