package com.leti.progin6304.cameraphotographerassistant

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_settings.*


class SettingsActivity() : AppCompatActivity() {

    private lateinit var mCameraA : CameraActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        title = "Settings"

        //взаимодействие с MainActivity
        //var mCameraActivity: Bundle? = null
//
        //if (intent.hasExtra("keyName")) {
        //    mCameraActivity = intent.getBundleExtra("keyName")
        //    gridSwitch(mCameraActivity)
        //} else {
        //    throw IllegalArgumentException("Activity cannot find  extras keyName")
        //}
    }

    // Возврат по кнопке домой
    override fun onBackPressed() {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
//    public fun setCamera(cameraA : CameraActivity){
//        mCameraA = cameraA;
//    }

    //сетка 3*3
    private fun gridSwitch(mCamerA: Bundle?) {
        test_switch.setOnClickListener {
            if (test_switch.isChecked) {
                mCameraA.setGrid()
            }
        }
    }
}
