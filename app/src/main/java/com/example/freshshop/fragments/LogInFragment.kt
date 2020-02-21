package com.example.freshshop.fragments

import android.text.Editable
import android.view.View
import android.widget.Toast
import com.example.freshshop.R
import com.moony.calc.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_log_in.*

class LogInFragment : BaseFragment() {
    override fun init() {
        btn_sign_in.setOnClickListener {
            if (isPasswordValid(edt_password.text)) {
                Toast.makeText(activity, "Logged in successfully", Toast.LENGTH_SHORT)
                    .show()
            }
        }
        edt_password.setOnKeyListener { _, _, _ ->
            if (isPasswordValid(edt_password.text)) text_input_password.error = null
            false
        }
    }

    override fun getLayoutId(): Int = R.layout.fragment_log_in

    private fun isPasswordValid(text: Editable?): Boolean {
        return text != null && text.length >= 8
    }

}