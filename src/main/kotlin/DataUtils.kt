import java.time.LocalDate
import java.time.format.DateTimeFormatter

object DataUtils {
    fun parse(dateTimeString: String): LocalDate = try {
        LocalDate.parse(dateTimeString)
    } catch (e: Exception) {
        val dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
        LocalDate.parse(dateTimeString, dateFormatter)
    }
}
