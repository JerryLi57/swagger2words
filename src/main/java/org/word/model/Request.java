package org.word.model;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by XiuYin.Cui on 2018/1/11.
 */
@Data
public class Request implements Serializable {

    /**
     * 参数名
     */
    private String name;

    /**
     * 数据类型
     */
    private String type;

    /**
     * 参数类型
     */
    private String paramType;

    /**
     * 是否必填
     */
    private Boolean require;

    /**
     * 说明
     */
    private String remark;

    /**
     * cssType
     */
    private Boolean cssType = false;
}
