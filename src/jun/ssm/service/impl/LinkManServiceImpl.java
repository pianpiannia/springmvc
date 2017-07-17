package jun.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jun.ssm.mapper.TLinkmanMapper;
import jun.ssm.mapper.TLinkmanMapperCustomer;
import jun.ssm.po.TLinkman;
import jun.ssm.po.TLinkmanCustomer;
import jun.ssm.po.TLinkmanQueryVo;


public class LinkManServiceImpl implements LinkManService {

	@Autowired
	private TLinkmanMapperCustomer tLinkmanMapperCustomer;
	@Autowired
	private TLinkmanMapper tLinkmanMapper;
	
	@Override
	public List<TLinkmanCustomer> findLinkManByName(TLinkmanQueryVo linkManQueryVo) throws Exception {
		
		return tLinkmanMapperCustomer.findLinkManByName(linkManQueryVo);
		
	}
	@Override
	public TLinkmanCustomer findLinkManById(Integer linkid) throws Exception {
		
		TLinkman tlinkman = tLinkmanMapper.selectByPrimaryKey(linkid);
		
		TLinkmanCustomer tLinkmanCustomer = new TLinkmanCustomer();
		//��items������ֵ������tLinkmanCustomer
		BeanUtils.copyProperties(tlinkman, tLinkmanCustomer);
		
		//return (TLinkmanCustomer) tLinkmanMapper.selectByPrimaryKey(id);
		return tLinkmanCustomer;
	}
	
	//�޸�
	@Override
	public void updateLinkMan(Integer linkid, TLinkmanCustomer tLinkmanCustomer) throws Exception {
		//���ҵ��У�飬ͨ����service�ӿڶԹؼ���������У��
		//У��id�Ƿ�Ϊ�գ����Ϊ���׳��쳣
		
		//������Ϣ
		tLinkmanCustomer.setLinkid(linkid);
		tLinkmanMapper.updateByPrimaryKey(tLinkmanCustomer);
	}
	

}
