package com.project812.tuofu.service.impl;

import com.project812.tuofu.pojo.Castle;

import java.util.List;

public interface CastleService {

    List<Castle> getCastle(Castle castle);

    void deleteCastle(String ids);

    void closeCastle(String ids);

    void recoveryCastle(String ids);
}
