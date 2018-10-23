package com.edan.www.interfaceutil.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.edan.www.interfaceutil.R;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 9:15
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class FirstFragment extends BaseFragment  {

    public static final String INTERFACE = FirstFragment.class.getName() + "npnr";

    public static final String TAG = FirstFragment.class.getName();
    private Button mButton;
    //无参

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.first_fragment_layout, null);
        mButton = inflate.findViewById(R.id.one);
        return inflate;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
