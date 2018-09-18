package py.com.sigo.ejb.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;
import py.com.sigo.ejb.model.Clinicas;
import py.com.sigo.ejb.model.ClinicasExample.Criteria;
import py.com.sigo.ejb.model.ClinicasExample.Criterion;
import py.com.sigo.ejb.model.ClinicasExample;

public class ClinicasSqlProvider {

    public String countByExample(ClinicasExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("clinicas");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(ClinicasExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("clinicas");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(Clinicas record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("clinicas");
        
        if (record.getNombre() != null) {
            sql.VALUES("nombre", "#{nombre,jdbcType=VARCHAR}");
        }
        
        if (record.getDireccion() != null) {
            sql.VALUES("direccion", "#{direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.VALUES("telefono", "#{telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getDiasAtencion() != null) {
            sql.VALUES("dias_atencion", "#{diasAtencion,jdbcType=VARCHAR}");
        }
        
        if (record.getHorariosAtencion() != null) {
            sql.VALUES("horarios_atencion", "#{horariosAtencion,jdbcType=VARCHAR}");
        }
        
        if (record.getActivo() != null) {
            sql.VALUES("activo", "#{activo,jdbcType=BIT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(ClinicasExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id_clinica");
        } else {
            sql.SELECT("id_clinica");
        }
        sql.SELECT("nombre");
        sql.SELECT("direccion");
        sql.SELECT("telefono");
        sql.SELECT("dias_atencion");
        sql.SELECT("horarios_atencion");
        sql.SELECT("activo");
        sql.FROM("clinicas");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Clinicas record = (Clinicas) parameter.get("record");
        ClinicasExample example = (ClinicasExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("clinicas");
        
        if (record.getIdClinica() != null) {
            sql.SET("id_clinica = #{record.idClinica,jdbcType=BIGINT}");
        }
        
        if (record.getNombre() != null) {
            sql.SET("nombre = #{record.nombre,jdbcType=VARCHAR}");
        }
        
        if (record.getDireccion() != null) {
            sql.SET("direccion = #{record.direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.SET("telefono = #{record.telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getDiasAtencion() != null) {
            sql.SET("dias_atencion = #{record.diasAtencion,jdbcType=VARCHAR}");
        }
        
        if (record.getHorariosAtencion() != null) {
            sql.SET("horarios_atencion = #{record.horariosAtencion,jdbcType=VARCHAR}");
        }
        
        if (record.getActivo() != null) {
            sql.SET("activo = #{record.activo,jdbcType=BIT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("clinicas");
        
        sql.SET("id_clinica = #{record.idClinica,jdbcType=BIGINT}");
        sql.SET("nombre = #{record.nombre,jdbcType=VARCHAR}");
        sql.SET("direccion = #{record.direccion,jdbcType=VARCHAR}");
        sql.SET("telefono = #{record.telefono,jdbcType=VARCHAR}");
        sql.SET("dias_atencion = #{record.diasAtencion,jdbcType=VARCHAR}");
        sql.SET("horarios_atencion = #{record.horariosAtencion,jdbcType=VARCHAR}");
        sql.SET("activo = #{record.activo,jdbcType=BIT}");
        
        ClinicasExample example = (ClinicasExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Clinicas record) {
        SQL sql = new SQL();
        sql.UPDATE("clinicas");
        
        if (record.getNombre() != null) {
            sql.SET("nombre = #{nombre,jdbcType=VARCHAR}");
        }
        
        if (record.getDireccion() != null) {
            sql.SET("direccion = #{direccion,jdbcType=VARCHAR}");
        }
        
        if (record.getTelefono() != null) {
            sql.SET("telefono = #{telefono,jdbcType=VARCHAR}");
        }
        
        if (record.getDiasAtencion() != null) {
            sql.SET("dias_atencion = #{diasAtencion,jdbcType=VARCHAR}");
        }
        
        if (record.getHorariosAtencion() != null) {
            sql.SET("horarios_atencion = #{horariosAtencion,jdbcType=VARCHAR}");
        }
        
        if (record.getActivo() != null) {
            sql.SET("activo = #{activo,jdbcType=BIT}");
        }
        
        sql.WHERE("id_clinica = #{idClinica,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, ClinicasExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}