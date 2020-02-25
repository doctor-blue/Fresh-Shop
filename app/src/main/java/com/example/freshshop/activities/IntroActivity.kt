package com.example.freshshop.activities

import android.os.Bundle
import com.example.freshshop.R
import com.example.freshshop.base.BaseActivity
import com.example.freshshop.fragments.LogInFragment
import com.example.freshshop.fragments.RegisterFragment
import com.moony.calc.base.BaseFragment

class IntroActivity : BaseActivity() {

    override fun init(savedInstanceState: Bundle?) {
        val logInFragment=LogInFragment()
        logInFragment.openRegisterFragment=openRegisterFragment
        replaceFragment(logInFragment)
    }
    val replaceFragment:(BaseFragment)->Unit={
        supportFragmentManager.beginTransaction().replace(R.id.root_intro,it).commit()

    }
    private val openRegisterFragment:()->Unit={
        supportFragmentManager.beginTransaction().add(R.id.root_intro,RegisterFragment()).addToBackStack("REGISTER").commit()
    }


    override fun getLayoutId(): Int = R.layout.activity_intro
}
