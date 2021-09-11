package com.example.myapplication

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

private const val TAG = "Fragment"
class Fragment1 : Fragment(R.layout.fragment1){

    private var clickListener: FragmentClickListener? = null
    var textEditText = "null"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is FragmentClickListener) {
            clickListener = context
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val editText = view.findViewById<EditText>(R.id.editText)
        textEditText = editText.text.toString()
        val button1 = view.findViewById<Button>(R.id.button1)
        button1.apply {
            setOnClickListener {
                Log.v(TAG, " onclick ")
                clickListener?.onClick()
                Log.v(TAG, " click ")
            }
        }
    }

}