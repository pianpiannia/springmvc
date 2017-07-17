package jun.ssm.service.impl;

import java.util.List;

import jun.ssm.po.TLinkmanCustomer;
import jun.ssm.po.TLinkmanQueryVo;

//联系人
public interface LinkManService {

	//查询列表
	public List<TLinkmanCustomer> findLinkManByName(TLinkmanQueryVo linkManQueryVo)throws Exception;

	//根据id查询
	public TLinkmanCustomer findLinkManById(Integer linkid)throws Exception;

	//修改信息
	public void updateLinkMan(Integer linkid,TLinkmanCustomer tLinkmanCustomer)throws Exception;
	
}
