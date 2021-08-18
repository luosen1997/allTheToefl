package com.project812.tuofu.service;


import com.project812.tuofu.pojo.Actives;

import java.util.List;

public interface ActivesService {

    public List<Actives> getActives();

    public void addActive(Actives actives);

    public void deleteActive(String ids);
}
