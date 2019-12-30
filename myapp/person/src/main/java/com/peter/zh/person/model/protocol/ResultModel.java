package com.peter.zh.person.model.protocol;

import lombok.Data;

/**
 * @author admin_z by 2019/12/17
 * @ClassName ResultModel
 */
@Data
public class ResultModel<T> {
    private String message;

    private int subCode = 0;// 业务状态码

    private T data;

    private MsgPageInfo pageInfo;

    public ResultModel() {
        super();
        this.message = "";
    }

    public ResultModel(T data) {
        this.data = data;
        this.message = "";
    }

    public ResultModel(String message) {
        this.message = message;
    }

    public ResultModel(String message, T data) {
        this.message = message;
        this.data = data;
    }


    public ResultModel(int subCode, String message) {
        this.subCode = subCode;
        this.message = message;
    }

    public ResultModel(T data, int subCode, String message) {
        this.data = data;
        this.subCode = subCode;
        this.message = message;
    }

    public void setData(T data, MsgPageInfo pageInfo) {
        this.data = data;
        this.pageInfo = pageInfo;
    }
}
