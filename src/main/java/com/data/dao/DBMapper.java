package com.data.dao;

import com.data.entity.Db;

import java.util.List;

public interface DBMapper {
    public List<Db> getDbList();

    public Db getById(String id);
}
