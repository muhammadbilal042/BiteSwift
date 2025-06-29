package com.example.biteswift.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.biteswift.Adapter.CartAdapter.CartViewholder
import com.example.biteswift.databinding.CartlistBinding

class CartAdapter(private val Cartitems : MutableList<String>,private val  Cartprice: MutableList<String>, private val CartImage : MutableList<Int>) : RecyclerView.Adapter<CartViewholder>() {
    private val ItemQuantaties = IntArray(Cartitems.size){1}
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CartViewholder {
        val binding = CartlistBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CartViewholder(binding)
    }

    override fun onBindViewHolder(holder: CartViewholder,position: Int) {
        holder.bind(position)
    }
    override fun getItemCount(): Int = Cartitems.size

   inner class CartViewholder (private val binding: CartlistBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int) {
            binding.apply {
                val Quantity = ItemQuantaties[position]
                cartitemtv.text = Cartitems[position]
                cartFoodimage.setImageResource(CartImage[position])
                cartpricetv.text = Cartprice[position]
                cartquantity.text = Quantity.toString()


                minusbtn.setOnClickListener {
                    decrease(position)

                }
                plusbtn.setOnClickListener {

                    Increase(position)
                }
                cartdelbtn.setOnClickListener {
                    val itemposition = adapterPosition
                    if(itemposition != RecyclerView.NO_POSITION)
                    Delitem(itemposition)

                }
                }
            }
       private fun decrease (position: Int){
           if(ItemQuantaties[position]>1) {
               ItemQuantaties[position]--
               binding.cartquantity.text = ItemQuantaties[position].toString()
           }
       }
       private fun Increase (position: Int){
           if(ItemQuantaties[position]<10) {
               ItemQuantaties[position]++
               binding.cartquantity.text = ItemQuantaties[position].toString()
           }
       }
       private fun Delitem (position: Int){
           Cartitems.removeAt(position)
           Cartprice.removeAt(position)
           CartImage.removeAt(position)
           notifyItemRemoved(position)
           notifyItemRangeChanged(position,Cartitems.size)


       }
        }



}