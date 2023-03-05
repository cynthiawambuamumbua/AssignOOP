fun main(){
    val  details=Humans("Cynthia",19,65)
    details.eat(5)
    details.Speak("i love smiling")
    details.birthday()
    var person=User("Cynthia","Wambua","cynthiamumbuawambua@gmail.com",713504579,7065)
    person.user("Cynthia")
    person.email("cynthiamumbuawambua@gmail.com")
}
class Humans(var name:String,var age:Int,val weight:Int) {
    fun eat(foodWeight: Int) {
        var newWeight = weight + foodWeight
        println("i am eating $newWeight kgs of food")

    }
    fun Speak(speech:String){
            println(speech)
    }
    fun birthday(){
        var newAge = ++age
        println(newAge)
    }
}
data class User(var firstName:String,var lastName:String,var email:String,val phoneNumber:Int,val password:Int){
    fun user(firstName: String){
    println(firstName)

    }
    fun email(email: String){
        println(email)
    }

}