package com.fourapplecompose.thegoldprospector.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fourapplecompose.thegoldprospector.model.Gold
import com.fourapplecompose.thegoldprospector.network.ApiService
import kotlinx.coroutines.launch

class GoldViewModel: ViewModel() {

    var goldListResponce:List<Gold> by mutableStateOf(listOf())
    var errorMessage: String by mutableStateOf("")

    fun getGoldList(){
        viewModelScope.launch {
            val apiService = ApiService.getInstance()
            try {
                val goldList = apiService.getGold()
                goldListResponce = goldList
            }
            catch (e:Exception){
                errorMessage = e.message.toString()
            }
        }
    }
}