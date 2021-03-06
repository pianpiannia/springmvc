package jun.ssm.po;

import java.util.ArrayList;
import java.util.List;

public class TCustomer2Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public TCustomer2Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
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
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNull() {
            addCriterion("custName is null");
            return (Criteria) this;
        }

        public Criteria andCustnameIsNotNull() {
            addCriterion("custName is not null");
            return (Criteria) this;
        }

        public Criteria andCustnameEqualTo(String value) {
            addCriterion("custName =", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotEqualTo(String value) {
            addCriterion("custName <>", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThan(String value) {
            addCriterion("custName >", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameGreaterThanOrEqualTo(String value) {
            addCriterion("custName >=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThan(String value) {
            addCriterion("custName <", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLessThanOrEqualTo(String value) {
            addCriterion("custName <=", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameLike(String value) {
            addCriterion("custName like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotLike(String value) {
            addCriterion("custName not like", value, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameIn(List<String> values) {
            addCriterion("custName in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotIn(List<String> values) {
            addCriterion("custName not in", values, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameBetween(String value1, String value2) {
            addCriterion("custName between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustnameNotBetween(String value1, String value2) {
            addCriterion("custName not between", value1, value2, "custname");
            return (Criteria) this;
        }

        public Criteria andCustsourceIsNull() {
            addCriterion("custSource is null");
            return (Criteria) this;
        }

        public Criteria andCustsourceIsNotNull() {
            addCriterion("custSource is not null");
            return (Criteria) this;
        }

        public Criteria andCustsourceEqualTo(String value) {
            addCriterion("custSource =", value, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceNotEqualTo(String value) {
            addCriterion("custSource <>", value, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceGreaterThan(String value) {
            addCriterion("custSource >", value, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceGreaterThanOrEqualTo(String value) {
            addCriterion("custSource >=", value, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceLessThan(String value) {
            addCriterion("custSource <", value, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceLessThanOrEqualTo(String value) {
            addCriterion("custSource <=", value, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceLike(String value) {
            addCriterion("custSource like", value, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceNotLike(String value) {
            addCriterion("custSource not like", value, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceIn(List<String> values) {
            addCriterion("custSource in", values, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceNotIn(List<String> values) {
            addCriterion("custSource not in", values, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceBetween(String value1, String value2) {
            addCriterion("custSource between", value1, value2, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustsourceNotBetween(String value1, String value2) {
            addCriterion("custSource not between", value1, value2, "custsource");
            return (Criteria) this;
        }

        public Criteria andCustphoneIsNull() {
            addCriterion("custPhone is null");
            return (Criteria) this;
        }

        public Criteria andCustphoneIsNotNull() {
            addCriterion("custPhone is not null");
            return (Criteria) this;
        }

        public Criteria andCustphoneEqualTo(String value) {
            addCriterion("custPhone =", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneNotEqualTo(String value) {
            addCriterion("custPhone <>", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneGreaterThan(String value) {
            addCriterion("custPhone >", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneGreaterThanOrEqualTo(String value) {
            addCriterion("custPhone >=", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneLessThan(String value) {
            addCriterion("custPhone <", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneLessThanOrEqualTo(String value) {
            addCriterion("custPhone <=", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneLike(String value) {
            addCriterion("custPhone like", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneNotLike(String value) {
            addCriterion("custPhone not like", value, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneIn(List<String> values) {
            addCriterion("custPhone in", values, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneNotIn(List<String> values) {
            addCriterion("custPhone not in", values, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneBetween(String value1, String value2) {
            addCriterion("custPhone between", value1, value2, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustphoneNotBetween(String value1, String value2) {
            addCriterion("custPhone not between", value1, value2, "custphone");
            return (Criteria) this;
        }

        public Criteria andCustmobileIsNull() {
            addCriterion("custMobile is null");
            return (Criteria) this;
        }

        public Criteria andCustmobileIsNotNull() {
            addCriterion("custMobile is not null");
            return (Criteria) this;
        }

        public Criteria andCustmobileEqualTo(String value) {
            addCriterion("custMobile =", value, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileNotEqualTo(String value) {
            addCriterion("custMobile <>", value, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileGreaterThan(String value) {
            addCriterion("custMobile >", value, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileGreaterThanOrEqualTo(String value) {
            addCriterion("custMobile >=", value, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileLessThan(String value) {
            addCriterion("custMobile <", value, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileLessThanOrEqualTo(String value) {
            addCriterion("custMobile <=", value, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileLike(String value) {
            addCriterion("custMobile like", value, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileNotLike(String value) {
            addCriterion("custMobile not like", value, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileIn(List<String> values) {
            addCriterion("custMobile in", values, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileNotIn(List<String> values) {
            addCriterion("custMobile not in", values, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileBetween(String value1, String value2) {
            addCriterion("custMobile between", value1, value2, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustmobileNotBetween(String value1, String value2) {
            addCriterion("custMobile not between", value1, value2, "custmobile");
            return (Criteria) this;
        }

        public Criteria andCustlevelIsNull() {
            addCriterion("custLevel is null");
            return (Criteria) this;
        }

        public Criteria andCustlevelIsNotNull() {
            addCriterion("custLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCustlevelEqualTo(String value) {
            addCriterion("custLevel =", value, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelNotEqualTo(String value) {
            addCriterion("custLevel <>", value, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelGreaterThan(String value) {
            addCriterion("custLevel >", value, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelGreaterThanOrEqualTo(String value) {
            addCriterion("custLevel >=", value, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelLessThan(String value) {
            addCriterion("custLevel <", value, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelLessThanOrEqualTo(String value) {
            addCriterion("custLevel <=", value, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelLike(String value) {
            addCriterion("custLevel like", value, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelNotLike(String value) {
            addCriterion("custLevel not like", value, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelIn(List<String> values) {
            addCriterion("custLevel in", values, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelNotIn(List<String> values) {
            addCriterion("custLevel not in", values, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelBetween(String value1, String value2) {
            addCriterion("custLevel between", value1, value2, "custlevel");
            return (Criteria) this;
        }

        public Criteria andCustlevelNotBetween(String value1, String value2) {
            addCriterion("custLevel not between", value1, value2, "custlevel");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_customer2
     *
     * @mbg.generated do_not_delete_during_merge Thu Jul 13 14:20:45 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_customer2
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
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