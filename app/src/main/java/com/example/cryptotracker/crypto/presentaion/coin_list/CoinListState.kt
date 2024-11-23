package com.example.cryptotracker.crypto.presentaion.coin_list

import androidx.compose.runtime.Immutable
import com.example.cryptotracker.crypto.presentaion.models.CoinUi

@Immutable
data class CoinListState(
    val coins: List<CoinUi> = emptyList(),
    val isLoading: Boolean = false,
    var selectedCoin : CoinUi? = null,
    val error: String = ""
)