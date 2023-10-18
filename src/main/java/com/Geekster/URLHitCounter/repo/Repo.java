package com.Geekster.URLHitCounter.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Repo {

    @Autowired
    List<Integer> mylist;
    public List<Integer> getMylist()
    {

        return mylist;
    }
}
