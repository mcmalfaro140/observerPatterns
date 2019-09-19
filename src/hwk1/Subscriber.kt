package hwk1

class Subscriber( var publisher: newsletterpublisher, var name: String): Observer{

    fun printNewsletter(newsletter: String){
        print(newsletter)
    }
    override fun update() {
       printNewsletter(name);
    }

    fun subscribe(){

    }
    fun unsubscribe(){

    }
}