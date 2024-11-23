package com.example.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val priceUsd: Double,
    val changePercent24Hr: Double,
    val marketCapUsd: Double,
)
