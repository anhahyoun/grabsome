package com.grabsome.common.ext

fun Int.getStringCount(): String {
    return if (this > 999) "99+" else "$this"
}