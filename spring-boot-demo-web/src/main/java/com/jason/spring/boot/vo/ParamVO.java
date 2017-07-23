package com.jason.spring.boot.vo;

import java.util.List;

/**
 * description
 * date: 2017/7/22 19:45
 *
 * @author Jason
 */
public class ParamVO {
    private String id;
    private String name;
    private ParamVO param;
    private List<ParamVO> params;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParamVO getParam() {
        return param;
    }

    public void setParam(ParamVO param) {
        this.param = param;
    }

    public List<ParamVO> getParams() {
        return params;
    }

    public void setParams(List<ParamVO> params) {
        this.params = params;
    }
}
