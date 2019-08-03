package com.adithya.vote4future

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.firebase.database.*


class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "KotlinActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Example of a call to a native method

    }

    fun votescreen(view: View) {
        val i = Intent(this, Vote::class.java)
        startActivity(i)
        finish()
    }
    fun resultscreen(view: View) {
        val i = Intent(this, Results::class.java)
        startActivity(i)
        finish()
    }

    external fun stringFromJNI(): String

}
