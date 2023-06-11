package com.denobaba.countriesapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.Navigation
import com.denobaba.countriesapp.view.CountriesFragmentDirections
import com.denobaba.countriesapp.R
import com.denobaba.countriesapp.adapter.countriesadapter
import com.denobaba.countriesapp.databinding.FragmentSecondFragementBinding
import com.denobaba.countriesapp.viewmodel.CountryViewModel


class CountriesFragment : Fragment() {
    private var _binding: FragmentSecondFragementBinding? = null
    private val binding get() = _binding!!
    private lateinit var viewModel: CountryViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_second_fragement, container, false)
        _binding = FragmentSecondFragementBinding.inflate(layoutInflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CountryViewModel::class.java)
        viewModel.getdatafromroom()
        observelivedata()


    }

    private fun observelivedata(){
        viewModel.Contries.observe(viewLifecycleOwner, Observer {countries->
            countries?.let {
                binding.name.text = it.first().name
                binding.capital.text = it.first().capital
                binding.population.text= it.first().population.toString()

            }

        })

    }


}