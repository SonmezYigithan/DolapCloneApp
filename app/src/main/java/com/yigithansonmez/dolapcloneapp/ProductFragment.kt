package com.yigithansonmez.dolapcloneapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.yigithansonmez.dolapcloneapp.databinding.FragmentProductBinding

class ProductFragment : Fragment() {
    private lateinit var tasarim:FragmentProductBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentProductBinding.inflate(inflater, container, false)

        tasarim.rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val productList = ArrayList<Products>()

        val p1 = Products("Saat",120,12,"saat")
        val p2 = Products("Gözlük",200,15,"gozluk")
        val p3 = Products("Ayakkabı",400,40,"ayakkabi")
        val p4 = Products("Çanta",350,14,"canta")

        productList.add(p1)
        productList.add(p2)
        productList.add(p3)
        productList.add(p4)

        val adapter = ProductsAdapter(requireContext(),productList)
        tasarim.rv.adapter = adapter

        return tasarim.root
    }
}