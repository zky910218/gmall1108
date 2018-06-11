package cn.nosnow.gmall1108.manage.mapper;

import cn.nosnow.gmall.bean.SpuSaleAttr;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Think on 2018/5/16.
 * @author bingHeng
 */
public interface SpuSaleAttrMapper extends Mapper<SpuSaleAttr> {

    List<SpuSaleAttr> selectSpuSaleAttrList(long spuId);
}
