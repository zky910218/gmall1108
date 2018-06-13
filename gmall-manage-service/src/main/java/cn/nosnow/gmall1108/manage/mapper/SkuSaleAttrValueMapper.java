package cn.nosnow.gmall1108.manage.mapper;

import cn.nosnow.gmall.bean.SkuSaleAttrValue;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Think on 2018/6/12.
 * @author bingHeng
 */
public interface SkuSaleAttrValueMapper extends Mapper<SkuSaleAttrValue> {

    List<SkuSaleAttrValue> selectSkuSaleAttrValueListBySpu(Long spuId);
}
