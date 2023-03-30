package com.nastirlex.test.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.nastirlex.test.CardListAdapter
import com.nastirlex.test.SpacesItemDecoration
import com.nastirlex.test.ViewModel
import com.nastirlex.test.databinding.ActivityMainBinding
import com.nastirlex.test.databinding.CardLayoutBinding


class MainActivity : AppCompatActivity() {

    private val mainViewModel by viewModels<ViewModel>()

    private lateinit var binding: CardLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = CardLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val screenStateObserver = Observer<Boolean> { newState ->
            //when (newState) {
                //false -> binding.progressBar.isVisible = true
                //true -> binding.progressBar.isVisible = false
            //}
        }

        //mainViewModel.screenState.observe(this, screenStateObserver)

//        setupBackButtonClick()
//        setupLoginButtonClick()
//        setupRegisterButtonClick()


        binding.recyclerView.layoutManager = StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL)
        binding.recyclerView.addItemDecoration(SpacesItemDecoration(20))
        binding.recyclerView.adapter = CardListAdapter()
    }

//    private fun setupLoginButtonClick() {
//        binding.loginButton.setOnClickListener {
//            mainViewModel.onLoginButtonClick()
//        }
//    }
//
//    private fun setupRegisterButtonClick() {
//        binding.signUpButton.setOnClickListener {
//            mainViewModel.onRegisterButtonClick(
//                binding.emailEditText.text.toString(),
//                binding.nameEditText.text.toString(),
//                binding.passwordEditText.text.toString()
//            )
//        }
//    }
//
//    private fun setupBackButtonClick() {
//        binding.backUpMaterialButton.setOnClickListener {
//            mainViewModel.onBackButtonClick()
//        }
//    }

}