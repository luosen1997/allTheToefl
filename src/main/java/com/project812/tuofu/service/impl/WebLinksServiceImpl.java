package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.WebLinksDao;
import com.project812.tuofu.pojo.Links;
import com.project812.tuofu.service.WebLinksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WebLinksServiceImpl implements WebLinksService {
    @Autowired
    WebLinksDao webLinksDao;

    @Override
    public List<Links> getWebLinks() {
        return webLinksDao.getWebLinks();
    }

    @Override
    public void addLink(Links links) {
        webLinksDao.addLink(links);
    }

    @Override
    public void deleteLink(String ids) {
        webLinksDao.deleteLink(ids);
    }

    @Override
    public List<Links> footerLink() {
        return webLinksDao.footerLink();
    }
}
