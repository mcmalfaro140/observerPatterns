package hwk1

val observerList = mutableListOf<String>();

object newsletterpublisher: Subject,{
    var x: Int = 0;
    fun setState(parms: Int){
        x = parms;
    }
    override fun registerObserver(parm: String) {
        observerList.add(parm);
    }

    override fun removeObserver(parm: String) {
       observerList.remove(parm)
    }

    override fun notifyObserver() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
};