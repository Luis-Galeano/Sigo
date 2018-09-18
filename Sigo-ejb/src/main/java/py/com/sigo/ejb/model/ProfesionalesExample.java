package py.com.sigo.ejb.model;

import java.util.ArrayList;
import java.util.List;

public class ProfesionalesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProfesionalesExample() {
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

        public Criteria andIdProfesionalIsNull() {
            addCriterion("id_profesional is null");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalIsNotNull() {
            addCriterion("id_profesional is not null");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalEqualTo(Long value) {
            addCriterion("id_profesional =", value, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalNotEqualTo(Long value) {
            addCriterion("id_profesional <>", value, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalGreaterThan(Long value) {
            addCriterion("id_profesional >", value, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalGreaterThanOrEqualTo(Long value) {
            addCriterion("id_profesional >=", value, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalLessThan(Long value) {
            addCriterion("id_profesional <", value, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalLessThanOrEqualTo(Long value) {
            addCriterion("id_profesional <=", value, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalIn(List<Long> values) {
            addCriterion("id_profesional in", values, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalNotIn(List<Long> values) {
            addCriterion("id_profesional not in", values, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalBetween(Long value1, Long value2) {
            addCriterion("id_profesional between", value1, value2, "idProfesional");
            return (Criteria) this;
        }

        public Criteria andIdProfesionalNotBetween(Long value1, Long value2) {
            addCriterion("id_profesional not between", value1, value2, "idProfesional");
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

        public Criteria andNombresIsNull() {
            addCriterion("nombres is null");
            return (Criteria) this;
        }

        public Criteria andNombresIsNotNull() {
            addCriterion("nombres is not null");
            return (Criteria) this;
        }

        public Criteria andNombresEqualTo(String value) {
            addCriterion("nombres =", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotEqualTo(String value) {
            addCriterion("nombres <>", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThan(String value) {
            addCriterion("nombres >", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresGreaterThanOrEqualTo(String value) {
            addCriterion("nombres >=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThan(String value) {
            addCriterion("nombres <", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLessThanOrEqualTo(String value) {
            addCriterion("nombres <=", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresLike(String value) {
            addCriterion("nombres like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotLike(String value) {
            addCriterion("nombres not like", value, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresIn(List<String> values) {
            addCriterion("nombres in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotIn(List<String> values) {
            addCriterion("nombres not in", values, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresBetween(String value1, String value2) {
            addCriterion("nombres between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andNombresNotBetween(String value1, String value2) {
            addCriterion("nombres not between", value1, value2, "nombres");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNull() {
            addCriterion("apellidos is null");
            return (Criteria) this;
        }

        public Criteria andApellidosIsNotNull() {
            addCriterion("apellidos is not null");
            return (Criteria) this;
        }

        public Criteria andApellidosEqualTo(String value) {
            addCriterion("apellidos =", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotEqualTo(String value) {
            addCriterion("apellidos <>", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThan(String value) {
            addCriterion("apellidos >", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosGreaterThanOrEqualTo(String value) {
            addCriterion("apellidos >=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThan(String value) {
            addCriterion("apellidos <", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLessThanOrEqualTo(String value) {
            addCriterion("apellidos <=", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosLike(String value) {
            addCriterion("apellidos like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotLike(String value) {
            addCriterion("apellidos not like", value, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosIn(List<String> values) {
            addCriterion("apellidos in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotIn(List<String> values) {
            addCriterion("apellidos not in", values, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosBetween(String value1, String value2) {
            addCriterion("apellidos between", value1, value2, "apellidos");
            return (Criteria) this;
        }

        public Criteria andApellidosNotBetween(String value1, String value2) {
            addCriterion("apellidos not between", value1, value2, "apellidos");
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