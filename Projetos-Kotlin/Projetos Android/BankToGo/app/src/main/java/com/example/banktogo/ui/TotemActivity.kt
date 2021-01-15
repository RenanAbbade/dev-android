package com.example.banktogo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import com.example.banktogo.R
import kotlinx.android.synthetic.main.activity_totem.*
import java.text.FieldPosition


class TotemActivity : AppCompatActivity() {

    var mImages = intArrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)

    val mImagesTitle = listOf("agency1", "agency2", "agency3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_totem)

        carouselView.pageCount = mImagesTitle.size

        carouselView.setImageListener { position, imageView ->
            imageView.setImageResource(mImages[position])
        }

        carouselView.setImageClickListener { position ->
            Toast.makeText(this, mImagesTitle[position], Toast.LENGTH_SHORT).show()
        }
    }
}
