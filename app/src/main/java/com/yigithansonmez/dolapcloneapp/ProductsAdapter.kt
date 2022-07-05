package com.yigithansonmez.dolapcloneapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yigithansonmez.dolapcloneapp.databinding.ProductCardDesignBinding

class ProductsAdapter(var mContext: Context, var ProductList:List<Products>)
    : RecyclerView.Adapter<ProductsAdapter.CardDesignTutucu>() {
    inner class CardDesignTutucu(tasarim:ProductCardDesignBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:ProductCardDesignBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsAdapter.CardDesignTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = ProductCardDesignBinding.inflate(layoutInflater, parent, false)
        return CardDesignTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: ProductsAdapter.CardDesignTutucu, position: Int) {
        val product = ProductList.get(position)
        val t = holder.tasarim
        t.imageViewCardImg.setImageResource(
            mContext.resources.getIdentifier(product.productImgName,"drawable",mContext.packageName))
        t.textViewProductName.text = product.productName
        t.textViewPrice.text = "${product.productPrice} ₺"
    }

    override fun getItemCount(): Int {
        return ProductList.size
    }
}