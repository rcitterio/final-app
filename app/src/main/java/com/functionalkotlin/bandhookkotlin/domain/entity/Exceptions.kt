package com.functionalkotlin.bandhookkotlin.domain.entity

sealed class APIError

data class AlbumNotFound(val id: String) : APIError()