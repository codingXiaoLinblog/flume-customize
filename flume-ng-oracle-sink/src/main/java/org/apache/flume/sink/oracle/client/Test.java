package org.apache.flume.sink.oracle.client;

import com.alibaba.druid.pool.DruidDataSource;

import java.sql.Connection;

/**
 * Created by ljh on 2017/10/10.
 */
public class Test {
    public static void main(String[] args) {
        String url ="jdbc:mysql://192.168.1.100/flume?Unicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true";
        String userName ="root";
        String password ="123456";
        DruidDataSource dataSource =  OracleConnect.dataSource(url,userName,password);
        Connection con = OracleConnect.getConnection(dataSource,url,userName,password);
        System.out.println(con);


    }
}
