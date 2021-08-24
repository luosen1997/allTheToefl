package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Links;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface WebLinksDao {

    public List<Links> getWebLinks();

    public void addLink(Links links);

    public void deleteLink(@Param("ids") String ids);

    public List<Links> footerLink();
}
