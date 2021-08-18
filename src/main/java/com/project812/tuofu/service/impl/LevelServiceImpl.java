package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.LevelsDao;
import com.project812.tuofu.pojo.Level;
import com.project812.tuofu.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    LevelsDao levelsDao;
    @Override
    public List<Level> getLevels() {
        return levelsDao.getLevels();
    }
}
