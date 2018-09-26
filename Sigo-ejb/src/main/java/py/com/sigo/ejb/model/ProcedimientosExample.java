package py.com.sigo.ejb.model;

import java.util.ArrayList;
import java.util.List;

public class ProcedimientosExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcedimientosExample() {
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

        public Criteria andIdProcedimientoIsNull() {
            addCriterion("id_procedimiento is null");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoIsNotNull() {
            addCriterion("id_procedimiento is not null");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoEqualTo(Long value) {
            addCriterion("id_procedimiento =", value, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoNotEqualTo(Long value) {
            addCriterion("id_procedimiento <>", value, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoGreaterThan(Long value) {
            addCriterion("id_procedimiento >", value, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoGreaterThanOrEqualTo(Long value) {
            addCriterion("id_procedimiento >=", value, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoLessThan(Long value) {
            addCriterion("id_procedimiento <", value, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoLessThanOrEqualTo(Long value) {
            addCriterion("id_procedimiento <=", value, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoIn(List<Long> values) {
            addCriterion("id_procedimiento in", values, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoNotIn(List<Long> values) {
            addCriterion("id_procedimiento not in", values, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoBetween(Long value1, Long value2) {
            addCriterion("id_procedimiento between", value1, value2, "idProcedimiento");
            return (Criteria) this;
        }

        public Criteria andIdProcedimientoNotBetween(Long value1, Long value2) {
            addCriterion("id_procedimiento not between", value1, value2, "idProcedimiento");
            return (Criteria) this;
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

        public Criteria andCostoIsNull() {
            addCriterion("costo is null");
            return (Criteria) this;
        }

        public Criteria andCostoIsNotNull() {
            addCriterion("costo is not null");
            return (Criteria) this;
        }

        public Criteria andCostoEqualTo(Long value) {
            addCriterion("costo =", value, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoNotEqualTo(Long value) {
            addCriterion("costo <>", value, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoGreaterThan(Long value) {
            addCriterion("costo >", value, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoGreaterThanOrEqualTo(Long value) {
            addCriterion("costo >=", value, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoLessThan(Long value) {
            addCriterion("costo <", value, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoLessThanOrEqualTo(Long value) {
            addCriterion("costo <=", value, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoIn(List<Long> values) {
            addCriterion("costo in", values, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoNotIn(List<Long> values) {
            addCriterion("costo not in", values, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoBetween(Long value1, Long value2) {
            addCriterion("costo between", value1, value2, "costo");
            return (Criteria) this;
        }

        public Criteria andCostoNotBetween(Long value1, Long value2) {
            addCriterion("costo not between", value1, value2, "costo");
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