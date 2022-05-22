package com.nikolai.adepttestproject.firstscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.adepttestproject.R

class FirstScreen: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val calcButton = view.findViewById<Button>(R.id.canculatorButton)
        calcButton.setOnClickListener{
            findNavController().navigate(R.id.action_firstScreen_to_canculatorFragment)
        }


    }
}