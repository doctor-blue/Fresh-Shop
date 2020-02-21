package com.example.freshshop.activities

import android.os.Bundle
import com.example.freshshop.R
import com.example.freshshop.base.BaseActivity
import com.example.freshshop.fragments.LogInFragment
import com.moony.calc.base.BaseFragment

class IntroActivity : BaseActivity() {

    override fun init(savedInstanceState: Bundle?) {
        val signInFragment=LogInFragment()
        replaceFragment(signInFragment)
    }
    val replaceFragment:(BaseFragment)->Unit={
        supportFragmentManager.beginTransaction().replace(R.id.root_intro,it).commit()
    }

    override fun getLayoutId(): Int = R.layout.activity_intro
}
