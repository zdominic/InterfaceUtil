package com.edan.www.interfaceutil.struct;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 9:35
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public abstract class FunctionWithParamWithResult<Result,Param> extends Function {

    public FunctionWithParamWithResult(String functionName) {
        super(functionName);
    }

    public abstract Result function(Param param);
}
