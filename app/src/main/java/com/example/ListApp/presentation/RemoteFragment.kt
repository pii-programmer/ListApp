package com.example.ListApp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ListApp.databinding.FragmentRemoteBinding

class RemoteFragment : Fragment() {
    private lateinit var binding: FragmentRemoteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRemoteBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}