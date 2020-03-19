package com.box.crm.service;

import com.box.crm.entity.CrmCustomerEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.box.common.GlobalException;
import java.util.List;

/**
* <p>
*  服务类
* </p>
*
* @author sunyizhuo-13439962664
* @since 2020-03-19
*/
public interface CrmCustomerService extends IService<CrmCustomerEntity> {

    /**
    * 分页列表
    * @param param 根据需要进行传值
    * @return
    */
    IPage<CrmCustomerEntity> page(CrmCustomerEntity param);

    /**
    * 详情
    * @param id
    * @return
    */
    CrmCustomerEntity info(Long id);

    /**
    * 新增
    * @param param 根据需要进行传值
    * @return
    */
    void add(CrmCustomerEntity param) throws GlobalException;

    /**
    * 修改
    * @param param 根据需要进行传值
    * @return
    */
    void modify(CrmCustomerEntity param) throws GlobalException;

    /**
    * 删除(单个条目)
    * @param id
    * @return
    */
    void remove(Long id);

    /**
    * 删除(多个条目)
    * @param ids
    * @return
    */
    void removes(List<Long> ids);
}
