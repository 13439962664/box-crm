package com.box.crm.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.box.crm.dao.CrmCustomerDao;
import com.box.crm.pojo.CrmCustomer;
import com.box.crm.service.CrmCustomerService;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;

@Service
public class CrmCustomerServiceImpl extends ServiceImpl<CrmCustomerDao, CrmCustomer> implements CrmCustomerService {

	@Autowired
	private CrmCustomerDao crmCustomerDao;

	@Override
	public IPage<CrmCustomer> query(CrmCustomer crmCustomer, Integer pageIndex, Integer pageSize) {
		IPage<CrmCustomer> page = new Page<CrmCustomer>(pageIndex,pageSize);
		QueryWrapper<CrmCustomer> query = new QueryWrapper<CrmCustomer>();
		if(crmCustomer.getDel_()!=null) {
			query.eq("del_", crmCustomer.getDel_());
		}
		if(!(crmCustomer.getName()==null||"".equals(crmCustomer.getName()))) {
			query.like("name", crmCustomer.getName());
		}
		if(!(crmCustomer.getCompanyName()==null||"".equals(crmCustomer.getCompanyName()))) {
			query.like("company_name", crmCustomer.getCompanyName());
		}
		if(!(crmCustomer.getMobilePhone()==null||"".equals(crmCustomer.getMobilePhone()))) {
			query.like("mobile_phone", crmCustomer.getMobilePhone());
		}
		page = crmCustomerDao.selectPage(page, query);
		return page;
	}

	@Override
	public CrmCustomer get(Long id) {
		return crmCustomerDao.selectById(id);
	}

	@Override
	public int create(CrmCustomer crmCustomer) {
		return crmCustomerDao.insert(crmCustomer);
	}

	@Override
	public int update(CrmCustomer crmCustomer) {
		return crmCustomerDao.updateById(crmCustomer);
	}

	@Override
	public int removeBatch(Set<Long> ids) {
		return crmCustomerDao.deleteBatchIds(ids);
	}

	@Override
	public int recoveryBatch(Set<Long> ids) {
		return crmCustomerDao.recoveryBatch(ids);
	}

}
