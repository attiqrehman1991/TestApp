package com.test.project

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        Log.d("Master 3", "Test3")

        // Log.d
    }
}
/*
// git checkout -b develop
git add --all
git commit -m "Add a space"

git push -u origin develop
changes


git merge master
 */