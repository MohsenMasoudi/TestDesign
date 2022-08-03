package com.mohsen.testdesign.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.MarginPageTransformer
import com.google.android.material.appbar.AppBarLayout
import com.mohsen.testdesign.R
import com.mohsen.testdesign.base.BaseFragment
import com.mohsen.testdesign.databinding.FragmentHomeBinding
import com.mohsen.testdesign.home.slider.HomeSliderPagerAdapter
import com.mohsen.testdesign.model.SliderObject
import kotlin.math.abs


class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
    lateinit var homeSliderPagerAdapter: HomeSliderPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUI()
    }

    private fun setUpUI() {
        setUpViewPager()
        detectToolbarBehavior()
    }

    private fun setUpViewPager() {
        val list = mutableListOf<SliderObject>()
        list.add(SliderObject(imagePath = R.drawable.image_test_1, getString(R.string.utechia_gallery), getString(R.string.lorem_ipsum), R.color.white))
        list.add(SliderObject(imagePath = R.drawable.image_test_2, getString(R.string.utechia_gallery), getString(R.string.lorem_ipsum), R.color.teal_200))
        list.add(SliderObject(imagePath = R.drawable.image_test_3, getString(R.string.utechia_gallery), getString(R.string.lorem_ipsum), R.color.white))
        homeSliderPagerAdapter = HomeSliderPagerAdapter(requireActivity(), list)
        binding.viewPager.adapter = homeSliderPagerAdapter
        binding.viewPager.setPageTransformer(MarginPageTransformer(dpToPx(16f)));
        binding.dotsIndicator.setViewPager2(binding.viewPager)

    }

    private fun detectToolbarBehavior() {
        binding.appBar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->
            appBarLayout?.totalScrollRange?.let { totalRang ->
                if (abs(abs(verticalOffset) - totalRang) < 80) {
                    binding.txtMoneyType.visibility = View.GONE
                    binding.viewExtra.visibility = View.GONE
                    binding.viewSponser.visibility = View.GONE
                    // Collapsed
                } else if (verticalOffset == 0) {
                    // Expanded
                    binding.txtMoneyType.visibility = View.VISIBLE
                    binding.viewExtra.visibility = View.VISIBLE
                    binding.viewSponser.visibility = View.VISIBLE

                } else {
                    // Somewhere in between
                    binding.txtMoneyType.visibility = View.VISIBLE
                    binding.viewExtra.visibility = View.VISIBLE
                    binding.viewSponser.visibility = View.VISIBLE

                }
            }

        })
    }

}