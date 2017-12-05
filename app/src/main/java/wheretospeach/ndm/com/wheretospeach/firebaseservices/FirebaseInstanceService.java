package wheretospeach.ndm.com.wheretospeach.firebaseservices;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Akash.Sharma on 11/30/2017.
 */

public class FirebaseInstanceService extends FirebaseInstanceIdService
{
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        String data = refreshedToken;

    }
}
