package com.carles.carleskotlin

import com.carles.carleskotlin.poi.domain.PoiDetail
import com.carles.carleskotlin.poi.model.PoiDetailResponseDto
import com.carles.carleskotlin.poi.model.PoiListResponseDto
import com.carles.carleskotlin.poi.model.PoiResponseDto

const val POI_ID = "1"

val emptyPoiList = PoiListResponseDto(listOf())
val poiDetail = PoiDetail(id = POI_ID, title = "the_title", transport = "the_transport", email = "the_email", phone = "the_phone")
val poiListResponseDto = PoiListResponseDto(listOf(createPoiResponseDto(POI_ID), createPoiResponseDto("2")))
val poiResponseDto = createPoiResponseDto(POI_ID)
val poiDetailResponseDto = PoiDetailResponseDto(id = POI_ID,
        title = "the_title",
        transport = "the_transport",
        email = "the_email",
        phone = "the_phone")

private fun createPoiResponseDto(id: String = POI_ID) = PoiResponseDto(id, "the title", "the geocoordinates")

