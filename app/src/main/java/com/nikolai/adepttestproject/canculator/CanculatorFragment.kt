package com.nikolai.adepttestproject.canculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.nikolai.adepttestproject.R

class CanculatorFragment: Fragment() {
    private val viewModel: CanculatorViewModel = CanculatorViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstNumber = view.findViewById<EditText>(R.id.FirstNumber)
        val secondNumber = view.findViewById<EditText>(R.id.SecondNumber)

        val buttonAdd = view.findViewById<Button>(R.id.buttonAdd)
        buttonAdd.setOnClickListener {
            val b = viewModel.add()
            view.findViewById<TextView>(R.id.textView2).text = b.toString()
        }

        val buttonSub = view.findViewById<Button>(R.id.buttonSub)
        buttonSub.setOnClickListener {
            val c = viewModel.minus()
            view.findViewById<TextView>(R.id.textView2).text = c.toString()
        }

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val d = viewModel.multiply()
            view.findViewById<TextView>(R.id.textView2).text = d.toString()
        }

        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            try {
                val a = viewModel.divide()
                view.findViewById<TextView>(R.id.textView2).text = a.toString()
            } catch(error: Exception) {
                view.findViewById<TextView>(R.id.textView2).text = error.message
            }
        }

        firstNumber.addTextChangedListener { fieldValue ->
            viewModel.updateFirst(fieldValue.toString())
        }

        secondNumber.addTextChangedListener { fieldValue ->
            viewModel.updateSecond(fieldValue.toString())
        }

    }
}