package com.example.myapplication


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

private const val TAG = "Main"
class MainActivity : AppCompatActivity(R.layout.activity_main), FragmentClickListener  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction()
            .add(R.id.main_container, Fragment1())
            .commit()
        }

    override fun onClick() {
        Log.v(TAG, "onclick")
        supportFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.main_container, Fragment2.newInstance(Fragment1().textEditText))
            .commit()
        Log.v(TAG, "click")

    }
}