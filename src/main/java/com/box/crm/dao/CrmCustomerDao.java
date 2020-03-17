package com.box.crm.dao;

import java.util.Set;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.box.crm.pojo.CrmCustomer;

@Mapper
public interface CrmCustomerDao extends BaseMapper<CrmCustomer>{
	public int recoveryBatch(@Param("ids")Set<Long> ids);
}
