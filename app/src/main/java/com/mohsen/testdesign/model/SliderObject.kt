package com.mohsen.testdesign.model

import android.os.Parcelable
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class SliderObject(
    @DrawableRes
    val imagePath:Int,
    val title:String,
    val content:String,

    @ColorRes
    val backgroundColor:Int
) : Parcelable
