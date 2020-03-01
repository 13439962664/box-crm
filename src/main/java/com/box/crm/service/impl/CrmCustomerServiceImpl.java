package com.box.crm.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.box.crm.dao.CrmCustomerDao;
import com.box.crm.pojo.CrmCustomer;
import com.box.crm.service.CrmCustomerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CrmCustomerServiceImpl implements CrmCustomerService {

	@Autowired
	private CrmCustomerDao crmCustomerDao;

	@Override
	public PageInfo<CrmCustomer> query(CrmCustomer crmCustomer, Integer pageIndex, Integer pageSize) {
		final PageInfo<CrmCustomer> pageInfo = PageHelper.startPage(pageIndex, pageSize).setOrderBy("id desc")
				.doSelectPageInfo(() -> this.crmCustomerDao.query(crmCustomer));
		return pageInfo;
	}

	@Override
	public CrmCustomer get(Long id) {
		return crmCustomerDao.get(id);
	}

	@Override
	public int create(CrmCustomer crmCustomer) {
		return crmCustomerDao.create(crmCustomer);
	}

	@Override
	public int update(CrmCustomer crmCustomer) {
		return crmCustomerDao.update(crmCustomer);
	}

	@Override
	public int removeBatch(Set<Long> ids) {
		return crmCustomerDao.removeBatch(ids);
	}

	@Override
	public int recoveryBatch(Set<Long> ids) {
		return crmCustomerDao.recoveryBatch(ids);
	}

}
