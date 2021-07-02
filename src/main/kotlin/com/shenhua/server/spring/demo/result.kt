package com.shenhua.server.spring.demo

class ApiResponse<T> {
    var code = 1
    var msg: String? = null
    var data: T? = null

    companion object {
        private const val SUCCESS_CODE = 0
        private const val ERROR_CODE = 1

        fun <T> success(data: T): ApiResponse<T> {
            val result = ApiResponse<T>()
            result.code = SUCCESS_CODE
            result.data = data
            result.msg = "success"
            return result
        }

        fun <T> fail(msg: String, code: Int = ERROR_CODE): ApiResponse<T> {
            val result = ApiResponse<T>()
            result.code = code
            result.msg = msg
            return result
        }
    }
}