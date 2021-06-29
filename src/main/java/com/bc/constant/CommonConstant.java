package com.bc.constant;

import org.springframework.http.HttpStatus;

/**
 * @description:
 * @author: tianjin
 * @email: eternity_bliss@sina.cn
 * @create: 2019-09-26 上午11:04
 */
public interface CommonConstant {
    String DOT = ".";
    String COMMA = ",";
    String COLON = ":";
    String BLANK = " ";

    String FULL_TIME_SPLIT_PATTERN = "yyyy-MM-dd HH:mm:ss";


    Integer SUCCESS = HttpStatus.OK.value();

    String FULL_TIME_PATTERN = "yyyyMMddHHmmss";

    String HOUR_FORMAT_MYSQL = "%H:00";
    String DAYS_FORMAT_MYSQL = "%m-%d";
    String MONTH_FORMAT_MYSQL = "%Y-%m";
    String SECOND_FORMAT_MYSQL = "%Y-%m-%d %H";

    String ZONE_ID = "Asia/Shanghai";

    String SENSITIVE_TOTAL = "数据总量";

    String INTER_LAYER = "平台层间";

    String EDGE_IN = "边缘层流入";

    String EDGE_OUT = "边缘层流出";

//    String TOKEN = "Authentication";


}
