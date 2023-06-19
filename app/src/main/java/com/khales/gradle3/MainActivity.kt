package com.khales.gradle3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * koud balak 3lshan tshouf el variables ely mtsgla fl Build config enta lazem tshouf mwdo3 enta mkhtar ani select variant type w da mohem 3lshan bykhtalef bkhtlaf el select type
         * ely enta mkhtaro
         */
        val BUILD_TYPE = BuildConfig.BUILD_TYPE
        val VERSION_NAME = BuildConfig.VERSION_NAME
        val VERSION_CODE = BuildConfig.VERSION_CODE
        val IS_COM = BuildConfig.IS_COM



    }




}