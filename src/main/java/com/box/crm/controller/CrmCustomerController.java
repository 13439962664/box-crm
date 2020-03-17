package com.box.crm.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.box.common.DispatchDTO;
import com.box.crm.pojo.CrmCustomer;
import com.box.crm.service.CrmCustomerService;
import com.box.utils.JsonUtil;
//import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/crm/customer")
public class CrmCustomerController {
	
	@Autowired
	private CrmCustomerService CrmCustomerServiceImpl;

	@RequiresPermissions({ "crm_customer_manage", "crm_customer_sel" })
	@RequestMapping("/query")
	public String query(CrmCustomer crmCustomer, Integer pageIndex, Integer pageSize) {
		IPage<CrmCustomer> pageInfo = CrmCustomerServiceImpl.query(crmCustomer, pageIndex, pageSize);
		return JsonUtil.controllerSuccessJson(pageInfo);
	}

	@RequiresPermissions({ "crm_customer_sel" })
	@RequestMapping("/get")
	public String get(Long id) {
		CrmCustomer CrmCustomer = CrmCustomerServiceImpl.get(id);
		return JsonUtil.controllerSuccessJson(CrmCustomer);
	}

	@RequiresPermissions({ "crm_customer_add" })
	@RequestMapping("/create")
	public String create(CrmCustomer crmCustomer) {
		int i = CrmCustomerServiceImpl.create(crmCustomer);
		if (i == 1) {
			return JsonUtil.controllerSuccessJson(crmCustomer);
		} else {
			return JsonUtil.controllerErrorJson(crmCustomer);
		}
	}

	@RequiresPermissions({ "crm_customer_upd" })
	@RequestMapping("/update")
	public String update(CrmCustomer crmCustomer) {
		int i = CrmCustomerServiceImpl.update(crmCustomer);
		if (i == 1) {
			return JsonUtil.controllerSuccessJson(crmCustomer);
		} else {
			return JsonUtil.controllerErrorJson(crmCustomer);
		}
	}

	@RequiresPermissions({ "crm_customer_del" })
	@RequestMapping("/removeBatch")
	public String removeBatch(DispatchDTO dto) {
		int i = CrmCustomerServiceImpl.removeBatch(dto.getIds());
		if (i == 1) {
			return JsonUtil.controllerSuccessJson(dto.getIds());
		} else {
			return JsonUtil.controllerErrorJson(dto.getIds());
		}
	}

	@RequiresPermissions({ "crm_customer_del" })
	@RequestMapping("/recoveryBatch")
	public String recoveryBatch(DispatchDTO dto) {
		int i = CrmCustomerServiceImpl.recoveryBatch(dto.getIds());
		if (i == 1) {
			return JsonUtil.controllerSuccessJson(dto.getIds());
		} else {
			return JsonUtil.controllerErrorJson(dto.getIds());
		}
	}
	
}
