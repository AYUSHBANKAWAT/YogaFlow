package com.example.myapplication.models

import androidx.room.Entity
import com.example.myapplication.localData.DatabasePoint

@Entity(tableName = DatabasePoint.table_Name)
data class LocalResponse(
	val sanskritNameAdapted: String? = null,
	val urlSvg: String? = null,
	val poseDescription: String? = null,
	val urlSvgAlt: String? = null,
	val sanskritName: String? = null,
	val urlPng: String? = null,
	val id: Int? = null,
	val poseBenefits: String? = null,
	val translationName: String? = null,
	val englishName: String? = null
)

