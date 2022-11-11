package my.insta.androie.Messages.Notification;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=BOomvjG94CRDCmvZxVno44ieyPe_uOzdW0vEUguykvxvu_ZOUduS1UtleUUR8sXrGevI0Mweoj11LXPHhDAiDrc"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body NotificationSender body);


}
