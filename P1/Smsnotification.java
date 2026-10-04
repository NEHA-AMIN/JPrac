public class Smsnotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("SMS notification: " + message);
    }
}
