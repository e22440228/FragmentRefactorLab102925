package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Display_UserName : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_display__user_name, container, false)
        }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val displayTextView = view.findViewById<TextView>(R.id.displayTextView)
        val nameEditText = view.findViewById<EditText>(R.id.nameEditText)
        val changeButton = view.findViewById<Button>(R.id.changeButton)

        var name = nameEditText.text

        changeButton.setOnClickListener {
            if (name.isNotBlank())
                displayTextView.text = "Hello, ${name}!"
            else
                displayTextView.text = "Please enter your name"
        }


    }

}