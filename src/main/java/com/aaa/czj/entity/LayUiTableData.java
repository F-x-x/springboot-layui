package com.aaa.czj.entity;

import java.util.List;

/**
 * @Author: 陈建
 * @Date: 2019/9/27 0027 16:57
 * @Version 1.0
 */
public class LayUiTableData {
    private int code;
    private String msg;
    private long count;
    private List<?> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
