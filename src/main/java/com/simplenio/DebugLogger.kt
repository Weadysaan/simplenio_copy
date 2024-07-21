package com.simplenio


class DebugLogger(val tagName: String) {

    companion object {
        private const val ERROR = "ERROR"
        private const val INFO = "INFO"
        private const val DEBUG = "DEBUG"
        private const val WARN = "WARN"
    }

    private var turnOn = false

    fun turnOn() {
        turnOn = true
    }

    fun e(msg: String) {
        if (!turnOn) return
        println("[$ERROR][$tagName] $msg")
    }

    fun e(msg: String, e: Throwable) {
        if (!turnOn) return
        println("[$ERROR][$tagName] $msg")
    }

    fun i(msg: String) {
        if (!turnOn) return
        println("[$INFO][$tagName] $msg")
    }

    fun d(msg: String) {
        if (!turnOn) return
        println("[$DEBUG][$tagName] $msg")
    }

    fun w(msg: String) {
        if (!turnOn) return
        println("[$WARN][$tagName] $msg")
    }
}