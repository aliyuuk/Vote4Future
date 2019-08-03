package com.adithya.vote4future

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import com.google.firebase.database.*

class Results : AppCompatActivity() {
    companion object {
        private const val TAG = "KotlinActivity"
    }

    val database = FirebaseDatabase.getInstance()
    val myRefA = database.getReference("CountA")
    val myRefB = database.getReference("CountB")
    val myRefC = database.getReference("CountC")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)

        myRefA.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                var a: Any? = dataSnapshot.childrenCount
                val textView = findViewById<TextView>(R.id.buttonA)
                textView.setText("" + a).toString()
                val textViewValue = textView.text

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException())
            }
        })
        myRefB.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                var a: Any? = dataSnapshot.childrenCount
                val textView = findViewById<TextView>(R.id.buttonB)
                textView.setText("" + a).toString()
                val textViewValue = textView.text

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException())
            }
        })
        myRefC.addValueEventListener(object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                var a: Any? = dataSnapshot.childrenCount
                val textView = findViewById<TextView>(R.id.buttonC)
                textView.setText("" + a).toString()
                val textViewValue = textView.text

            }

            override fun onCancelled(error: DatabaseError) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException())
            }
        })



    }


}