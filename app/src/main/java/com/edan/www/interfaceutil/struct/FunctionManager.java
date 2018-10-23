package com.edan.www.interfaceutil.struct;

import android.text.TextUtils;
import android.util.Log;

import java.util.HashMap;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 9:39
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class FunctionManager {
    private static final String TAG = "FunctionManager";

    private static FunctionManager mFunctionManager;

    private FunctionManager() {
        mNoParamNoResultHashMap = new HashMap<>();
        mParamOnlyHashMap = new HashMap<>();
        mResultOnlyHashMap = new HashMap<>();
        mWithParamWithResultHashMap = new HashMap<>();
    }

    public static FunctionManager getInstance() {
        if (mFunctionManager == null) {
            mFunctionManager = new FunctionManager();
        }
        return mFunctionManager;
    }

    private HashMap<String, FunctionNoParamNoResult> mNoParamNoResultHashMap;
    private HashMap<String, FunctionParamOnly> mParamOnlyHashMap;
    private HashMap<String, FunctionResultOnly> mResultOnlyHashMap;
    private HashMap<String, FunctionWithParamWithResult> mWithParamWithResultHashMap;

    public FunctionManager addFunction(FunctionNoParamNoResult noParamNoResult) {
        if (mNoParamNoResultHashMap!=null) {
            mNoParamNoResultHashMap.put(noParamNoResult.mFunctionName, noParamNoResult);
        }
        return this;
    }

    /**
     * 无参无返回值类型
     * @param functionName
     */
    public void invokeFunction(String functionName) {
        if (TextUtils.isEmpty(functionName)){
            return;
        }
        if (mNoParamNoResultHashMap != null) {
            FunctionNoParamNoResult noParamNoResult = mNoParamNoResultHashMap.get(functionName);
            if (noParamNoResult != null) {
                noParamNoResult.function();
            } else {
                Log.e("aaa", "function is null !");
            }
        } else {
            new NullPointerException("mNoParamNoResultHashMap can not be null ,please first init FunctionManager !");
        }
    }

    public FunctionManager addFunction(FunctionParamOnly functionParamOnly){
        if (mParamOnlyHashMap!=null){
            mParamOnlyHashMap.put(functionParamOnly.mFunctionName,functionParamOnly);
        }
        return this;
    }

    /**
     * 有参无返回值类型
     * @param functionName
     * @param data
     * @param <Param>
     */
    public<Param> void invokeFunction(String functionName,Param data){
        if (TextUtils.isEmpty(functionName)){
            return;
        }
        if (mParamOnlyHashMap!=null){
            FunctionParamOnly paramOnly = mParamOnlyHashMap.get(functionName);
            if (paramOnly!=null){
                paramOnly.function(data);
            }else {
                Log.e("aaa", "function is null !");
            }
        }else {
            new NullPointerException("mParamOnlyHashMap can not be null ,please first init FunctionManager !");
        }
    }

    public FunctionManager addFunction(FunctionResultOnly resultOnly){
        if (mResultOnlyHashMap!=null){
            mResultOnlyHashMap.put(resultOnly.mFunctionName,resultOnly);
        }
        return this;
    }

    /**
     * 无参有返回值类型
     * @param functionName
     * @param c
     * @param <Result>
     * @return
     */
    public<Result> Result invokeFunction(String functionName,Class<Result> c){
        if (TextUtils.isEmpty(functionName)){
            return null;
        }
        if (mResultOnlyHashMap!=null){
            FunctionResultOnly functionResultOnly = mResultOnlyHashMap.get(functionName);
            if (functionResultOnly!=null){
                if (c!=null){
                    return c.cast(functionResultOnly.function());
                }else {
                    return (Result) functionResultOnly.function();
                }
            }
        }else {
            new NullPointerException("mResultOnlyHashMap can not be null ,please first init FunctionManager !");
        }
        return null;
    }

    public FunctionManager addFunction(FunctionWithParamWithResult functionWithParamWithResult){
        if (mWithParamWithResultHashMap!=null){
            mWithParamWithResultHashMap.put(functionWithParamWithResult.mFunctionName,functionWithParamWithResult);
        }
        return this;
    }

    /**
     * 有参数有返回值类型
     * @param functionName
     * @param c
     * @param data
     * @param <Result>
     * @param <Param>
     * @return
     */
    public<Result,Param> Result invokeFunction(String functionName, Class<Result> c, Param data){
        if (TextUtils.isEmpty(functionName)){
            return null;
        }
        if (mWithParamWithResultHashMap!=null){
            FunctionWithParamWithResult functionWithParamWithResult = mWithParamWithResultHashMap.get(functionName);
            if (functionWithParamWithResult!=null){
                if (c!=null){
                    return c.cast(functionWithParamWithResult.function(data));
                }else {
                    return (Result) functionWithParamWithResult.function(data);
                }
            }
        }else {
            new NullPointerException("mWithParamWithResultHashMap can not be null ,please first init FunctionManager !");
        }
        return null;
    }

}
