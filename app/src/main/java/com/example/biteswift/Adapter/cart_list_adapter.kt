package com.example.biteswift.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.biteswift.databinding.CartlistBinding

class cart_list_adapter(
    private val context: Context,
    private val items: List<String>,
    private val prices: List<String>,
    private val images: List<Int>
) : BaseAdapter() {

    private val itemquantaties = IntArray(items.size){1}
    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val binding: CartlistBinding

        val view: View
        if (convertView == null) {
            binding = CartlistBinding.inflate(LayoutInflater.from(context), parent, false)
            view = binding.root
            view.tag = binding
        } else {
            view = convertView
            binding = view.tag as CartlistBinding
        }

        val quantity = itemquantaties[position]
        binding.cartitemtv.text = items[position]
        binding.cartpricetv.text = prices[position]
        binding.cartFoodimage.setImageResource(images[position])
        binding.cartquantitytv.text= quantity.toString()

        return view
    }
}


