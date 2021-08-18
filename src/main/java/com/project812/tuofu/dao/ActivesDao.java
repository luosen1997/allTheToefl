package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Actives;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ActivesDao {
    public List<Actives> getActives();

    public void addActive(Actives actives);

    public void deleteActive(@Param("ids") String ids);
}
