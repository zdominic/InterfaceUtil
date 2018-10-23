package com.edan.www.interfaceutil.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.edan.www.interfaceutil.R;
import com.edan.www.interfaceutil.bean.Student;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 9:15
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class SecondFragment extends BaseFragment implements View.OnClickListener {

    public static final String INTERFACE = SecondFragment.class.getName() + "onlyParam";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.second_fragment_layout, null);
        inflate.findViewById(R.id.two).setOnClickListener(this);
        return inflate;
    }

    @Override
    public void onClick(View v) {

    }
}
