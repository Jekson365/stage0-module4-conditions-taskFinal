package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public static void main(String[] args) {
        TriangleSidesValidator t = new TriangleSidesValidator();
        t.validate(1,2,6);
    }
    public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 12:
                System.out.println("Winter");
                break;
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Spring");
                break;
            case 4:
                System.out.println("Spring");
                break;
            case 5:
                System.out.println("Spring");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 7:
                System.out.println("Summer");
                break;
            case 8:
                System.out.println("Summer");
                break;
            case 9:
                System.out.println("Autumn");
                break;
            case 10:
                System.out.println("Autumn");
                break;
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Wrong month number");
                break;
        }
    }
}
