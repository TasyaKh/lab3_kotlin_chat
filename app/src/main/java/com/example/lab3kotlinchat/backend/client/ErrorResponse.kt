package com.example.lab3kotlinchat.backend.client

class ErrorResponse(val code: Int, message: String) : Throwable("($code) $message")