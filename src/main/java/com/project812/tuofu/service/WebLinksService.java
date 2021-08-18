package com.project812.tuofu.service;

import com.project812.tuofu.pojo.Actives;
import com.project812.tuofu.pojo.Links;

import java.util.List;

public interface WebLinksService {

    public List<Links> getWebLinks();

    public void addLink(Links links);

    public void deleteLink(String ids);
}
