package com.androiddevs.mvvmnewsapp.ui.framgents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.androiddevs.mvvmnewsapp.R

/**
 * A simple [Fragment] subclass.
 */
class NewsSearchFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_search_news, container, false)
    }

}
