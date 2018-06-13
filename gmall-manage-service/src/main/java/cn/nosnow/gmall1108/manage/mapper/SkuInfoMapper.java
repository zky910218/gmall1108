package cn.nosnow.gmall1108.manage.mapper;

import cn.nosnow.gmall.bean.SkuInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Think on 2018/6/13.
 * @author bingHeng
 */
public interface SkuInfoMapper extends Mapper<SkuInfo> {

    List<SkuInfo> selectSkuInfoListBySpu(Long spuId);
}
