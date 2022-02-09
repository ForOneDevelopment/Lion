package com.one.doc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DocumentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DocumentExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDocument_idIsNull() {
            addCriterion("document_id is null");
            return (Criteria) this;
        }

        public Criteria andDocument_idIsNotNull() {
            addCriterion("document_id is not null");
            return (Criteria) this;
        }

        public Criteria andDocument_idEqualTo(Integer value) {
            addCriterion("document_id =", value, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idNotEqualTo(Integer value) {
            addCriterion("document_id <>", value, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idGreaterThan(Integer value) {
            addCriterion("document_id >", value, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("document_id >=", value, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idLessThan(Integer value) {
            addCriterion("document_id <", value, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idLessThanOrEqualTo(Integer value) {
            addCriterion("document_id <=", value, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idIn(List<Integer> values) {
            addCriterion("document_id in", values, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idNotIn(List<Integer> values) {
            addCriterion("document_id not in", values, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idBetween(Integer value1, Integer value2) {
            addCriterion("document_id between", value1, value2, "document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_idNotBetween(Integer value1, Integer value2) {
            addCriterion("document_id not between", value1, value2, "document_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idIsNull() {
            addCriterion("version_id is null");
            return (Criteria) this;
        }

        public Criteria andVersion_idIsNotNull() {
            addCriterion("version_id is not null");
            return (Criteria) this;
        }

        public Criteria andVersion_idEqualTo(Integer value) {
            addCriterion("version_id =", value, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idNotEqualTo(Integer value) {
            addCriterion("version_id <>", value, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idGreaterThan(Integer value) {
            addCriterion("version_id >", value, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("version_id >=", value, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idLessThan(Integer value) {
            addCriterion("version_id <", value, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idLessThanOrEqualTo(Integer value) {
            addCriterion("version_id <=", value, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idIn(List<Integer> values) {
            addCriterion("version_id in", values, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idNotIn(List<Integer> values) {
            addCriterion("version_id not in", values, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idBetween(Integer value1, Integer value2) {
            addCriterion("version_id between", value1, value2, "version_id");
            return (Criteria) this;
        }

        public Criteria andVersion_idNotBetween(Integer value1, Integer value2) {
            addCriterion("version_id not between", value1, value2, "version_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idIsNull() {
            addCriterion("history_document_id is null");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idIsNotNull() {
            addCriterion("history_document_id is not null");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idEqualTo(String value) {
            addCriterion("history_document_id =", value, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idNotEqualTo(String value) {
            addCriterion("history_document_id <>", value, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idGreaterThan(String value) {
            addCriterion("history_document_id >", value, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idGreaterThanOrEqualTo(String value) {
            addCriterion("history_document_id >=", value, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idLessThan(String value) {
            addCriterion("history_document_id <", value, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idLessThanOrEqualTo(String value) {
            addCriterion("history_document_id <=", value, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idLike(String value) {
            addCriterion("history_document_id like", value, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idNotLike(String value) {
            addCriterion("history_document_id not like", value, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idIn(List<String> values) {
            addCriterion("history_document_id in", values, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idNotIn(List<String> values) {
            addCriterion("history_document_id not in", values, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idBetween(String value1, String value2) {
            addCriterion("history_document_id between", value1, value2, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andHistory_document_idNotBetween(String value1, String value2) {
            addCriterion("history_document_id not between", value1, value2, "history_document_id");
            return (Criteria) this;
        }

        public Criteria andDocument_nameIsNull() {
            addCriterion("document_name is null");
            return (Criteria) this;
        }

        public Criteria andDocument_nameIsNotNull() {
            addCriterion("document_name is not null");
            return (Criteria) this;
        }

        public Criteria andDocument_nameEqualTo(String value) {
            addCriterion("document_name =", value, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameNotEqualTo(String value) {
            addCriterion("document_name <>", value, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameGreaterThan(String value) {
            addCriterion("document_name >", value, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameGreaterThanOrEqualTo(String value) {
            addCriterion("document_name >=", value, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameLessThan(String value) {
            addCriterion("document_name <", value, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameLessThanOrEqualTo(String value) {
            addCriterion("document_name <=", value, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameLike(String value) {
            addCriterion("document_name like", value, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameNotLike(String value) {
            addCriterion("document_name not like", value, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameIn(List<String> values) {
            addCriterion("document_name in", values, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameNotIn(List<String> values) {
            addCriterion("document_name not in", values, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameBetween(String value1, String value2) {
            addCriterion("document_name between", value1, value2, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_nameNotBetween(String value1, String value2) {
            addCriterion("document_name not between", value1, value2, "document_name");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelIsNull() {
            addCriterion("document_secret_level is null");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelIsNotNull() {
            addCriterion("document_secret_level is not null");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelEqualTo(String value) {
            addCriterion("document_secret_level =", value, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelNotEqualTo(String value) {
            addCriterion("document_secret_level <>", value, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelGreaterThan(String value) {
            addCriterion("document_secret_level >", value, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelGreaterThanOrEqualTo(String value) {
            addCriterion("document_secret_level >=", value, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelLessThan(String value) {
            addCriterion("document_secret_level <", value, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelLessThanOrEqualTo(String value) {
            addCriterion("document_secret_level <=", value, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelLike(String value) {
            addCriterion("document_secret_level like", value, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelNotLike(String value) {
            addCriterion("document_secret_level not like", value, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelIn(List<String> values) {
            addCriterion("document_secret_level in", values, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelNotIn(List<String> values) {
            addCriterion("document_secret_level not in", values, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelBetween(String value1, String value2) {
            addCriterion("document_secret_level between", value1, value2, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_secret_levelNotBetween(String value1, String value2) {
            addCriterion("document_secret_level not between", value1, value2, "document_secret_level");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberIsNull() {
            addCriterion("document_release_number is null");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberIsNotNull() {
            addCriterion("document_release_number is not null");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberEqualTo(String value) {
            addCriterion("document_release_number =", value, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberNotEqualTo(String value) {
            addCriterion("document_release_number <>", value, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberGreaterThan(String value) {
            addCriterion("document_release_number >", value, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberGreaterThanOrEqualTo(String value) {
            addCriterion("document_release_number >=", value, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberLessThan(String value) {
            addCriterion("document_release_number <", value, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberLessThanOrEqualTo(String value) {
            addCriterion("document_release_number <=", value, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberLike(String value) {
            addCriterion("document_release_number like", value, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberNotLike(String value) {
            addCriterion("document_release_number not like", value, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberIn(List<String> values) {
            addCriterion("document_release_number in", values, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberNotIn(List<String> values) {
            addCriterion("document_release_number not in", values, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberBetween(String value1, String value2) {
            addCriterion("document_release_number between", value1, value2, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_numberNotBetween(String value1, String value2) {
            addCriterion("document_release_number not between", value1, value2, "document_release_number");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeIsNull() {
            addCriterion("document_release_time is null");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeIsNotNull() {
            addCriterion("document_release_time is not null");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeEqualTo(Date value) {
            addCriterionForJDBCDate("document_release_time =", value, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeNotEqualTo(Date value) {
            addCriterionForJDBCDate("document_release_time <>", value, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeGreaterThan(Date value) {
            addCriterionForJDBCDate("document_release_time >", value, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("document_release_time >=", value, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeLessThan(Date value) {
            addCriterionForJDBCDate("document_release_time <", value, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("document_release_time <=", value, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeIn(List<Date> values) {
            addCriterionForJDBCDate("document_release_time in", values, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeNotIn(List<Date> values) {
            addCriterionForJDBCDate("document_release_time not in", values, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("document_release_time between", value1, value2, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andDocument_release_timeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("document_release_time not between", value1, value2, "document_release_time");
            return (Criteria) this;
        }

        public Criteria andOperator_nameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperator_nameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperator_nameEqualTo(String value) {
            addCriterion("operator_name =", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameLessThan(String value) {
            addCriterion("operator_name <", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameLike(String value) {
            addCriterion("operator_name like", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameNotLike(String value) {
            addCriterion("operator_name not like", value, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameIn(List<String> values) {
            addCriterion("operator_name in", values, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperator_nameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operator_name");
            return (Criteria) this;
        }

        public Criteria andOperate_timeIsNull() {
            addCriterion("operate_time is null");
            return (Criteria) this;
        }

        public Criteria andOperate_timeIsNotNull() {
            addCriterion("operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperate_timeEqualTo(Date value) {
            addCriterion("operate_time =", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeNotEqualTo(Date value) {
            addCriterion("operate_time <>", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeGreaterThan(Date value) {
            addCriterion("operate_time >", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_time >=", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeLessThan(Date value) {
            addCriterion("operate_time <", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeLessThanOrEqualTo(Date value) {
            addCriterion("operate_time <=", value, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeIn(List<Date> values) {
            addCriterion("operate_time in", values, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeNotIn(List<Date> values) {
            addCriterion("operate_time not in", values, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeBetween(Date value1, Date value2) {
            addCriterion("operate_time between", value1, value2, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_timeNotBetween(Date value1, Date value2) {
            addCriterion("operate_time not between", value1, value2, "operate_time");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksIsNull() {
            addCriterion("operate_remarks is null");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksIsNotNull() {
            addCriterion("operate_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksEqualTo(String value) {
            addCriterion("operate_remarks =", value, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksNotEqualTo(String value) {
            addCriterion("operate_remarks <>", value, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksGreaterThan(String value) {
            addCriterion("operate_remarks >", value, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksGreaterThanOrEqualTo(String value) {
            addCriterion("operate_remarks >=", value, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksLessThan(String value) {
            addCriterion("operate_remarks <", value, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksLessThanOrEqualTo(String value) {
            addCriterion("operate_remarks <=", value, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksLike(String value) {
            addCriterion("operate_remarks like", value, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksNotLike(String value) {
            addCriterion("operate_remarks not like", value, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksIn(List<String> values) {
            addCriterion("operate_remarks in", values, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksNotIn(List<String> values) {
            addCriterion("operate_remarks not in", values, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksBetween(String value1, String value2) {
            addCriterion("operate_remarks between", value1, value2, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_remarksNotBetween(String value1, String value2) {
            addCriterion("operate_remarks not between", value1, value2, "operate_remarks");
            return (Criteria) this;
        }

        public Criteria andOperate_typeIsNull() {
            addCriterion("operate_type is null");
            return (Criteria) this;
        }

        public Criteria andOperate_typeIsNotNull() {
            addCriterion("operate_type is not null");
            return (Criteria) this;
        }

        public Criteria andOperate_typeEqualTo(String value) {
            addCriterion("operate_type =", value, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeNotEqualTo(String value) {
            addCriterion("operate_type <>", value, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeGreaterThan(String value) {
            addCriterion("operate_type >", value, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeGreaterThanOrEqualTo(String value) {
            addCriterion("operate_type >=", value, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeLessThan(String value) {
            addCriterion("operate_type <", value, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeLessThanOrEqualTo(String value) {
            addCriterion("operate_type <=", value, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeLike(String value) {
            addCriterion("operate_type like", value, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeNotLike(String value) {
            addCriterion("operate_type not like", value, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeIn(List<String> values) {
            addCriterion("operate_type in", values, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeNotIn(List<String> values) {
            addCriterion("operate_type not in", values, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeBetween(String value1, String value2) {
            addCriterion("operate_type between", value1, value2, "operate_type");
            return (Criteria) this;
        }

        public Criteria andOperate_typeNotBetween(String value1, String value2) {
            addCriterion("operate_type not between", value1, value2, "operate_type");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1IsNull() {
            addCriterion("category_value_1 is null");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1IsNotNull() {
            addCriterion("category_value_1 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1EqualTo(String value) {
            addCriterion("category_value_1 =", value, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1NotEqualTo(String value) {
            addCriterion("category_value_1 <>", value, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1GreaterThan(String value) {
            addCriterion("category_value_1 >", value, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1GreaterThanOrEqualTo(String value) {
            addCriterion("category_value_1 >=", value, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1LessThan(String value) {
            addCriterion("category_value_1 <", value, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1LessThanOrEqualTo(String value) {
            addCriterion("category_value_1 <=", value, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1Like(String value) {
            addCriterion("category_value_1 like", value, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1NotLike(String value) {
            addCriterion("category_value_1 not like", value, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1In(List<String> values) {
            addCriterion("category_value_1 in", values, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1NotIn(List<String> values) {
            addCriterion("category_value_1 not in", values, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1Between(String value1, String value2) {
            addCriterion("category_value_1 between", value1, value2, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_1NotBetween(String value1, String value2) {
            addCriterion("category_value_1 not between", value1, value2, "category_value_1");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2IsNull() {
            addCriterion("category_value_2 is null");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2IsNotNull() {
            addCriterion("category_value_2 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2EqualTo(String value) {
            addCriterion("category_value_2 =", value, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2NotEqualTo(String value) {
            addCriterion("category_value_2 <>", value, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2GreaterThan(String value) {
            addCriterion("category_value_2 >", value, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2GreaterThanOrEqualTo(String value) {
            addCriterion("category_value_2 >=", value, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2LessThan(String value) {
            addCriterion("category_value_2 <", value, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2LessThanOrEqualTo(String value) {
            addCriterion("category_value_2 <=", value, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2Like(String value) {
            addCriterion("category_value_2 like", value, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2NotLike(String value) {
            addCriterion("category_value_2 not like", value, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2In(List<String> values) {
            addCriterion("category_value_2 in", values, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2NotIn(List<String> values) {
            addCriterion("category_value_2 not in", values, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2Between(String value1, String value2) {
            addCriterion("category_value_2 between", value1, value2, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_2NotBetween(String value1, String value2) {
            addCriterion("category_value_2 not between", value1, value2, "category_value_2");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3IsNull() {
            addCriterion("category_value_3 is null");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3IsNotNull() {
            addCriterion("category_value_3 is not null");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3EqualTo(String value) {
            addCriterion("category_value_3 =", value, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3NotEqualTo(String value) {
            addCriterion("category_value_3 <>", value, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3GreaterThan(String value) {
            addCriterion("category_value_3 >", value, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3GreaterThanOrEqualTo(String value) {
            addCriterion("category_value_3 >=", value, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3LessThan(String value) {
            addCriterion("category_value_3 <", value, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3LessThanOrEqualTo(String value) {
            addCriterion("category_value_3 <=", value, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3Like(String value) {
            addCriterion("category_value_3 like", value, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3NotLike(String value) {
            addCriterion("category_value_3 not like", value, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3In(List<String> values) {
            addCriterion("category_value_3 in", values, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3NotIn(List<String> values) {
            addCriterion("category_value_3 not in", values, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3Between(String value1, String value2) {
            addCriterion("category_value_3 between", value1, value2, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andCategory_value_3NotBetween(String value1, String value2) {
            addCriterion("category_value_3 not between", value1, value2, "category_value_3");
            return (Criteria) this;
        }

        public Criteria andDocument_textIsNull() {
            addCriterion("document_text is null");
            return (Criteria) this;
        }

        public Criteria andDocument_textIsNotNull() {
            addCriterion("document_text is not null");
            return (Criteria) this;
        }

        public Criteria andDocument_textEqualTo(String value) {
            addCriterion("document_text =", value, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textNotEqualTo(String value) {
            addCriterion("document_text <>", value, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textGreaterThan(String value) {
            addCriterion("document_text >", value, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textGreaterThanOrEqualTo(String value) {
            addCriterion("document_text >=", value, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textLessThan(String value) {
            addCriterion("document_text <", value, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textLessThanOrEqualTo(String value) {
            addCriterion("document_text <=", value, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textLike(String value) {
            addCriterion("document_text like", value, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textNotLike(String value) {
            addCriterion("document_text not like", value, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textIn(List<String> values) {
            addCriterion("document_text in", values, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textNotIn(List<String> values) {
            addCriterion("document_text not in", values, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textBetween(String value1, String value2) {
            addCriterion("document_text between", value1, value2, "document_text");
            return (Criteria) this;
        }

        public Criteria andDocument_textNotBetween(String value1, String value2) {
            addCriterion("document_text not between", value1, value2, "document_text");
            return (Criteria) this;
        }

        public Criteria andPicture_linkIsNull() {
            addCriterion("picture_link is null");
            return (Criteria) this;
        }

        public Criteria andPicture_linkIsNotNull() {
            addCriterion("picture_link is not null");
            return (Criteria) this;
        }

        public Criteria andPicture_linkEqualTo(String value) {
            addCriterion("picture_link =", value, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkNotEqualTo(String value) {
            addCriterion("picture_link <>", value, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkGreaterThan(String value) {
            addCriterion("picture_link >", value, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkGreaterThanOrEqualTo(String value) {
            addCriterion("picture_link >=", value, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkLessThan(String value) {
            addCriterion("picture_link <", value, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkLessThanOrEqualTo(String value) {
            addCriterion("picture_link <=", value, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkLike(String value) {
            addCriterion("picture_link like", value, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkNotLike(String value) {
            addCriterion("picture_link not like", value, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkIn(List<String> values) {
            addCriterion("picture_link in", values, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkNotIn(List<String> values) {
            addCriterion("picture_link not in", values, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkBetween(String value1, String value2) {
            addCriterion("picture_link between", value1, value2, "picture_link");
            return (Criteria) this;
        }

        public Criteria andPicture_linkNotBetween(String value1, String value2) {
            addCriterion("picture_link not between", value1, value2, "picture_link");
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