import java.util.ArrayList;
import java.util.List;

public class Notificationservice {
    private final List<Notification> notifications = new ArrayList<>();

    public void addNotification(Notification notification) {
        notifications.add(notification);
    }

    public void sendNotifications(String message) {
        for (Notification notification : notifications) {
            notification.send(message);
        }
    }
}
