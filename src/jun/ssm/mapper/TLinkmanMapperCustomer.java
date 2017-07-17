package jun.ssm.mapper;

import java.util.List;

import jun.ssm.po.TLinkmanCustomer;
import jun.ssm.po.TLinkmanQueryVo;

public interface TLinkmanMapperCustomer {
    public List<TLinkmanCustomer> findLinkManByName(TLinkmanQueryVo linkManQueryVo)throws Exception;
}