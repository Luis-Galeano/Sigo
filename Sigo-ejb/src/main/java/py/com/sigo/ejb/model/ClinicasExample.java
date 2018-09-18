package py.com.sigo.ejb.model;

import java.util.ArrayList;
import java.util.List;

public class ClinicasExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClinicasExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdClinicaIsNull() {
            addCriterion("id_clinica is null");
            return (Criteria) this;
        }

        public Criteria andIdClinicaIsNotNull() {
            addCriterion("id_clinica is not null");
            return (Criteria) this;
        }

        public Criteria andIdClinicaEqualTo(Long value) {
            addCriterion("id_clinica =", value, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaNotEqualTo(Long value) {
            addCriterion("id_clinica <>", value, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaGreaterThan(Long value) {
            addCriterion("id_clinica >", value, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaGreaterThanOrEqualTo(Long value) {
            addCriterion("id_clinica >=", value, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaLessThan(Long value) {
            addCriterion("id_clinica <", value, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaLessThanOrEqualTo(Long value) {
            addCriterion("id_clinica <=", value, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaIn(List<Long> values) {
            addCriterion("id_clinica in", values, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaNotIn(List<Long> values) {
            addCriterion("id_clinica not in", values, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaBetween(Long value1, Long value2) {
            addCriterion("id_clinica between", value1, value2, "idClinica");
            return (Criteria) this;
        }

        public Criteria andIdClinicaNotBetween(Long value1, Long value2) {
            addCriterion("id_clinica not between", value1, value2, "idClinica");
            return (Criteria) this;
        }

        public Criteria andNombreIsNull() {
            addCriterion("nombre is null");
            return (Criteria) this;
        }

        public Criteria andNombreIsNotNull() {
            addCriterion("nombre is not null");
            return (Criteria) this;
        }

        public Criteria andNombreEqualTo(String value) {
            addCriterion("nombre =", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotEqualTo(String value) {
            addCriterion("nombre <>", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThan(String value) {
            addCriterion("nombre >", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreGreaterThanOrEqualTo(String value) {
            addCriterion("nombre >=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThan(String value) {
            addCriterion("nombre <", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLessThanOrEqualTo(String value) {
            addCriterion("nombre <=", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreLike(String value) {
            addCriterion("nombre like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotLike(String value) {
            addCriterion("nombre not like", value, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreIn(List<String> values) {
            addCriterion("nombre in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotIn(List<String> values) {
            addCriterion("nombre not in", values, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreBetween(String value1, String value2) {
            addCriterion("nombre between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andNombreNotBetween(String value1, String value2) {
            addCriterion("nombre not between", value1, value2, "nombre");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNull() {
            addCriterion("direccion is null");
            return (Criteria) this;
        }

        public Criteria andDireccionIsNotNull() {
            addCriterion("direccion is not null");
            return (Criteria) this;
        }

        public Criteria andDireccionEqualTo(String value) {
            addCriterion("direccion =", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotEqualTo(String value) {
            addCriterion("direccion <>", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThan(String value) {
            addCriterion("direccion >", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionGreaterThanOrEqualTo(String value) {
            addCriterion("direccion >=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThan(String value) {
            addCriterion("direccion <", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLessThanOrEqualTo(String value) {
            addCriterion("direccion <=", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionLike(String value) {
            addCriterion("direccion like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotLike(String value) {
            addCriterion("direccion not like", value, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionIn(List<String> values) {
            addCriterion("direccion in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotIn(List<String> values) {
            addCriterion("direccion not in", values, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionBetween(String value1, String value2) {
            addCriterion("direccion between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andDireccionNotBetween(String value1, String value2) {
            addCriterion("direccion not between", value1, value2, "direccion");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNull() {
            addCriterion("telefono is null");
            return (Criteria) this;
        }

        public Criteria andTelefonoIsNotNull() {
            addCriterion("telefono is not null");
            return (Criteria) this;
        }

        public Criteria andTelefonoEqualTo(String value) {
            addCriterion("telefono =", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotEqualTo(String value) {
            addCriterion("telefono <>", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThan(String value) {
            addCriterion("telefono >", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoGreaterThanOrEqualTo(String value) {
            addCriterion("telefono >=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThan(String value) {
            addCriterion("telefono <", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLessThanOrEqualTo(String value) {
            addCriterion("telefono <=", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoLike(String value) {
            addCriterion("telefono like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotLike(String value) {
            addCriterion("telefono not like", value, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoIn(List<String> values) {
            addCriterion("telefono in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotIn(List<String> values) {
            addCriterion("telefono not in", values, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoBetween(String value1, String value2) {
            addCriterion("telefono between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andTelefonoNotBetween(String value1, String value2) {
            addCriterion("telefono not between", value1, value2, "telefono");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionIsNull() {
            addCriterion("dias_atencion is null");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionIsNotNull() {
            addCriterion("dias_atencion is not null");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionEqualTo(String value) {
            addCriterion("dias_atencion =", value, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionNotEqualTo(String value) {
            addCriterion("dias_atencion <>", value, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionGreaterThan(String value) {
            addCriterion("dias_atencion >", value, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionGreaterThanOrEqualTo(String value) {
            addCriterion("dias_atencion >=", value, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionLessThan(String value) {
            addCriterion("dias_atencion <", value, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionLessThanOrEqualTo(String value) {
            addCriterion("dias_atencion <=", value, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionLike(String value) {
            addCriterion("dias_atencion like", value, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionNotLike(String value) {
            addCriterion("dias_atencion not like", value, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionIn(List<String> values) {
            addCriterion("dias_atencion in", values, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionNotIn(List<String> values) {
            addCriterion("dias_atencion not in", values, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionBetween(String value1, String value2) {
            addCriterion("dias_atencion between", value1, value2, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andDiasAtencionNotBetween(String value1, String value2) {
            addCriterion("dias_atencion not between", value1, value2, "diasAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionIsNull() {
            addCriterion("horarios_atencion is null");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionIsNotNull() {
            addCriterion("horarios_atencion is not null");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionEqualTo(String value) {
            addCriterion("horarios_atencion =", value, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionNotEqualTo(String value) {
            addCriterion("horarios_atencion <>", value, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionGreaterThan(String value) {
            addCriterion("horarios_atencion >", value, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionGreaterThanOrEqualTo(String value) {
            addCriterion("horarios_atencion >=", value, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionLessThan(String value) {
            addCriterion("horarios_atencion <", value, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionLessThanOrEqualTo(String value) {
            addCriterion("horarios_atencion <=", value, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionLike(String value) {
            addCriterion("horarios_atencion like", value, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionNotLike(String value) {
            addCriterion("horarios_atencion not like", value, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionIn(List<String> values) {
            addCriterion("horarios_atencion in", values, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionNotIn(List<String> values) {
            addCriterion("horarios_atencion not in", values, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionBetween(String value1, String value2) {
            addCriterion("horarios_atencion between", value1, value2, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andHorariosAtencionNotBetween(String value1, String value2) {
            addCriterion("horarios_atencion not between", value1, value2, "horariosAtencion");
            return (Criteria) this;
        }

        public Criteria andActivoIsNull() {
            addCriterion("activo is null");
            return (Criteria) this;
        }

        public Criteria andActivoIsNotNull() {
            addCriterion("activo is not null");
            return (Criteria) this;
        }

        public Criteria andActivoEqualTo(Boolean value) {
            addCriterion("activo =", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotEqualTo(Boolean value) {
            addCriterion("activo <>", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoGreaterThan(Boolean value) {
            addCriterion("activo >", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("activo >=", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoLessThan(Boolean value) {
            addCriterion("activo <", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoLessThanOrEqualTo(Boolean value) {
            addCriterion("activo <=", value, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoIn(List<Boolean> values) {
            addCriterion("activo in", values, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotIn(List<Boolean> values) {
            addCriterion("activo not in", values, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoBetween(Boolean value1, Boolean value2) {
            addCriterion("activo between", value1, value2, "activo");
            return (Criteria) this;
        }

        public Criteria andActivoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("activo not between", value1, value2, "activo");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}