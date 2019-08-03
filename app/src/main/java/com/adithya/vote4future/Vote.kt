package com.adithya.vote4future

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.firebase.database.*
import java.lang.System.exit

class Vote : AppCompatActivity() {
    companion object {
        private const val TAG = "KotlinActivity"
    }
    val database = FirebaseDatabase.getInstance()
    val myRefA = database.getReference("CountA")
    val myRefB = database.getReference("CountB")
    val myRefC = database.getReference("CountC")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vote)
    }
    fun acount(view: View) {

            val id =myRefA.push().key
            myRefA.child(id.toString()).setValue("1")
        val i = Intent(this, Thankyou::class.java)
        startActivity(i)
        finish()
        }
    fun bcount(view: View) {
        val id =myRefA.push().key
        myRefB.child(id.toString()).setValue("1")
        val i = Intent(this, Thankyou::class.java)
        startActivity(i)
        finish()
    }
    fun ccount(view: View) {
        val id =myRefA.push().key
        myRefC.child(id.toString()).setValue("1")
        val i = Intent(this, Thankyou::class.java)
        startActivity(i)
        finish()
    }


    }

