package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.Castle;

import java.util.List;

public interface CastleDao {
    List<Castle> getCastle(Castle castle);

    void deleteCastle(String ids);

    void closeCastle(String ids);

    void recoveryCastle(String ids);
}
