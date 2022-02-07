package com.rawtooth.socialx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.rawtooth.socialx.databinding.ActivityInUpBinding

class in_up : AppCompatActivity() {
    lateinit var inupBinding: ActivityInUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inupBinding= ActivityInUpBinding.inflate(layoutInflater)
        setContentView(inupBinding.root)
        inupBinding.signin.setOnClickListener{
            changeFragment(Fragin())
        }
        inupBinding.signup.setOnClickListener{
            changeFragment(Fragup())
        }
    }


    private fun changeFragment(fragment:Fragment) {
        val fagManger=supportFragmentManager
        val fagTraction=fagManger.beginTransaction()
        fagTraction.replace(R.id.fragments,fragment)
        fagTraction.commit()
    }
}