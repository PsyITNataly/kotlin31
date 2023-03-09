fun main() {
    for (i in 0 .. 100) {
        println("был(а) " + lastSeen(i * 3600))
    }
}
fun lastSeen(seconds: Int): String {
    return when {
        seconds < 60 -> "только что"
        seconds < 60 * 60 && seconds >= 60 -> "${seconds / 60} ${minutes(seconds / 60)} назад"
        seconds < 60 * 60 * 24 && seconds >= 60 -> "${seconds / 60 / 60} ${hours(seconds / 60 / 60)} назад"
        seconds < 60 * 60 * 24 * 2 && seconds >= 60 * 24 -> "вчера"
        seconds < 60 * 60 * 24 * 3 && seconds >= 60 * 24 * 2 -> "позавчера"
        else -> "Давно"
    }
}
fun minutes(minutes: Int): String {
    return when {
        minutes % 10 == 1 && minutes % 100 !== 11 -> "минуту"
        minutes % 10 == 2 && minutes % 100 !== 12 -> "минуты"
                minutes % 10 == 3 && minutes % 100 !== 13 -> "минуты"
                minutes % 10 == 4 && minutes % 100 !== 14 -> "минуты"
        else -> "минут"

    }
}
fun hours(hours: Int): String {
    return when {
        hours % 10 == 1 && hours % 100 !== 11 -> "час"
        hours % 10 == 2 && hours % 100 !== 12 -> "часа"
        hours % 10 == 3 && hours % 100 !== 13 -> "часа"
        hours % 10 == 4 && hours % 100 !== 14 -> "часа"
        else -> "часов"
    }
}
