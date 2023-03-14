package classtest

//import io.ktor.client.*
//import io.ktor.client.engine.cio.*
//import io.ktor.client.request.*
//import io.ktor.http.*



class NothingTest {
    companion object {

        fun testThrow(): Nothing {
            throw IllegalStateException()
        }

        fun doingForEver() {
            while(true) {

            }
        }

        fun getExamResult(score: Int): ExamResult<out Int> {
            return when (score) {
                in 1..59 -> ExamResult.NotPass(score)
                in 60..80 -> ExamResult.Normal
                else -> ExamResult.Excellent
            }
        }

//        suspend fun testFetchData(): CustomResult<String> {
//            val httpClient = HttpClient(CIO)
//            return try {
//                 httpClient.get("https://example.com").let { response ->
//                    when (response.status.value) {
//                        HttpStatusCode.OK.value -> CustomResult.Success(response.toString())
//                        in HttpStatusCode.BadGateway.value..HttpStatusCode.InsufficientStorage.value -> CustomResult.ServerError(response.status.value, response.status.description)
//                        in HttpStatusCode.BadRequest.value..HttpStatusCode.VersionNotSupported.value -> CustomResult.ClientError(response.status.value, response.status.description)
//                        else -> CustomResult.Success("hahaha")
//                    }
//                }
//            } catch (e: Exception) {
//                CustomResult.ClientError(111, "hahaha")
//            }
//
//        }




    }
}

fun main() {
    val v1 = Nothing()
}