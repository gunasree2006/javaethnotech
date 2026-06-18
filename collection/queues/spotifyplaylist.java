package collections.arraylist.queue;
import java.util.*;

public class spotifyplaylist {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Queue<String> q = new LinkedList<>();

        // Initial playlist
        q.offer("inky pinky");
        q.offer("samagavaragamana");
        q.offer("lungi dance");
        q.offer("kesariya thera");
        q.offer("sooseki");
        q.offer("chali chaliga");
        q.offer("nagumomu tharale");
        q.offer("ee rathale");

        System.out.println("Choose method:");
        System.out.println("1. Add song");
        System.out.println("2. Remove current song");
        System.out.println("3. Show current song");

        int method = sc.nextInt();


        switch (method) {

            case 1:
                System.out.print("Enter song name to add: ");
                String song = sc.nextLine();   // dynamic input
                q.offer(song);
                System.out.println("Updated Playlist: " + q);
                break;

            case 2:
                System.out.println("Removed song: " + q.poll());
                System.out.println("Updated Playlist: " + q);
                break;

            case 3:
                System.out.println("Current song: " + q.peek());
                break;

            default:
                System.out.println("Invalid option");
        }
        System.out.println(q.contains("kesariya thera"));
        sc.close();
    }

}