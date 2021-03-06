package com.zsy.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zsy.common.utils.PageUtils;
import com.zsy.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author zsy
 * @email 594983498@qq.com
 * @date 2019-10-01 21:08:49
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSkuInfo(SkuInfoEntity skuInfoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);


}
