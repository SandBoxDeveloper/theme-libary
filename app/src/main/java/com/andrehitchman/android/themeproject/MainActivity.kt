package com.andrehitchman.android.themeproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

   companion object {
       private const val STANDARD_THEME = "standard_theme"
   }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if(BuildConfig.ENABLE_STANDARD_THEME_PARAM == true) {
            setTheme(R.style.themeproject__Theme_Default)
        } else {
            setTheme(R.style.themeproject__Theme_NewProduct)
        }
        setContentView(R.layout.activity_main)
        setUpToolbar()
    }

    private fun setUpToolbar() {
        setSupportActionBar(toolbar)

        supportActionBar.apply {
            title = getString(R.string.app_name)
        }
    }

   //private fun getChosenTheme() = if (BuildConfig.ENABLE_STANDARD_THEME_PARAM == true) R.style.themeproject__Theme_Default else R.style.themeproject__Theme_NewProduct

}
