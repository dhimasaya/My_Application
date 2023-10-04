package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityBookKidBinding

class BookKidActivity : AppCompatActivity() {

    lateinit var binding: ActivityBookKidBinding

    private fun replaceFragment(frg: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentBookKid,frg)
        fragmentTrx.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonFairyTale.setOnClickListener{
            replaceFragment(FiaryFragment())
        }
        binding.buttonFable.setOnClickListener{
            replaceFragment(FableFragment())
        }

        binding.buttonScience.setOnClickListener{
            replaceFragment(ScienceFragment())
        }
    }
}