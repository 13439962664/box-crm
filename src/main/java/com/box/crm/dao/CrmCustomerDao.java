package com.box.crm.dao;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.box.crm.pojo.CrmCustomer;

@Mapper
public interface CrmCustomerDao {
	public List<CrmCustomer> query(CrmCustomer crmCustomer);

	public CrmCustomer get(Long id);

	public int create(CrmCustomer crmCustomer);

	public int update(CrmCustomer crmCustomer);

	public int removeBatch(@Param("ids")Set<Long> ids);
	
	public int recoveryBatch(@Param("ids")Set<Long> ids);
}
