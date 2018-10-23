package com.edan.www.interfaceutil;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.edan.www.interfaceutil.bean.Engineer;
import com.edan.www.interfaceutil.bean.People;
import com.edan.www.interfaceutil.bean.Student;
import com.edan.www.interfaceutil.fragment.BaseFragment;
import com.edan.www.interfaceutil.fragment.FirstFragment;
import com.edan.www.interfaceutil.fragment.FourFragment;
import com.edan.www.interfaceutil.fragment.SecondFragment;
import com.edan.www.interfaceutil.fragment.ThirdFragment;
import com.edan.www.interfaceutil.struct.FunctionManager;
import com.edan.www.interfaceutil.struct.FunctionNoParamNoResult;
import com.edan.www.interfaceutil.struct.FunctionParamOnly;
import com.edan.www.interfaceutil.struct.FunctionResultOnly;
import com.edan.www.interfaceutil.struct.FunctionWithParamWithResult;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager mManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.first_button).setOnClickListener(this);
        findViewById(R.id.second_button).setOnClickListener(this);
        findViewById(R.id.third_button).setOnClickListener(this);
        findViewById(R.id.four_button).setOnClickListener(this);
        mManager = getSupportFragmentManager();
    }


    public void setFunctionForFragment(String tag) {
        if (TextUtils.isEmpty(tag)) {
            Log.e(MainActivity.class.getSimpleName(), "tag is null !");
            return;
        }
        BaseFragment fragment = (BaseFragment) mManager.findFragmentByTag(tag);
        FunctionManager functionManager = FunctionManager.getInstance();
        fragment.setFunctionManager(functionManager.addFunction(new FunctionNoParamNoResult(FirstFragment.INTERFACE) {
            @Override
            public void function() {
                Log.e("aaa", "onAttach 第一个响应");
                Toast.makeText(getApplicationContext(), " 第一个响应", Toast.LENGTH_SHORT).show();
            }
        }));

        fragment.setFunctionManager(functionManager.addFunction(new FunctionParamOnly(SecondFragment.INTERFACE) {
            @Override
            public void function(Object o) {
                Student two = (Student) o;
                Toast.makeText(getApplicationContext(), " 第二个响应  " + two, Toast.LENGTH_SHORT).show();
            }

        }));

        fragment.setFunctionManager(functionManager.addFunction(new FunctionResultOnly(ThirdFragment.INTERFACE) {
            @Override
            public Object function() {
                return new People("长方形混凝土瞬间移动师", "good");
            }
        }));

        fragment.setFunctionManager(functionManager.addFunction(new FunctionWithParamWithResult(FourFragment.INTERFACE) {
            @Override
            public Object function(Object o) {
                String s = (String) o;
                return new Engineer("包包", "500度近视"+o);
            }
        }));
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first_button:
                mManager.beginTransaction().replace(R.id.framelayout, new FirstFragment(), FirstFragment.INTERFACE).commit();
                break;
            case R.id.second_button:
                mManager.beginTransaction().replace(R.id.framelayout, new SecondFragment(), SecondFragment.INTERFACE).commit();
                break;
            case R.id.third_button:
                mManager.beginTransaction().replace(R.id.framelayout, new ThirdFragment(),ThirdFragment.INTERFACE).commit();
                break;
            case R.id.four_button:
                mManager.beginTransaction().replace(R.id.framelayout, new FourFragment(),FourFragment.INTERFACE).commit();
                break;
            default:
                break;
        }
    }
}
