package com.yigithansonmez.dolapcloneapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.yigithansonmez.dolapcloneapp.databinding.FragmentCategoryBinding
import com.yigithansonmez.dolapcloneapp.databinding.FragmentProductBinding

class CategoryFragment : Fragment(){
    private lateinit var tasarim:FragmentCategoryBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentCategoryBinding.inflate(inflater, container, false)

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL)

        val categoryList = ArrayList<Categories>()

        val p1 = Categories("Çok Favorilenenler","ic_baseline_favorite_border_24")
        val p2 = Categories("Bedenim","ic_baseline_favorite_border_24")
        val p3 = Categories("Markam","ic_baseline_favorite_border_24")

        categoryList.add(p1)
        categoryList.add(p2)
        categoryList.add(p3)

        val adapter = CategoryAdapter(requireContext(),categoryList)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }
}