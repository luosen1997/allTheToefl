package com.project812.tuofu.dao;

import com.project812.tuofu.pojo.OpenClass;

import java.util.List;

public interface OpenClassDao {
    public List<OpenClass> getClassById(OpenClass openClass);

    public List<OpenClass> getClassList();

    OpenClass addPhraseNum(OpenClass openClass);

    void addPhraseNumTrue(OpenClass openClass);

    void addPhrase(OpenClass openClass);

    List<OpenClass> selectThree();
}
