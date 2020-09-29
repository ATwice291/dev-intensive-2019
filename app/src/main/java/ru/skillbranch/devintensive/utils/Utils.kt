package ru.skillbranch.devintensive.utils

import java.lang.StringBuilder

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?> {
        val parts : List<String>? = fullName?.trimIndent()?.split(" ")

        var firstName = parts?.getOrNull(0)
            firstName = if (firstName.isNullOrBlank()) null else firstName
        val lastName = parts?.getOrNull(1)
        return firstName to lastName
    }

    fun toInitials(firstName:String?, lastName:String?) : String? {
        val builder = StringBuilder()
        builder.append(if(firstName.isNullOrBlank()) "" else firstName.toUpperCase()[0])
        builder.append(if(lastName.isNullOrBlank()) "" else lastName.toUpperCase()[0])
        return if (builder.toString().isNotEmpty()) builder.toString() else null
    }
}