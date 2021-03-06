package jun.ssm.mapper;

import java.util.List;
import jun.ssm.po.TLinkman;
import jun.ssm.po.TLinkmanExample;
import org.apache.ibatis.annotations.Param;

public interface TLinkmanMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    long countByExample(TLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    int deleteByExample(TLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    int deleteByPrimaryKey(Integer linkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    int insert(TLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    int insertSelective(TLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    List<TLinkman> selectByExample(TLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    TLinkman selectByPrimaryKey(Integer linkid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    int updateByExampleSelective(@Param("record") TLinkman record, @Param("example") TLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    int updateByExample(@Param("record") TLinkman record, @Param("example") TLinkmanExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    int updateByPrimaryKeySelective(TLinkman record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_linkman
     *
     * @mbg.generated Thu Jul 13 14:20:45 CST 2017
     */
    int updateByPrimaryKey(TLinkman record);
}