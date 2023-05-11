package com.example.fragment2023

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.fragment2023.FirstFragment.Companion.ADDRESS_BUNDLE
import com.example.fragment2023.FirstFragment.Companion.NAME_BUNDLE

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // firsSon


        Log.d("Debug","Valor Debug")
        Log.w("Warning","Valor Warning")
        Log.e("Error","Valor Error")
        Log.v("Verbose","Valor Verbose")


        if (savedInstanceState == null) { // sirve para que el onCreate no se cree 2 veces al girar la pantalla
                                          // crea la intsancia del fragment una sola vez

            val bundle =
                bundleOf(NAME_BUNDLE to "FabioDevs", ADDRESS_BUNDLE to "cualquier cosa/String")

            supportFragmentManager.commit {

                setReorderingAllowed(true)
                add<FirstFragment>(R.id.fragmentContainer, args = bundle)
            }

        }


    }
}