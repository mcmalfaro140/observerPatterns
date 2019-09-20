package hwk1

fun main(){
    //Instantiate NewsletterPublisher Singleton
    var latimes = newsletterpublisher;

    //Create 5 Observers
    var mike = Subscriber(latimes, "Mike");
    var kevin = Subscriber(latimes, "Kevin");
    var esmeralda = Subscriber(latimes, "Esmeralda");
    var hector = Subscriber(latimes, "Hector");
    var letty = Subscriber(latimes, "Letty");

    //Have them all subscribe to the NewsLetterPublisher
    mike.subscribe(mike);
    kevin.subscribe(kevin);
    esmeralda.subscribe(esmeralda);
    hector.subscribe(hector);
    letty.subscribe(letty);

    //Can also register like this
//    latimes.registerObserver(mike);
//    latimes.registerObserver(kevin);
//    latimes.registerObserver(esmeralda);
//    latimes.registerObserver(hector);
//    latimes.registerObserver(letty);

    //Have publisher publish a news letter 20 times
    for (i in 0 until 19){
        latimes.setState(1)

        latimes.notifyObserver("Exciting news! We have raised ${latimes.x} million dollars!")

        //After 3 millions mike and esmeralda will unsubscribe
        if(latimes.x == 3){
            latimes.removeObserver(mike);
            latimes.removeObserver(esmeralda);
        }else if(latimes.x == 10){ //After 10 millions hector and kevin will unsubscribe
            latimes.removeObserver(kevin);
            latimes.removeObserver(hector);
        }
    }


}