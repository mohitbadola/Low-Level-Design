package ObserverDesignPattern.Observer;

import ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

     String userName;
    StockObservable observable;

    public MobileAlertObserverImpl(String userName, StockObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update() {
        sendMsgOnMobile(userName, "product is in stock hurry up!");
    }

    private void sendMsgOnMobile(String userName, String msg){

        System.out.println("msg sent to : "+userName);
        //send actual msg to the end user
    }
    
}
