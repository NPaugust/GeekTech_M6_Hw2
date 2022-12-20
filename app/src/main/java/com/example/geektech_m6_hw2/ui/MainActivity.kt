package com.example.geektech_m6_hw2.ui
import com.example.geektech_m6_hw2.base.BaseActivity
import com.example.geektech_m6_hw2.base.BaseViewModel
import com.example.geektech_m6_hw2.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, BaseViewModel>() {
    override fun inflateVB(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}

