package com.edan.www.interfaceutil.bean;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 15:17
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class Engineer {

    private String name;

    private String spectacles;

    public Engineer(String name, String spectacles) {
        this.name = name;
        this.spectacles = spectacles;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "name='" + name + '\'' +
                ", Spectacles='" + spectacles + '\'' +
                '}';
    }
}
