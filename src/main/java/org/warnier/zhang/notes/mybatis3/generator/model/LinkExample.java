package org.warnier.zhang.notes.mybatis3.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LinkExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public LinkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
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

        public Criteria andLinkIdIsNull() {
            addCriterion("LINK_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkIdIsNotNull() {
            addCriterion("LINK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkIdEqualTo(Long value) {
            addCriterion("LINK_ID =", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotEqualTo(Long value) {
            addCriterion("LINK_ID <>", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThan(Long value) {
            addCriterion("LINK_ID >", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LINK_ID >=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThan(Long value) {
            addCriterion("LINK_ID <", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdLessThanOrEqualTo(Long value) {
            addCriterion("LINK_ID <=", value, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdIn(List<Long> values) {
            addCriterion("LINK_ID in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotIn(List<Long> values) {
            addCriterion("LINK_ID not in", values, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdBetween(Long value1, Long value2) {
            addCriterion("LINK_ID between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkIdNotBetween(Long value1, Long value2) {
            addCriterion("LINK_ID not between", value1, value2, "linkId");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNull() {
            addCriterion("LINK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLinkNameIsNotNull() {
            addCriterion("LINK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkNameEqualTo(String value) {
            addCriterion("LINK_NAME =", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotEqualTo(String value) {
            addCriterion("LINK_NAME <>", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThan(String value) {
            addCriterion("LINK_NAME >", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_NAME >=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThan(String value) {
            addCriterion("LINK_NAME <", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLessThanOrEqualTo(String value) {
            addCriterion("LINK_NAME <=", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameLike(String value) {
            addCriterion("LINK_NAME like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotLike(String value) {
            addCriterion("LINK_NAME not like", value, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameIn(List<String> values) {
            addCriterion("LINK_NAME in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotIn(List<String> values) {
            addCriterion("LINK_NAME not in", values, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameBetween(String value1, String value2) {
            addCriterion("LINK_NAME between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkNameNotBetween(String value1, String value2) {
            addCriterion("LINK_NAME not between", value1, value2, "linkName");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("LINK_URL is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("LINK_URL is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("LINK_URL =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("LINK_URL <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("LINK_URL >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_URL >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("LINK_URL <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("LINK_URL <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("LINK_URL like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("LINK_URL not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("LINK_URL in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("LINK_URL not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("LINK_URL between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("LINK_URL not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionIsNull() {
            addCriterion("LINK_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionIsNotNull() {
            addCriterion("LINK_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionEqualTo(String value) {
            addCriterion("LINK_DESCRIPTION =", value, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionNotEqualTo(String value) {
            addCriterion("LINK_DESCRIPTION <>", value, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionGreaterThan(String value) {
            addCriterion("LINK_DESCRIPTION >", value, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_DESCRIPTION >=", value, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionLessThan(String value) {
            addCriterion("LINK_DESCRIPTION <", value, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionLessThanOrEqualTo(String value) {
            addCriterion("LINK_DESCRIPTION <=", value, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionLike(String value) {
            addCriterion("LINK_DESCRIPTION like", value, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionNotLike(String value) {
            addCriterion("LINK_DESCRIPTION not like", value, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionIn(List<String> values) {
            addCriterion("LINK_DESCRIPTION in", values, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionNotIn(List<String> values) {
            addCriterion("LINK_DESCRIPTION not in", values, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionBetween(String value1, String value2) {
            addCriterion("LINK_DESCRIPTION between", value1, value2, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkDescriptionNotBetween(String value1, String value2) {
            addCriterion("LINK_DESCRIPTION not between", value1, value2, "linkDescription");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdIsNull() {
            addCriterion("LINK_CATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdIsNotNull() {
            addCriterion("LINK_CATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdEqualTo(Long value) {
            addCriterion("LINK_CATE_ID =", value, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdNotEqualTo(Long value) {
            addCriterion("LINK_CATE_ID <>", value, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdGreaterThan(Long value) {
            addCriterion("LINK_CATE_ID >", value, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LINK_CATE_ID >=", value, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdLessThan(Long value) {
            addCriterion("LINK_CATE_ID <", value, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdLessThanOrEqualTo(Long value) {
            addCriterion("LINK_CATE_ID <=", value, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdIn(List<Long> values) {
            addCriterion("LINK_CATE_ID in", values, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdNotIn(List<Long> values) {
            addCriterion("LINK_CATE_ID not in", values, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdBetween(Long value1, Long value2) {
            addCriterion("LINK_CATE_ID between", value1, value2, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCateIdNotBetween(Long value1, Long value2) {
            addCriterion("LINK_CATE_ID not between", value1, value2, "linkCateId");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeIsNull() {
            addCriterion("LINK_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeIsNotNull() {
            addCriterion("LINK_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeEqualTo(Date value) {
            addCriterion("LINK_CREATE_TIME =", value, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeNotEqualTo(Date value) {
            addCriterion("LINK_CREATE_TIME <>", value, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeGreaterThan(Date value) {
            addCriterion("LINK_CREATE_TIME >", value, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LINK_CREATE_TIME >=", value, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeLessThan(Date value) {
            addCriterion("LINK_CREATE_TIME <", value, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("LINK_CREATE_TIME <=", value, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeIn(List<Date> values) {
            addCriterion("LINK_CREATE_TIME in", values, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeNotIn(List<Date> values) {
            addCriterion("LINK_CREATE_TIME not in", values, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeBetween(Date value1, Date value2) {
            addCriterion("LINK_CREATE_TIME between", value1, value2, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("LINK_CREATE_TIME not between", value1, value2, "linkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserIsNull() {
            addCriterion("LINK_CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserIsNotNull() {
            addCriterion("LINK_CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserEqualTo(Long value) {
            addCriterion("LINK_CREATE_USER =", value, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserNotEqualTo(Long value) {
            addCriterion("LINK_CREATE_USER <>", value, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserGreaterThan(Long value) {
            addCriterion("LINK_CREATE_USER >", value, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("LINK_CREATE_USER >=", value, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserLessThan(Long value) {
            addCriterion("LINK_CREATE_USER <", value, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("LINK_CREATE_USER <=", value, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserIn(List<Long> values) {
            addCriterion("LINK_CREATE_USER in", values, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserNotIn(List<Long> values) {
            addCriterion("LINK_CREATE_USER not in", values, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserBetween(Long value1, Long value2) {
            addCriterion("LINK_CREATE_USER between", value1, value2, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("LINK_CREATE_USER not between", value1, value2, "linkCreateUser");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableIsNull() {
            addCriterion("LINK_AVAILABLE is null");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableIsNotNull() {
            addCriterion("LINK_AVAILABLE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableEqualTo(String value) {
            addCriterion("LINK_AVAILABLE =", value, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableNotEqualTo(String value) {
            addCriterion("LINK_AVAILABLE <>", value, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableGreaterThan(String value) {
            addCriterion("LINK_AVAILABLE >", value, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_AVAILABLE >=", value, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableLessThan(String value) {
            addCriterion("LINK_AVAILABLE <", value, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableLessThanOrEqualTo(String value) {
            addCriterion("LINK_AVAILABLE <=", value, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableLike(String value) {
            addCriterion("LINK_AVAILABLE like", value, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableNotLike(String value) {
            addCriterion("LINK_AVAILABLE not like", value, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableIn(List<String> values) {
            addCriterion("LINK_AVAILABLE in", values, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableNotIn(List<String> values) {
            addCriterion("LINK_AVAILABLE not in", values, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableBetween(String value1, String value2) {
            addCriterion("LINK_AVAILABLE between", value1, value2, "linkAvailable");
            return (Criteria) this;
        }

        public Criteria andLinkAvailableNotBetween(String value1, String value2) {
            addCriterion("LINK_AVAILABLE not between", value1, value2, "linkAvailable");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMS_LINK
     *
     * @mbg.generated do_not_delete_during_merge Thu Aug 01 09:37:45 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMS_LINK
     *
     * @mbg.generated Thu Aug 01 09:37:45 CST 2019
     */
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