package learningthreads.threads;
class TicketCounter {
    private int tickets = 1;  // Only ONE ticket

    // synchronized method
    public synchronized void bookTicket(String user) {

        if (tickets > 0) {
            System.out.println(user + " is booking the ticket...");
            tickets--;
            System.out.println(user + " successfully booked the ticket!");
        } else {
            System.out.println("Sorry " + user + ", ticket not available.");
        }
    }
}
public class bookmyshow {

        public static void main(String[] args) {

            TicketCounter counter = new TicketCounter();

            Thread user1 = new Thread(() -> {
                counter.bookTicket("User-1");
            });

            Thread user2 = new Thread(() -> {
                counter.bookTicket("User-2");
            });

            user2.start();
            user1.start();

        }
    }

