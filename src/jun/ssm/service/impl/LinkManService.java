package jun.ssm.service.impl;

import java.util.List;

import jun.ssm.po.TLinkmanCustomer;
import jun.ssm.po.TLinkmanQueryVo;

//��ϵ��
public interface LinkManService {

	//��ѯ�б�
	public List<TLinkmanCustomer> findLinkManByName(TLinkmanQueryVo linkManQueryVo)throws Exception;

	//����id��ѯ
	public TLinkmanCustomer findLinkManById(Integer linkid)throws Exception;

	//�޸���Ϣ
	public void updateLinkMan(Integer linkid,TLinkmanCustomer tLinkmanCustomer)throws Exception;
	
}
