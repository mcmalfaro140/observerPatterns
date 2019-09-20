package hwk1

class Subscriber( var publisher: newsletterpublisher, var name : String): Observer{

    fun printNewsletter(newsletter: String){
        println("--> $newsletter")
    }
    override fun update(newUpdateFromPublisher:String) {
        println("Update for $name :")
        printNewsletter(newUpdateFromPublisher)
    }

    fun subscribe(){
        println("********** $name has subscribed *************")
        publisher.registerObserver(this)
    }
    fun unsubscribe(){
        println("********** $name has unsubscribed now *************")
        publisher.removeObserver(this)
    }
}