/**
 * Created by User on 30/04/2017.
 */
public class SecurityAnnouncement implements Announcement {
    @Override
    public String notification(){
        return "Owner called, Control unit alarm siren triggered";
    }
}
