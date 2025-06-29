package com.example.biteswift.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.biteswift.R

class Popular_Adapter(
    private val context: Context,
    private val items: List<String>,
    private val prices: List<String>,
    private val images: List<Int>
) : BaseAdapter() {

    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = convertView ?: LayoutInflater.from(context).inflate(R.layout.popular_item, parent, false)

        val foodName = view.findViewById<TextView>(R.id.Foodnametv)
        val priceText = view.findViewById<TextView>(R.id.PriceTv)
        val foodImage = view.findViewById<ImageView>(R.id.FoodImage)

        foodName.text = items[position]
        priceText.text = prices[position]
        foodImage.setImageResource(images[position])

        return view
    }
}
