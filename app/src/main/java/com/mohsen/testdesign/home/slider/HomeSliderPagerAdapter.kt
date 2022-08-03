package com.mohsen.testdesign.home.slider

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.mohsen.testdesign.model.SliderObject


class HomeSliderPagerAdapter(fa: FragmentActivity, private val list:MutableList<SliderObject>) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int {
        return list.size
    }

    override fun createFragment(position: Int): Fragment {
       return HomeSliderFragment.newInstance(list[position])
    }


}