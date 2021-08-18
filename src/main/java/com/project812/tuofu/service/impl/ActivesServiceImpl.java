package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.ActivesDao;
import com.project812.tuofu.pojo.Actives;
import com.project812.tuofu.service.ActivesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivesServiceImpl implements ActivesService {
    @Autowired

    ActivesDao activesDao;

    @Override
    public List<Actives> getActives() {
        return activesDao.getActives();
    }

    @Override
    public void addActive(Actives actives) {
        activesDao.addActive(actives);
    }

    @Override
    public void deleteActive(String ids) {
        activesDao.deleteActive(ids);
    }
}
