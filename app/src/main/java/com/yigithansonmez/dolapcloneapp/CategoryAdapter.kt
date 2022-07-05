package com.yigithansonmez.dolapcloneapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yigithansonmez.dolapcloneapp.databinding.CategoryCardDesignBinding
import com.yigithansonmez.dolapcloneapp.databinding.ProductCardDesignBinding

class CategoryAdapter(var mContext: Context, var CategoryList:List<Categories>)
    : RecyclerView.Adapter<CategoryAdapter.CategoryCardDesignTutucu>() {
    inner class CategoryCardDesignTutucu(tasarim:CategoryCardDesignBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CategoryCardDesignBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryAdapter.CategoryCardDesignTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CategoryCardDesignBinding.inflate(layoutInflater, parent, false)
        return CategoryCardDesignTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CategoryAdapter.CategoryCardDesignTutucu, position: Int) {
        val category = CategoryList.get(position)
        val t = holder.tasarim
        t.imageViewCategory.setImageResource(
            mContext.resources.getIdentifier(category.categoryImgName,"drawable",mContext.packageName))
        t.textViewCategory.text = category.categoryName
    }

    override fun getItemCount(): Int {
        return CategoryList.size
    }

}