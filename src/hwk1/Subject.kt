package hwk1

interface Subject{
    fun registerObserver(x: String);
    fun removeObserver(x: String);
    fun notifyObserver();
};
