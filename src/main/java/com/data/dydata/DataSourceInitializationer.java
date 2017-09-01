package com.data.dydata;

import com.data.dao.DBMapper;
import com.data.entity.Db;
import com.data.service.DbService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSourceInitializationer {
    //声明一个全局的Map，用于保存数据源
    public static  final Map<String,Object> dataSourceMap = new HashMap<String, Object>();

    private DbService dbService;

    private void getAndSaveDataSource(){
        List<Db> dbList = dbService.getDbList();
        if (dbList == null){
            throw IllegalStateException("db list is null");
        }
    }

    public DbService getDbService() {
        return dbService;
    }

    public void setDbService(DbService dbService) {
        this.dbService = dbService;
    }
}
