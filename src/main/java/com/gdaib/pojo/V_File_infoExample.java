package com.gdaib.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class V_File_infoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public V_File_infoExample() {
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

        public Criteria andFileInfoIdIsNull() {
            addCriterion("file_info_id is null");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdIsNotNull() {
            addCriterion("file_info_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdEqualTo(Integer value) {
            addCriterion("file_info_id =", value, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdNotEqualTo(Integer value) {
            addCriterion("file_info_id <>", value, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdGreaterThan(Integer value) {
            addCriterion("file_info_id >", value, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_info_id >=", value, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdLessThan(Integer value) {
            addCriterion("file_info_id <", value, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("file_info_id <=", value, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdIn(List<Integer> values) {
            addCriterion("file_info_id in", values, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdNotIn(List<Integer> values) {
            addCriterion("file_info_id not in", values, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdBetween(Integer value1, Integer value2) {
            addCriterion("file_info_id between", value1, value2, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andFileInfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("file_info_id not between", value1, value2, "fileInfoId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("department like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("department not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andNFirstIdIsNull() {
            addCriterion("n_first_id is null");
            return (Criteria) this;
        }

        public Criteria andNFirstIdIsNotNull() {
            addCriterion("n_first_id is not null");
            return (Criteria) this;
        }

        public Criteria andNFirstIdEqualTo(Integer value) {
            addCriterion("n_first_id =", value, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdNotEqualTo(Integer value) {
            addCriterion("n_first_id <>", value, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdGreaterThan(Integer value) {
            addCriterion("n_first_id >", value, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_first_id >=", value, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdLessThan(Integer value) {
            addCriterion("n_first_id <", value, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_first_id <=", value, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdIn(List<Integer> values) {
            addCriterion("n_first_id in", values, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdNotIn(List<Integer> values) {
            addCriterion("n_first_id not in", values, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdBetween(Integer value1, Integer value2) {
            addCriterion("n_first_id between", value1, value2, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_first_id not between", value1, value2, "nFirstId");
            return (Criteria) this;
        }

        public Criteria andNFirstIsNull() {
            addCriterion("n_first is null");
            return (Criteria) this;
        }

        public Criteria andNFirstIsNotNull() {
            addCriterion("n_first is not null");
            return (Criteria) this;
        }

        public Criteria andNFirstEqualTo(String value) {
            addCriterion("n_first =", value, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstNotEqualTo(String value) {
            addCriterion("n_first <>", value, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstGreaterThan(String value) {
            addCriterion("n_first >", value, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstGreaterThanOrEqualTo(String value) {
            addCriterion("n_first >=", value, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstLessThan(String value) {
            addCriterion("n_first <", value, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstLessThanOrEqualTo(String value) {
            addCriterion("n_first <=", value, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstLike(String value) {
            addCriterion("n_first like", value, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstNotLike(String value) {
            addCriterion("n_first not like", value, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstIn(List<String> values) {
            addCriterion("n_first in", values, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstNotIn(List<String> values) {
            addCriterion("n_first not in", values, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstBetween(String value1, String value2) {
            addCriterion("n_first between", value1, value2, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNFirstNotBetween(String value1, String value2) {
            addCriterion("n_first not between", value1, value2, "nFirst");
            return (Criteria) this;
        }

        public Criteria andNSecIdIsNull() {
            addCriterion("n_sec_id is null");
            return (Criteria) this;
        }

        public Criteria andNSecIdIsNotNull() {
            addCriterion("n_sec_id is not null");
            return (Criteria) this;
        }

        public Criteria andNSecIdEqualTo(Integer value) {
            addCriterion("n_sec_id =", value, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdNotEqualTo(Integer value) {
            addCriterion("n_sec_id <>", value, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdGreaterThan(Integer value) {
            addCriterion("n_sec_id >", value, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_sec_id >=", value, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdLessThan(Integer value) {
            addCriterion("n_sec_id <", value, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdLessThanOrEqualTo(Integer value) {
            addCriterion("n_sec_id <=", value, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdIn(List<Integer> values) {
            addCriterion("n_sec_id in", values, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdNotIn(List<Integer> values) {
            addCriterion("n_sec_id not in", values, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdBetween(Integer value1, Integer value2) {
            addCriterion("n_sec_id between", value1, value2, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("n_sec_id not between", value1, value2, "nSecId");
            return (Criteria) this;
        }

        public Criteria andNSecIsNull() {
            addCriterion("n_sec is null");
            return (Criteria) this;
        }

        public Criteria andNSecIsNotNull() {
            addCriterion("n_sec is not null");
            return (Criteria) this;
        }

        public Criteria andNSecEqualTo(String value) {
            addCriterion("n_sec =", value, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecNotEqualTo(String value) {
            addCriterion("n_sec <>", value, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecGreaterThan(String value) {
            addCriterion("n_sec >", value, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecGreaterThanOrEqualTo(String value) {
            addCriterion("n_sec >=", value, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecLessThan(String value) {
            addCriterion("n_sec <", value, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecLessThanOrEqualTo(String value) {
            addCriterion("n_sec <=", value, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecLike(String value) {
            addCriterion("n_sec like", value, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecNotLike(String value) {
            addCriterion("n_sec not like", value, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecIn(List<String> values) {
            addCriterion("n_sec in", values, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecNotIn(List<String> values) {
            addCriterion("n_sec not in", values, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecBetween(String value1, String value2) {
            addCriterion("n_sec between", value1, value2, "nSec");
            return (Criteria) this;
        }

        public Criteria andNSecNotBetween(String value1, String value2) {
            addCriterion("n_sec not between", value1, value2, "nSec");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("up_time is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("up_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterion("up_time =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterion("up_time <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterion("up_time >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("up_time >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterion("up_time <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("up_time <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterion("up_time in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterion("up_time not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterion("up_time between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("up_time not between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andActionCodeIsNull() {
            addCriterion("action_code is null");
            return (Criteria) this;
        }

        public Criteria andActionCodeIsNotNull() {
            addCriterion("action_code is not null");
            return (Criteria) this;
        }

        public Criteria andActionCodeEqualTo(String value) {
            addCriterion("action_code =", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotEqualTo(String value) {
            addCriterion("action_code <>", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeGreaterThan(String value) {
            addCriterion("action_code >", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("action_code >=", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeLessThan(String value) {
            addCriterion("action_code <", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeLessThanOrEqualTo(String value) {
            addCriterion("action_code <=", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeLike(String value) {
            addCriterion("action_code like", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotLike(String value) {
            addCriterion("action_code not like", value, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeIn(List<String> values) {
            addCriterion("action_code in", values, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotIn(List<String> values) {
            addCriterion("action_code not in", values, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeBetween(String value1, String value2) {
            addCriterion("action_code between", value1, value2, "actionCode");
            return (Criteria) this;
        }

        public Criteria andActionCodeNotBetween(String value1, String value2) {
            addCriterion("action_code not between", value1, value2, "actionCode");
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