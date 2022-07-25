package com.example.ListApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.example.ListApp.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setNavigationBar()
    }

    private fun setNavigationBar() {
        // レイアウトのボトムナビゲーションオブジェクトを取得
        val navView:BottomNavigationView = binding.navView

        // レイアウトのnavHostFragment(デスティネーションの切り替えオブジェクト)を取得
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        // 上記にコントローラー機能を付与
        val navController = navHostFragment.navController

        // ボトムナビゲーションの初期位置を設定

        // レイアウトのボトムナビゲーションをセットする
        navView.setupWithNavController(navController)
    }
}