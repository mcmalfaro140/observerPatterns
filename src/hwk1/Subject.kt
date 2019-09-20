package hwk1

interface Subject{
    fun registerObserver(x:Subscriber);
    fun removeObserver(x: Subscriber);
    fun notifyObserver(x:String);
};
