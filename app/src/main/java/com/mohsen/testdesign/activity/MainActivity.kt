package com.mohsen.testdesign.activity

import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import androidx.core.view.marginTop
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.mohsen.testdesign.R
import com.mohsen.testdesign.base.BaseActivity
import com.mohsen.testdesign.databinding.ActivityMainBinding
import io.github.inflationx.viewpump.ViewPumpContextWrapper


class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupUI()
    }

    fun setupUI() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavigationView.setupWithNavController(navController)
        binding.bottomNavigationView.menu.getItem(2).isEnabled = false
        binding.fab.setOnClickListener {
            navController.navigate(R.id.categoryFragment)
        }

    }



}