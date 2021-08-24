package com.project812.tuofu.service;

import com.project812.tuofu.pojo.OpenClass;

import java.util.List;

public interface OpenClassService {
    public List<OpenClass> getClassById(OpenClass openClass);

    public List<OpenClass> getClassList();

    boolean addPhraseNum(OpenClass openClass);

    void addPhraseNumTrue(OpenClass openClass);

    void addPhrase(OpenClass openClass);

    List<OpenClass> selectThree();
}
