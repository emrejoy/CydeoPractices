package day_34_practice.deviceTask.deviceTask;

import day_34_practice.deviceTask.Downloadable;

public interface AndroidApps extends Downloadable {

    String appStoreName = "Google Store";
    String OS = "Android";
}

//Create a child interface of Downloadable named AndroidApps:
//			Variables:
//				AppStoreName, OS