package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class Fragment2 : Fragment(R.layout.fragment2) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val textView = view.findViewById<TextView>(R.id.textView2)
        val button2 = view.findViewById<Button>(R.id.button2)
        textView.text = arguments?.getString("openWithId")
    }
    companion object {
        fun newInstance(text: String): Fragment2 {
            val args = Bundle()
            args.putString("openWithId", text)
            val fragment = Fragment2()
            fragment.arguments = args
            return fragment
        }
    }

}