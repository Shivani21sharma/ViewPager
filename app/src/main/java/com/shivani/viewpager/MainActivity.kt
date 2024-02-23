package com.shivani.viewpager

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.shivani.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var layouts = arrayListOf(R.layout.items_layout, R.layout.items_layout2, R.layout.items_layout3)
    var recyclerAdapter = ViewPager(layouts)
    lateinit var ViewPager:ViewPager
    private val TAG = "ViewPager"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        binding.viewPager.adapter = recyclerAdapter
        binding.viewPager.registerOnPageChangeCallback(
            object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    Log.e(TAG, "position $position")
                }
            }
        )
        return binding.root
    }
}