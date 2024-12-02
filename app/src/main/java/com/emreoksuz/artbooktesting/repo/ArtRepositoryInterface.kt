package com.emreoksuz.artbooktesting.repo

import androidx.lifecycle.LiveData
import com.emreoksuz.artbooktesting.model.ImageResponse
import com.emreoksuz.artbooktesting.roomdb.Art
import com.emreoksuz.artbooktesting.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString: String) : Resource<ImageResponse>

}