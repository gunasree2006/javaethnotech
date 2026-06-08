/*📘 Theory

A jagged array is a 2D array where each row can have a different number of columns.
Unlike a normal 2D (rectangular) array, memory is allocated row by row.

        👉 In Java, jagged arrays are very natural because 2D arrays are actually arrays of arrays.

        🔹 Key Points
.Rows can have unequal lengths
.Memory efficient when data size varies per row
.Common in problems like:
Student marks (different subjects per student)
Triangle patterns
Graph adjacency lists
🔹 Syntax (Java)
int[][] arr = new int[rows][];

⚠️ Columns are not defined initially

🧠 How Jagged Array Works
arr → [ row0 → [ ] ]
row1 → [ ]
row2 → [ ]

Each row is created separately.

 */
package arrays;

public class jagged_array {

        public static void main(String[] args) {

            int[][] arr = new int[3][];

            arr[0] = new int[2]; // row 0 has 2 columns
            arr[1] = new int[4]; // row 1 has 4 columns
            arr[2] = new int[1]; // row 2 has 1 column

            // Assign values
            arr[0][0] = 10; arr[0][1] = 20;
            arr[1][0] = 30; arr[1][1] = 40;
            arr[1][2] = 50; arr[1][3] = 60;
            arr[2][0] = 70;

            // Print jagged array
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

