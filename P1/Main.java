public class Main {
    public static void main(String[] args) {
        Notificationservice notificationService = new Notificationservice();

        notificationService.addNotification(new Emailnotification());
        notificationService.addNotification(new Smsnotification());

        notificationService.sendNotifications("Hello from the notification service!");
    }
}
