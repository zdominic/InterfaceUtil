package com.edan.www.interfaceutil.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.edan.www.interfaceutil.MainActivity;
import com.edan.www.interfaceutil.struct.FunctionManager;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 16:37
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class BaseFragment extends Fragment {

    public FunctionManager mManager;

    public void setFunctionManager(FunctionManager manager) {
        mManager = manager;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity){
            MainActivity activity = (MainActivity) context;
            activity.setFunctionForFragment(getTag());
        }
    }
}
