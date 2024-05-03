package com.dao;

import com.entity.CheliangKoufenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangKoufenView;

/**
 * 车辆扣分 Dao 接口
 *
 * @author 
 */
public interface CheliangKoufenDao extends BaseMapper<CheliangKoufenEntity> {

   List<CheliangKoufenView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
