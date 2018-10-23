package com.edan.www.interfaceutil.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.edan.www.interfaceutil.R;
import com.edan.www.interfaceutil.bean.People;

/**
 * 创建者     Zhangyu
 * 创建时间   2018/10/22 9:15
 * 描述	      ${TODO}
 * <p>
 * 更新者     $Author
 * 更新时间   $Date
 * 更新描述   ${TODO}
 */

public class ThirdFragment extends BaseFragment implements View.OnClickListener {

    public static final String INTERFACE =ThirdFragment.class.getName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.third_fragment_layout, null);
        inflate.findViewById(R.id.third).setOnClickListener(this);
        return inflate;
    }

    @Override
    public void onClick(View v) {

    }
}
