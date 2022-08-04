package com.example.ListApp.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ListApp.databinding.FragmentCompleteBinding

class CompleteFragment : Fragment() {
    private lateinit var binding: FragmentCompleteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCompleteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}