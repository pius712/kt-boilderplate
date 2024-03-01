package com.pius.boilerplate.support.error

class CoreApiException(
    errorType: ErrorType
) : RuntimeException(errorType.message)