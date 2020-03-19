package com.box.crm.service.impl;

import com.box.crm.entity.CrmCompanyEntity;
import com.box.crm.mapper.CrmCompanyMapper;
import com.box.crm.service.CrmCompanyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.box.common.GlobalException;
import com.box.common.PageUtils;
import com.box.common.RetCode;
import com.box.common.RetJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import com.box.common.GlobalException;
import java.util.List;

/**
* <p>
*  服务实现类
* </p>
*
* @author sunyizhuo-13439962664
* @since 2020-03-18
*/
@Service
public class CrmCompanyServiceImpl extends ServiceImpl<CrmCompanyMapper, CrmCompanyEntity> implements CrmCompanyService {

    @Autowired
    private PageUtils pageUtils;

    /**
    * 分页列表
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public IPage<CrmCompanyEntity> page(CrmCompanyEntity param) {

        QueryWrapper<CrmCompanyEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
            // 公司名称
            .eq(!StringUtils.isEmpty(param.getName()), CrmCompanyEntity::getName, param.getName())
            // 地址
            .eq(!StringUtils.isEmpty(param.getAddress()), CrmCompanyEntity::getAddress, param.getAddress())
            // 国家
            .eq(!StringUtils.isEmpty(param.getNationalityName()), CrmCompanyEntity::getNationalityName, param.getNationalityName())
            // 省份
            .eq(!StringUtils.isEmpty(param.getProvinceName()), CrmCompanyEntity::getProvinceName, param.getProvinceName())
            // 城市
            .eq(!StringUtils.isEmpty(param.getCityName()), CrmCompanyEntity::getCityName, param.getCityName())
            // 区县
            .eq(!StringUtils.isEmpty(param.getCountyName()), CrmCompanyEntity::getCountyName, param.getCountyName())
;

        IPage<CrmCompanyEntity> page = page(pageUtils.page(), queryWrapper);

        return page;
    }

    /**
    * 详情
    * @param id
    * @return
    */
    @Override
    public CrmCompanyEntity info(Long id) {

        return getById(id);
    }

    /**
    * 新增
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public void add(CrmCompanyEntity param) throws GlobalException{

        if (!save(param)) {
            throw new GlobalException(RetJson.err(RetCode.FAILD));
        }
    }

    /**
    * 修改
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public void modify(CrmCompanyEntity param) throws GlobalException{

        if (!updateById(param)) {
            throw new GlobalException(RetJson.err(RetCode.FAILD));
        }
    }

    /**
    * 删除(单个条目)
    * @param id
    * @return
    */
    @Override
    public void remove(Long id) {
        removeById(id);
    }

    /**
    * 删除(多个条目)
    * @param ids
    * @return
    */
    @Override
    public void removes(List<Long> ids) {

        removeByIds(ids);
    }
}
