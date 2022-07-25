package com.example.ListApp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ListApp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {// View?のnull許容を外せる理由は、直後で bindingに代入(初期化)してるから。
        // Fragment の inflateメソッドを使うことで fragment_home.xml を表示できている
        // 第一引数は getLayoutInflater
        // LayoutInflater とは xml を Viewオブジェクトに変換するもの
        // 第二引数は ViewGroup
        // ViewGroup は Viewオブジェクトのグループ
        // attachToParent このviewを作成するタイミングでViewGroupにセットする(true)のかしない(false)のか。fragmentManagerがセットしてくれるものなのでfalseにしている。trueにすると二重でセットされちゃう。
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}