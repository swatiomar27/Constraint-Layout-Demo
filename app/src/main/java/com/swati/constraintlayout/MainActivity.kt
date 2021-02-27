package com.swati.constraintlayout

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_rp.setOnClickListener(this)
        tv_bc.setOnClickListener(this)
        tv_cc.setOnClickListener(this)
        tv_chain.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_rp -> {
                val intent = Intent(this, RelativePositioningActivity::class.java)
                startActivity(intent)
            }
            R.id.tv_bc -> {
                //Baseline and Bias demo
                val intent = Intent(this, BaselineConstraintActivity::class.java)
                startActivity(intent)
            }
            R.id.tv_cc -> {
                //Center positioning and center constraint demo
                val intent = Intent(this, CenterConstraintActivity::class.java)
                startActivity(intent)
            }
            R.id.tv_chain -> {
                //Center positioning and center constraint demo
                val intent = Intent(this, ChainsActivity::class.java)
                startActivity(intent)
            }
        }
    }
}