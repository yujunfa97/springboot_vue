package cn.opm.vue.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class JsonResult<T> implements Serializable {
    private static final long serialVersionUID = 874911693683309066L;

    @ApiModelProperty(value = "状态", name = "status", example = "200")
    private Integer status;
    @ApiModelProperty(value = "响应描述", name = "message", example = "响应成功")
    private String message;
    private T data;

    @Override
    public String toString() {
        return "JsonResult{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
