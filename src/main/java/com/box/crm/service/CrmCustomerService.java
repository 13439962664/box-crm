package com.box.crm.service;

import java.util.Set;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.box.crm.pojo.CrmCustomer;
//import com.github.pagehelper.PageInfo;

public interface CrmCustomerService extends IService<CrmCustomer> {
	public IPage<CrmCustomer> query(CrmCustomer crmCustomer,Integer pageIndex,Integer pageSize);
	public CrmCustomer get(Long id);
	public int create(CrmCustomer crmCustomer);
	public int update(CrmCustomer crmCustomer);
	public int removeBatch(Set<Long> ids);
	public int recoveryBatch(Set<Long> ids);
}
