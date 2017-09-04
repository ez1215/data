//package com.data.dydata;
//
//import com.data.service.DbService;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.util.HashMap;
//import java.util.Map;
//
//@Component
//public class DynamicDataSource extends AbstractRoutingDataSource{
//    private Logger logger = LoggerFactory.getLogger(DynamicDataSource.class);
//
//    private static final Map targetDataSource = new HashMap<>();
//    @Autowired
//    private DbService dbService;
//
//    @Override
//    protected DataSource determineTargetDataSource(){
////        DataSourceMap.dataSourceMap.p
//        return  null;
//    }
//
//    @Override
//    protected String determineCurrentLookupKey() {
//        String dataSourceName = Dbs.getDbType();
//        if (dataSourceName == null || dataSourceName == "dataSource") {
//            // 默认的数据源名字
//            dataSourceName = "dataSource";
//        }
//        logger.debug("use datasource : " + dataSourceName);
//        return dataSourceName;
//    }
//}
