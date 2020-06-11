package com.coinpaprika.apiclient.exception

class NotFoundError : Exception {
    constructor() : super()
    constructor(cause: Throwable) : super(cause)
    constructor(message: String): super(message)
}