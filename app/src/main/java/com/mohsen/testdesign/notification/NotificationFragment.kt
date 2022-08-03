package com.mohsen.testdesign.notification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mohsen.testdesign.R
import com.mohsen.testdesign.base.BaseFragment
import com.mohsen.testdesign.databinding.FragmentHomeBinding
import com.mohsen.testdesign.databinding.FragmentNotificationBinding


class NotificationFragment  : BaseFragment<FragmentNotificationBinding>(R.layout.fragment_notification)  {


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