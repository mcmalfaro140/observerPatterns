package hwk1

val observerList = mutableListOf<Subscriber>();

object newsletterpublisher: Subject{

    var x: Int = 0;

    fun setState(parms: Int){
        x = parms;
    }
    override fun registerObserver(x:Subscriber) {
        observerList.add(x);
    }

    override fun removeObserver(x:Subscriber) {
       observerList.remove(x)
    }

    override fun notifyObserver(newsLetter: String) {
        for(element in observerList){
            element.update(newsLetter);
        }
    }

};