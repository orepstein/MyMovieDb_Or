package com.mymoviedb.movie_db

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mymoviedb.R


class MovieDBFragment : Fragment() {

    companion object {
        fun newInstance() = MovieDBFragment()
    }

    private lateinit var viewModel: MovieDBViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.movie_d_b_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MovieDBViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
