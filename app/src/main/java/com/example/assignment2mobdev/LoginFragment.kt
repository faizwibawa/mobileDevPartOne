package com.example.assignment2mobdev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class LoginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btnLogin = view.findViewById<Button>(R.id.btnsignup)
        val usernameField = view.findViewById<EditText>(R.id.etUsername)

        btnLogin.setOnClickListener {
            val username = usernameField.text.toString()
            Toast.makeText(requireContext(), "Welcome, $username!", Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.homepageFragment)
        }
    }
}