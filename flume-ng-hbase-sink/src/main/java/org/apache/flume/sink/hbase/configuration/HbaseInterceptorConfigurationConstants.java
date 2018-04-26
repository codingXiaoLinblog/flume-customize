package org.apache.flume.sink.hbase.configuration;

/**
 * Created by ljh on 2017/10/16.
 */
public class HbaseInterceptorConfigurationConstants {
    /**
     * 分割符
     * */
    public static final String  SEPARATOR = "separator";

    /***
     *删除的字段
     */
    public static final String DELETE_FILD = "deletefild";
    /***
     * 规则类型
     */
    public static final String RULE_TYPE = "ruleType";
    /**
     * 数据条件
     */
    public static final String FILE_VAL = "file_val";
    /**
     * 关联原字段索引
     */
    public static final String FIELDS_CONTACT = "fields_contact";
    /**
     * 定义时间字段
     */
    public static final String FIELDS_DATE_TYPE = "fields_date_type";
    /**
     * RowKey长度
     */
    public static final String Row_Key_Leng = "rowkeyleng";
    /***
     * rowkey
     */
    public static final String Row_Key = "rowkey";
    /***
     *数据符号
     */
    public static final String FH =",";
}
