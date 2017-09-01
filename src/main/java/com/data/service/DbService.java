package com.data.service;

import com.data.dao.DBMapper;
import com.data.entity.Db;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DbService {

    @Autowired
    private DBMapper dbMapper;

    public List<Db> getDbList(){
        return dbMapper.getDbList();
    }
}
