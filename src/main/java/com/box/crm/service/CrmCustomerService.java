package com.box.crm.service;

import java.util.Set;

import com.box.crm.pojo.CrmCustomer;
import com.github.pagehelper.PageInfo;

public interface CrmCustomerService {
	public PageInfo<CrmCustomer> query(CrmCustomer crmCustomer,Integer pageIndex,Integer pageSize);
	public CrmCustomer get(Long id);
	public int create(CrmCustomer crmCustomer);
	public int update(CrmCustomer crmCustomer);
	public int removeBatch(Set<Long> ids);
	public int recoveryBatch(Set<Long> ids);
}
