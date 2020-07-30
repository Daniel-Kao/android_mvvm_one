package com.example.mvvmdemo.utilities

import com.example.mvvmdemo.data.FakeDatabase
import com.example.mvvmdemo.data.QuoteRepository
import com.example.mvvmdemo.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}