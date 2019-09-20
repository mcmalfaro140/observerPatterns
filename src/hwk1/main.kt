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
    mike.subscribe();
    kevin.subscribe();
    esmeralda.subscribe();
    hector.subscribe();
    letty.subscribe();

    //Have publisher publish a news letter 20 times
    var temp :Int = 0;
    for (i in 0 until 19){
        temp++;
        latimes.setState(temp)

        latimes.notifyObserver("Exciting news! We have raised ${latimes.x} million dollars!")

        //After 3 millions mike and esmeralda will unsubscribe
        if(latimes.x == 3){
            mike.unsubscribe();
            esmeralda.unsubscribe();
        }else if(latimes.x == 10){ //After 10 millions hector and kevin will unsubscribe
            kevin.unsubscribe();
            hector.unsubscribe();
        }

        println("--------------------------------------------------------------------------------")
    }


}