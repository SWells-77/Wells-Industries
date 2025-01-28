package cero;

import java.util.Scanner;

public class cero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the length and width of the fenced area
        System.out.print("Enter the length of the fenced area (in feet): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the fenced area (in feet): ");
        double width = scanner.nextDouble();

        // Ask for the distance between posts
        System.out.print("Enter the distance between posts (in feet): ");
        double postDistance = scanner.nextDouble();

        // Check if the distance is evenly divisible by the post distance
        if (length % postDistance != 0 || width % postDistance != 0) {
            System.out.println("Error: The distance between posts must evenly divide the length and width.");
            System.out.println("Please run the program again with valid inputs.");
            return;
        }

        // Calculate the number of posts needed
        int postsLength = (int) (length / postDistance) + 1;
        int postsWidth = (int) (width / postDistance) + 1;
        int totalPosts = 2 * (postsLength + postsWidth);

        // Ask for the length of the boards
        System.out.print("Enter the length of the boards (in feet): ");
        double boardLength = scanner.nextDouble();

        // Check if the board length is less than the post distance
        if (boardLength < postDistance) {
            System.out.println("Error: The board length must be greater than or equal to the post distance.");
            System.out.println("Please run the program again with valid inputs.");
            return;
        }

        // Calculate the number of boards needed
        int boardsPerLength = (int) (length / boardLength);
        int boardsPerWidth = (int) (width / boardLength);
        int totalBoards = 2 * (boardsPerLength + boardsPerWidth);

        // Ask for the number of boards per post
        System.out.print("Enter the number of boards per post: ");
        int boardsPerPost = scanner.nextInt();

        // Ask for the cost of each post and each board
        System.out.print("Enter the cost of each post: ");
        double postCost = scanner.nextDouble();
        System.out.print("Enter the cost of each board: ");
        double boardCost = scanner.nextDouble();

        // Calculate the total cost
        double totalPostCost = totalPosts * postCost;
        double totalBoardCost = totalBoards * boardsPerPost * boardCost;
        double grandTotal = totalPostCost + totalBoardCost;

        // Output the results
        System.out.println("Total number of posts required: " + totalPosts);
        System.out.println("Total number of boards required: " + totalBoards * boardsPerPost);
        System.out.println("Total cost of posts: $" + totalPostCost);
        System.out.println("Total cost of boards: $" + totalBoardCost);
        System.out.println("Grand total cost: $" + grandTotal);

        scanner.close();
    }
    }

