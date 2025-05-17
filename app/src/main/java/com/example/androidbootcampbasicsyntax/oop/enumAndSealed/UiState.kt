package com.example.androidbootcampbasicsyntax.oop.enumAndSealed

sealed class UiState {
    data object Loading : UiState()
    data class Success(val data: String) : UiState()
    data class Error(val message: String) : UiState()
}