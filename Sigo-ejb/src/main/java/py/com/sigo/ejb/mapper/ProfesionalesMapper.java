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
import py.com.sigo.ejb.model.Profesionales;
import py.com.sigo.ejb.model.ProfesionalesExample;

public interface ProfesionalesMapper {
    @SelectProvider(type=ProfesionalesSqlProvider.class, method="countByExample")
    long countByExample(ProfesionalesExample example);

    @DeleteProvider(type=ProfesionalesSqlProvider.class, method="deleteByExample")
    int deleteByExample(ProfesionalesExample example);

    @Delete({
        "delete from profesionales",
        "where id_profesional = #{idProfesional,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long idProfesional);

    @Insert({
        "insert into profesionales (id_clinica, nombres, ",
        "apellidos, telefono)",
        "values (#{idClinica,jdbcType=BIGINT}, #{nombres,jdbcType=VARCHAR}, ",
        "#{apellidos,jdbcType=VARCHAR}, #{telefono,jdbcType=VARCHAR})"
    })
    @Options(useGeneratedKeys=true,keyProperty="idProfesional")
    int insert(Profesionales record);

    @InsertProvider(type=ProfesionalesSqlProvider.class, method="insertSelective")
    @Options(useGeneratedKeys=true,keyProperty="idProfesional")
    int insertSelective(Profesionales record);

    @SelectProvider(type=ProfesionalesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_profesional", property="idProfesional", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR)
    })
    List<Profesionales> selectByExampleWithRowbounds(ProfesionalesExample example, RowBounds rowBounds);

    @SelectProvider(type=ProfesionalesSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id_profesional", property="idProfesional", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR)
    })
    List<Profesionales> selectByExample(ProfesionalesExample example);

    @Select({
        "select",
        "id_profesional, id_clinica, nombres, apellidos, telefono",
        "from profesionales",
        "where id_profesional = #{idProfesional,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id_profesional", property="idProfesional", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="id_clinica", property="idClinica", jdbcType=JdbcType.BIGINT),
        @Result(column="nombres", property="nombres", jdbcType=JdbcType.VARCHAR),
        @Result(column="apellidos", property="apellidos", jdbcType=JdbcType.VARCHAR),
        @Result(column="telefono", property="telefono", jdbcType=JdbcType.VARCHAR)
    })
    Profesionales selectByPrimaryKey(Long idProfesional);

    @UpdateProvider(type=ProfesionalesSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Profesionales record, @Param("example") ProfesionalesExample example);

    @UpdateProvider(type=ProfesionalesSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Profesionales record, @Param("example") ProfesionalesExample example);

    @UpdateProvider(type=ProfesionalesSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Profesionales record);

    @Update({
        "update profesionales",
        "set id_clinica = #{idClinica,jdbcType=BIGINT},",
          "nombres = #{nombres,jdbcType=VARCHAR},",
          "apellidos = #{apellidos,jdbcType=VARCHAR},",
          "telefono = #{telefono,jdbcType=VARCHAR}",
        "where id_profesional = #{idProfesional,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Profesionales record);
}