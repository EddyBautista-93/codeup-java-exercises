package movies;

import util.Input;

public class MoviesApplication {
    public static void main(String[] args) {
        Movie[] movies = MoviesArray.findAll();
        Input sc = new Input();

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: ");

        int input = sc.getInt(0,5);

//        if (input.) {
//            for (Movie movie : movies) {
//                System.out.println(movie.getName());
//            }
//        } else if(input.){
//            for (Movie movie : movies) {
//                if(movie.getCategory().equalsIgnoreCase("animated")){
//                System.out.println(movie.getName());
//
//                }
//            }
//        }


//            System.out.println(movie.getName());
//            System.out.println(movie.getCategory());
//        }

    }
}
