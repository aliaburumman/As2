package com.example.as2

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.as2.Math
import com.example.as2.Physics
import com.example.as2.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.item1 ->{
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.frag, Physics())
                    commit()
                }
            }
            R.id.item2->{
                supportFragmentManager.beginTransaction().apply {
                    replace(R.id.frag, Math())
                    commit()
                }
            }
        }
        return true
    }

}