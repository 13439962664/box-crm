package com.box.crm.service.impl;

import com.box.crm.entity.CrmCustomerEntity;
import com.box.crm.mapper.CrmCustomerMapper;
import com.box.crm.service.CrmCustomerService;
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
* @since 2020-03-19
*/
@Service
public class CrmCustomerServiceImpl extends ServiceImpl<CrmCustomerMapper, CrmCustomerEntity> implements CrmCustomerService {

    @Autowired
    private PageUtils pageUtils;

    /**
    * 分页列表
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public IPage<CrmCustomerEntity> page(CrmCustomerEntity param) {

        QueryWrapper<CrmCustomerEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
            // 姓名
            .eq(!StringUtils.isEmpty(param.getName()), CrmCustomerEntity::getName, param.getName())
            // 英文名
            .eq(!StringUtils.isEmpty(param.getEnglishName()), CrmCustomerEntity::getEnglishName, param.getEnglishName())
            // 性别
            .eq(param.getGender() != null, CrmCustomerEntity::getGender, param.getGender())
            // 手机号码
            .eq(!StringUtils.isEmpty(param.getMobilePhone()), CrmCustomerEntity::getMobilePhone, param.getMobilePhone())
            // 手机号码2
            .eq(!StringUtils.isEmpty(param.getMobilePhone2()), CrmCustomerEntity::getMobilePhone2, param.getMobilePhone2())
            // 固定电话号码
            .eq(!StringUtils.isEmpty(param.getFixedPhone()), CrmCustomerEntity::getFixedPhone, param.getFixedPhone())
            // 生日
            .eq(param.getBirthday() != null, CrmCustomerEntity::getBirthday, param.getBirthday())
            // 国籍
            .eq(!StringUtils.isEmpty(param.getNationalityName()), CrmCustomerEntity::getNationalityName, param.getNationalityName())
            // 省份
            .eq(!StringUtils.isEmpty(param.getProvinceName()), CrmCustomerEntity::getProvinceName, param.getProvinceName())
            // 城市
            .eq(!StringUtils.isEmpty(param.getCityName()), CrmCustomerEntity::getCityName, param.getCityName())
            // 区县
            .eq(!StringUtils.isEmpty(param.getCountyName()), CrmCustomerEntity::getCountyName, param.getCountyName())
            // 家庭住址
            .eq(!StringUtils.isEmpty(param.getHomeAddress()), CrmCustomerEntity::getHomeAddress, param.getHomeAddress())
            // 职业
            .eq(!StringUtils.isEmpty(param.getProfessionName()), CrmCustomerEntity::getProfessionName, param.getProfessionName())
            // 简介
            .eq(!StringUtils.isEmpty(param.getResume()), CrmCustomerEntity::getResume, param.getResume())
            // 公司
            .eq(!StringUtils.isEmpty(param.getCompanyName()), CrmCustomerEntity::getCompanyName, param.getCompanyName())
            // 公司地址
            .eq(!StringUtils.isEmpty(param.getCompanyAddress()), CrmCustomerEntity::getCompanyAddress, param.getCompanyAddress())
            // 职位
            .eq(!StringUtils.isEmpty(param.getPositionName()), CrmCustomerEntity::getPositionName, param.getPositionName())
;

        IPage<CrmCustomerEntity> page = page(pageUtils.page(), queryWrapper);

        return page;
    }

    /**
    * 详情
    * @param id
    * @return
    */
    @Override
    public CrmCustomerEntity info(Long id) {

        return getById(id);
    }

    /**
    * 新增
    * @param param 根据需要进行传值
    * @return
    */
    @Override
    public void add(CrmCustomerEntity param) throws GlobalException{

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
    public void modify(CrmCustomerEntity param) throws GlobalException{

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
