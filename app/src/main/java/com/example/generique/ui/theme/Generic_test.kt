package com.example.generique.ui.theme

class Generic_test {
}
class FillInTheBlankQuestion(
    val questionText: String,
    val answer: String,
    val difficulty: String
)

class TrueOrFalseQuestion(
    val questionText: String,
    val answer: Boolean,
    val difficulty: String
)
class NumericQuestion(
    val questionText: String,
    val answer: Int,
    val difficulty: String
)

// Regardez le code que vous avez écrit. Avez-vous remarqué la répétition ?
//Refactoriser votre code pour utiliser des génériques

class Question<T>(
    val questionText: String,
    val answer: T,
    val difficulty: String
)

//Ajoutez les propriétés questionText, answer et difficulty. La propriété questionText doit être de type String. La propriété answer doit être de type T, car son type de données est spécifié lors de l'instanciation de la classe Question. La propriété difficulty doit être de type String.
//Pour voir comment cela fonctionne avec plusieurs types de questions (questions à trous, vrai ou faux, etc.), créez trois instances de la classe Question dans main(), comme ci-dessous.

fun main() {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", "medium")
    val question2 = Question<Boolean>("The sky is green. True or false", false, "easy")
    val question3 = Question<Int>("How many days are there between full moons?", 28, "hard")
}

//Vous devriez maintenant avoir trois instances de la classe Question, chacune avec des types de données différents pour la réponse, au lieu de trois classes différentes ou de recourir à l'héritage. Si vous souhaitez gérer des questions avec un autre type de réponse, vous pouvez réutiliser la même classe Question.
