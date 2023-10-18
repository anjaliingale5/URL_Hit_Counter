package com.Geekster.URLHitCounter.service;

import com.Geekster.URLHitCounter.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {

    @Autowired
    Repo myRepo;


    public String hitt() {
        myRepo.getMylist().add(1);
        return "hitted";
    }

    public int getcount() {

        return myRepo.getMylist().size();
    }



}
