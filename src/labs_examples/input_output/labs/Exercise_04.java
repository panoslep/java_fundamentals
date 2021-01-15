package labs_examples.input_output.labs;

import videos_source_code.arrays.ArrayLists;
import java.util.ArrayList;
import java.io.*;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        String filepath = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\usedCars.csv";
        String filePathOut = "C:\\Users\\Matlab\\Documents\\CodingNomads\\labs\\online-java-fundamentals\\src\\labs_examples\\input_output\\labs\\NewUsedCars.csv";
        //BufferedReader br = null;

        try (BufferedReader br = new BufferedReader(new FileReader(filepath));
                BufferedWriter bw = new BufferedWriter(new PrintWriter(filePathOut))) {


            String line;
            while((line = br.readLine()) != null) {
                String[] values = line.split(",");
                cars.add(mapValuesToCarObject(values));
            }

            for(Car car : cars) {
                bw.write(car.toString());
                bw.newLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(Car car : cars) {
            System.out.println(car.toString());
        }
    }

    private static Car mapValuesToCarObject(String[] values) {
        Car car = new Car();

        car.setModel(values[0]);
        car.setYear(Integer.parseInt(values[1]));
        car.setMileage(Integer.parseInt(values[2]));
        car.setPrice(Integer.parseInt(values[3]));

        return car;
    }
}


