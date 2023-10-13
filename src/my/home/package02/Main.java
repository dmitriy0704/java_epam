package my.home.package02;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

     //Циклы:





    }

    public static int getRole(String role) throws IllegalAccessException {
        return switch (role) {
            case "guest" -> 1;
            case "client" -> 2;
            case "moderator" -> 3;
            case "admin" -> 4;
            default -> {
                throw new IllegalAccessException("non autentic role " + role);
            }
        };
    }
}
