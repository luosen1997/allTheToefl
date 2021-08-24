package com.project812.tuofu.service.impl;

import com.project812.tuofu.dao.CastleDao;
import com.project812.tuofu.pojo.Castle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CastleServiceImpl implements CastleService{

    @Autowired
    CastleDao castleDao;

    @Override
    public List<Castle> getCastle(Castle castle) {
          return castleDao.getCastle(castle);
    }

    @Override
    public void deleteCastle(String ids) {
         castleDao.deleteCastle(ids);
    }

    @Override
    public void closeCastle(String ids) {
         castleDao.closeCastle(ids);
    }

    @Override
    public void recoveryCastle(String ids) {
         castleDao.recoveryCastle(ids);
    }
}
