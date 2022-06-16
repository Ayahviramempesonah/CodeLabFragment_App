package viratech.codelabfragmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

    val mFragment = supportFragmentManager




        val mHomeFragment = HomeFragment()

        val fragment = mFragment.findFragmentByTag(HomeFragment::class.java.simpleName)

    if (fragment !is HomeFragment ){
        Log.d("my flexible fragment","fragment name" + HomeFragment::class.java.simpleName)
        mFragment
            .beginTransaction()
            // frame_layout ada di activity_main.xml
            .add(R.id.frame_layout,mHomeFragment,HomeFragment::class.java.simpleName)
            .commit()






    }




    }





}