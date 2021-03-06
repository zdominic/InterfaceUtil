package com.edan.www.interfaceutil.struct;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 9:31
 * 描述	      无参有返回值
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public abstract class FunctionResultOnly<Result> extends Function {

    public FunctionResultOnly(String functionName) {
        super(functionName);
    }

    public abstract Result  function();
}
