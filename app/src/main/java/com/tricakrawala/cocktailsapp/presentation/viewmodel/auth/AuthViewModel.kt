package com.tricakrawala.cocktailsapp.presentation.viewmodel.auth

import androidx.lifecycle.ViewModel
import com.tricakrawala.cocktailsapp.domain.usecase.CocktailUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val useCase: CocktailUseCase) : ViewModel() {

}