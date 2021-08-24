package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Groups;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GroupsDao {
    List<Groups> getGroups(Groups groups);

    void deleteGroups(@Param("ids") String ids);
}
