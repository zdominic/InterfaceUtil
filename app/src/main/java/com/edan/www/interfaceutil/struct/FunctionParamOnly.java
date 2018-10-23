package com.edan.www.interfaceutil.struct;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 9:29
 * 描述	     有参无返回值
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public abstract class FunctionParamOnly<Param> extends Function {

    public FunctionParamOnly(String functionName) {
        super(functionName);
    }

    public abstract void function(Param param);
}
