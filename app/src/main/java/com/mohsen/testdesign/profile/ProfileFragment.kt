package com.mohsen.testdesign.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mohsen.testdesign.R
import com.mohsen.testdesign.base.BaseFragment
import com.mohsen.testdesign.databinding.FragmentHomeBinding
import com.mohsen.testdesign.databinding.FragmentProfileBinding


class ProfileFragment  : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile)  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

}