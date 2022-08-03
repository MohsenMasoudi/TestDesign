package com.mohsen.testdesign.app

import android.app.Application
import com.mohsen.testdesign.R
import io.github.inflationx.calligraphy3.CalligraphyConfig
import io.github.inflationx.calligraphy3.CalligraphyInterceptor
import io.github.inflationx.viewpump.ViewPump


class TestDesignApplication :Application() {
    override fun onCreate() {
        super.onCreate()
        initFont()
    }
    private fun initFont() {
        ViewPump.init(
            ViewPump.builder()
                .addInterceptor(
                    CalligraphyInterceptor(
                        CalligraphyConfig.Builder()
                            .setDefaultFontPath(getString(R.string.app_font_bold))
                            .setFontAttrId(R.attr.fontPath)
                            .build()
                    )
                ).build()
        )
    }
}