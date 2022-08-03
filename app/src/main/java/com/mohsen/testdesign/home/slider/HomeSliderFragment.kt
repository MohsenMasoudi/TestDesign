package com.mohsen.testdesign.home.slider

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mohsen.testdesign.R
import com.mohsen.testdesign.base.BaseFragment
import com.mohsen.testdesign.databinding.FragmentHomeBinding
import com.mohsen.testdesign.databinding.FragmentHomeSliderBinding
import com.mohsen.testdesign.model.SliderObject
import com.mohsen.testdesign.util.ARG_PARCELABLE


class HomeSliderFragment : BaseFragment<FragmentHomeSliderBinding>(R.layout.fragment_home_slider) {
     var sliderObject: SliderObject?=null

    companion object {
        fun newInstance(sliderObject: SliderObject): HomeSliderFragment {
            val fragmentFirst = HomeSliderFragment()
            val args = Bundle()
            args.putParcelable(ARG_PARCELABLE, sliderObject)
            fragmentFirst.arguments = args
            return fragmentFirst
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       arguments?.getParcelable<SliderObject>(ARG_PARCELABLE)?.let {
           sliderObject=it
        }
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
   private fun setUpUI(){
        sliderObject?.let {
            binding.sliderImageView.setImageResource(it.imagePath)
            binding.txtTitle.text=it.title
            binding.txtSubTitle.text=it.content
            binding.backgroundView.setCardBackgroundColor(resources.getColor(it.backgroundColor))

        }
    }
}