package cn.opm.vue.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel
public class User implements Serializable {
    private static final long serialVersionUID = -8097165929526492712L;

    @ApiModelProperty(value = "用户名", name = "name", example = "张三")
    private String name;
    @ApiModelProperty(value = "年龄", name = "age", example = "18")
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
