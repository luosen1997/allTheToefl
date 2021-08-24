package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Group;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupDao {
    String selectGroupId(Integer userId);

    List<Group> selectGroup(@Param("ids") String ids);
}
