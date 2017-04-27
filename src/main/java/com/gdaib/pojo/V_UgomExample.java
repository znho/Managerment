package com.gdaib.pojo;

import java.util.ArrayList;
import java.util.List;

public class V_UgomExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V_UgomExample() {
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

        public Criteria andUgomIdIsNull() {
            addCriterion("ugom_id is null");
            return (Criteria) this;
        }

        public Criteria andUgomIdIsNotNull() {
            addCriterion("ugom_id is not null");
            return (Criteria) this;
        }

        public Criteria andUgomIdEqualTo(Integer value) {
            addCriterion("ugom_id =", value, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdNotEqualTo(Integer value) {
            addCriterion("ugom_id <>", value, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdGreaterThan(Integer value) {
            addCriterion("ugom_id >", value, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ugom_id >=", value, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdLessThan(Integer value) {
            addCriterion("ugom_id <", value, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdLessThanOrEqualTo(Integer value) {
            addCriterion("ugom_id <=", value, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdIn(List<Integer> values) {
            addCriterion("ugom_id in", values, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdNotIn(List<Integer> values) {
            addCriterion("ugom_id not in", values, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdBetween(Integer value1, Integer value2) {
            addCriterion("ugom_id between", value1, value2, "ugomId");
            return (Criteria) this;
        }

        public Criteria andUgomIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ugom_id not between", value1, value2, "ugomId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Integer value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Integer value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Integer value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Integer value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Integer> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Integer> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdIsNull() {
            addCriterion("be_acco_id is null");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdIsNotNull() {
            addCriterion("be_acco_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdEqualTo(Integer value) {
            addCriterion("be_acco_id =", value, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdNotEqualTo(Integer value) {
            addCriterion("be_acco_id <>", value, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdGreaterThan(Integer value) {
            addCriterion("be_acco_id >", value, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("be_acco_id >=", value, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdLessThan(Integer value) {
            addCriterion("be_acco_id <", value, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdLessThanOrEqualTo(Integer value) {
            addCriterion("be_acco_id <=", value, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdIn(List<Integer> values) {
            addCriterion("be_acco_id in", values, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdNotIn(List<Integer> values) {
            addCriterion("be_acco_id not in", values, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdBetween(Integer value1, Integer value2) {
            addCriterion("be_acco_id between", value1, value2, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andBeAccoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("be_acco_id not between", value1, value2, "beAccoId");
            return (Criteria) this;
        }

        public Criteria andModuleIsNull() {
            addCriterion("module is null");
            return (Criteria) this;
        }

        public Criteria andModuleIsNotNull() {
            addCriterion("module is not null");
            return (Criteria) this;
        }

        public Criteria andModuleEqualTo(String value) {
            addCriterion("module =", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotEqualTo(String value) {
            addCriterion("module <>", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThan(String value) {
            addCriterion("module >", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleGreaterThanOrEqualTo(String value) {
            addCriterion("module >=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThan(String value) {
            addCriterion("module <", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLessThanOrEqualTo(String value) {
            addCriterion("module <=", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleLike(String value) {
            addCriterion("module like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotLike(String value) {
            addCriterion("module not like", value, "module");
            return (Criteria) this;
        }

        public Criteria andModuleIn(List<String> values) {
            addCriterion("module in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotIn(List<String> values) {
            addCriterion("module not in", values, "module");
            return (Criteria) this;
        }

        public Criteria andModuleBetween(String value1, String value2) {
            addCriterion("module between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andModuleNotBetween(String value1, String value2) {
            addCriterion("module not between", value1, value2, "module");
            return (Criteria) this;
        }

        public Criteria andOperateIsNull() {
            addCriterion("operate is null");
            return (Criteria) this;
        }

        public Criteria andOperateIsNotNull() {
            addCriterion("operate is not null");
            return (Criteria) this;
        }

        public Criteria andOperateEqualTo(String value) {
            addCriterion("operate =", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotEqualTo(String value) {
            addCriterion("operate <>", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThan(String value) {
            addCriterion("operate >", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThanOrEqualTo(String value) {
            addCriterion("operate >=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThan(String value) {
            addCriterion("operate <", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThanOrEqualTo(String value) {
            addCriterion("operate <=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLike(String value) {
            addCriterion("operate like", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotLike(String value) {
            addCriterion("operate not like", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateIn(List<String> values) {
            addCriterion("operate in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotIn(List<String> values) {
            addCriterion("operate not in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateBetween(String value1, String value2) {
            addCriterion("operate between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotBetween(String value1, String value2) {
            addCriterion("operate not between", value1, value2, "operate");
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