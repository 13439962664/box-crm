package com.box.crm.service;

import com.box.crm.entity.CrmCompanyEntity;
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
* @since 2020-03-18
*/
public interface CrmCompanyService extends IService<CrmCompanyEntity> {

    /**
    * 分页列表
    * @param param 根据需要进行传值
    * @return
    */
    IPage<CrmCompanyEntity> page(CrmCompanyEntity param);

    /**
    * 详情
    * @param id
    * @return
    */
    CrmCompanyEntity info(Long id);

    /**
    * 新增
    * @param param 根据需要进行传值
    * @return
    */
    void add(CrmCompanyEntity param) throws GlobalException;

    /**
    * 修改
    * @param param 根据需要进行传值
    * @return
    */
    void modify(CrmCompanyEntity param) throws GlobalException;

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
