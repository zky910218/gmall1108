package cn.nosnow.gmall1108.manage.mapper;

import cn.nosnow.gmall.bean.BaseAttrInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Think on 2018/5/7.
 * @author bingHeng
 * @date 2018.05.07
 */
public interface BaseAttrInfoMapper extends Mapper<BaseAttrInfo> {

    List<BaseAttrInfo> getBaseAttrInfoListByCatalog3Id(Long catalog3Id);
}

