package com.example.freshshop.fragments

import com.example.freshshop.R
import com.moony.calc.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_register.*

class RegisterFragment : BaseFragment() {
    override fun init() {
        txt_back.setOnClickListener {
            activity!!.onBackPressed()
        }
    }

    override fun getLayoutId(): Int = R.layout.fragment_register
}