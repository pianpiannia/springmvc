package jun.ssm.po;

public class TDict {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict.did
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    private String did;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_dict.dname
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    private String dname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict.did
     *
     * @return the value of t_dict.did
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public String getDid() {
        return did;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict.did
     *
     * @param did the value for t_dict.did
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public void setDid(String did) {
        this.did = did == null ? null : did.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_dict.dname
     *
     * @return the value of t_dict.dname
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_dict.dname
     *
     * @param dname the value for t_dict.dname
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }
}