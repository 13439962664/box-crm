package com.box.crm.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.box.common.GlobalException;
import com.box.common.RetJson;

import com.box.crm.entity.CrmCustomerEntity;
import com.box.crm.service.CrmCustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;



/**
* <p>
*  前端控制器
* </p>
*
* @author sunyizhuo-13439962664
* @since 2020-03-19
*/
@Api(tags = "")
@RestController
@RequestMapping("/crm-customer-entity")
public class CrmCustomerController {

    @Autowired
    private CrmCustomerService crmCustomerService;

    @ApiOperation(value = "分页列表", response = CrmCustomerEntity.class)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "page", value = "页面", dataType = "Long"),
        @ApiImplicitParam(name = "size", value = "页面数据量", dataType = "Long"),
        @ApiImplicitParam(name = "sort", value = "排序方式排序[true:正序; false:倒序]", dataType = "Boolean"),
        @ApiImplicitParam(name = "sortName", value = "排序字段,参照返回字段", dataType = "String")})
    @PostMapping(value = "/page")
    public  Object list(@Valid @RequestBody CrmCustomerEntity param) {

        Object data = crmCustomerService.page(param);
        return RetJson.ok(data);
    }

    @ApiOperation(value = "详情", response = CrmCustomerEntity.class)
    @GetMapping(value = "/info/{id}")
    public  Object info(@PathVariable Long id) {

        Object data = crmCustomerService.info(id);
        return RetJson.ok(data);
    }

    @ApiOperation(value = "新增")
    @PostMapping(value = "/add")
    public  Object add(@Valid @RequestBody CrmCustomerEntity param) throws GlobalException {

        crmCustomerService.add(param);
        return RetJson.ok();
    }

    @ApiOperation(value = "修改")
    @PostMapping(value = "/modify")
    public  Object modify(@Valid @RequestBody CrmCustomerEntity param) throws GlobalException {

        crmCustomerService.modify(param);
        return RetJson.ok();
    }

    @ApiOperation(value = "删除(单个条目)")
    @GetMapping(value = "/remove/{id}")
    public  Object remove(@PathVariable Long id) {

        crmCustomerService.remove(id);
        return RetJson.ok();
    }

    @ApiOperation(value = "删除(多个条目)")
    @PostMapping(value = "/removes")
    public  Object removes(@Valid @RequestBody List<Long> ids) {

        crmCustomerService.removes(ids);
        return RetJson.ok();
    }

}
