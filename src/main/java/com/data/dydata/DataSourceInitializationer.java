package com.data.dydata;

import com.data.dao.DBMapper;
import com.data.entity.Db;
import com.data.service.DbService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataSourceInitializationer implements BeanFactoryPostProcessor {

    private static final Logger logger = LoggerFactory.getLogger(DataSourceInitializationer.class);
    //声明一个全局的Map，用于保存数据源
    public static  final Map<String,Object> dataSourceMap = new HashMap<String, Object>();

    private DbService dbService;

    private void getAndSaveDataSource() throws IllegalArgumentException{
        List<Db> dbList = dbService.getDbList();
        if (dbList == null){
            logger.error("数据库列表为空");
            throw new IllegalArgumentException("db list is null");
        }
    }

    public DbService getDbService() {
        return dbService;
    }

    public void setDbService(DbService dbService) {
        this.dbService = dbService;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        logger.info("初始化动态数据源开始....");
        DbService dbService = configurableListableBeanFactory.getBean("dbService",DbService.class);
        List<Db> dbList = dbService.getDbList();
        logger.info("获取到数据源，size="+dbList.size());
        logger.info("初始化动态数据源结束....");
    }
}
