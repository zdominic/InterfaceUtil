package com.edan.www.interfaceutil.bean;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 15:03
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class People {
    private String name;
    private String work;


    public People(String name, String work) {
        this.name = name;
        this.work = work;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", work='" + work + '\'' +
                '}';
    }
}
