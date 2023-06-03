package com.example.myapplication.models

import com.google.gson.annotations.SerializedName

data class Response(

	@field:SerializedName("Response")
	val response: List<ResponseItem?>? = null
)

data class ResponseItem(

	@field:SerializedName("sanskrit_name_adapted")
	val sanskritNameAdapted: String? = null,

	@field:SerializedName("url_svg")
	val urlSvg: String? = null,

	@field:SerializedName("pose_description")
	val poseDescription: String? = null,

	@field:SerializedName("url_svg_alt")
	val urlSvgAlt: String? = null,

	@field:SerializedName("sanskrit_name")
	val sanskritName: String? = null,

	@field:SerializedName("url_png")
	val urlPng: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("pose_benefits")
	val poseBenefits: String? = null,

	@field:SerializedName("translation_name")
	val translationName: String? = null,

	@field:SerializedName("english_name")
	val englishName: String? = null
)
