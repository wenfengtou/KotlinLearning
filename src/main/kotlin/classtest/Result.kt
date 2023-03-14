package classtest

sealed class CustomResult<out T> {
    data class Success<T>(val data: T) : CustomResult<T>()
    data class ClientError(val statusCode: Int, val message: String?) : CustomResult<Nothing>()
    data class ServerError(val statusCode: Int, val message: String?) : CustomResult<Nothing>()
}

//考试成绩
sealed class ExamResult<out T> {
    object Excellent : ExamResult<Nothing>()
    object Normal: ExamResult<Nothing>()
    data class NotPass<T>(val score: T): ExamResult<T>() //不合格的话有分数
}