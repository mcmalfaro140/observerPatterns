package hwk1

class Subscriber( var publisher: newsletterpublisher, var name : String): Observer{

    fun printNewsletter(newsletter: String){
        println("--> $newsletter")
    }
    override fun update(newUpdateFromPublisher:String) {
        println("Update for $name :")
        printNewsletter(newUpdateFromPublisher)
    }

    fun subscribe(x: Subscriber){
//        println("You are subscribed now")
        publisher.registerObserver(x)
    }
    fun unsubscribe(x:Subscriber){
        println("********** $name has unsubscribed now *************")
        publisher.removeObserver(x)
    }
}