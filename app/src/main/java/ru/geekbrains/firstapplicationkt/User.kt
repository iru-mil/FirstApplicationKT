package ru.geekbrains.firstapplicationkt

data class User(val name: String = "Иван", val surname: String = "Иванов") {

    fun getUsername(name: String, surname: String): String {
        return "Пользователь $name $surname"
    }

}
