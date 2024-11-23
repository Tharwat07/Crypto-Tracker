package com.example.cryptotracker.crypto.presentaion.models

import androidx.annotation.DrawableRes
import com.example.cryptotracker.crypto.domain.Coin
import com.example.cryptotracker.util.getDrawableIdForCoin
import java.text.NumberFormat
import java.util.Locale

data class CoinUi(
    val id: String,
    val name: String,
    val rank: Int,
    val symbol: String,
    val marketCapUsd: DisplayableNumber,
    val priceUsd: DisplayableNumber,
    val changePercent24Hr: DisplayableNumber,
    @DrawableRes val iconRes :Int,

    )

data class DisplayableNumber(
    val value: Double,
    val formatted: String,
)


fun Coin.toCoinUi(): CoinUi {

    return CoinUi(
        id = id,
        name = name,
        rank = rank,
        symbol = symbol,
        marketCapUsd = marketCapUsd.toFormattedString(),
        priceUsd = priceUsd.toFormattedString(),
        changePercent24Hr = changePercent24Hr.toFormattedString(),
        iconRes = getDrawableIdForCoin(symbol)
    )


}

fun Double.toFormattedString(): DisplayableNumber {
    var formatted = NumberFormat.getCurrencyInstance(Locale.getDefault()).apply {
        maximumFractionDigits = 2
        minimumFractionDigits = 2
    }
    return DisplayableNumber(
        value = this,
        formatted = formatted.format(this)
    )
}