package onboardingQuizes;

import java.util.Scanner;

public class aprilOne {

    public static void main (String[] args){
        // I believe the process is made correctly, now I need to code functionallity for input.
        Scanner keyboard = new Scanner(System.in);

        int numberOfProjects;
        int numberOfDependencies;
        int loopCount = 0;

        System.out.println("Enter the number of projects: ");
        numberOfProjects = keyboard.nextInt();
        String[] projects = new String[numberOfProjects];
        while (loopCount < numberOfProjects){
            System.out.println("Enter project name: ");
            projects[loopCount] = keyboard.next();
            loopCount++;
        }

        System.out.println("Enter the number of dependency pairs: ");
        numberOfDependencies = keyboard.nextInt();
        String[] dependencies = new String[numberOfDependencies];
        loopCount = 0;
        while (loopCount < numberOfDependencies){
            System.out.println("Enter dependency set in format of '(x,y)' where y is dependent on x ");
            dependencies[loopCount] = keyboard.next();
            loopCount++;
        }

        //String[] projects = new String[6];
        //String[] dependencies = new String[5];
        String[] output = new String[numberOfProjects];
        int nextSlot = 0;
        boolean dependenciesFullfilled = false;
        String examinedDependency;
        int iteration = 0;

        /*
        projects[0] = "a";
        projects[1] = "b";
        projects[2] = "c";
        projects[3] = "d";
        projects[4] = "e";
        projects[5] = "f";

        dependencies[0] = "(a,d)";
        dependencies[1] = "(f,b)";
        dependencies[2] = "(b,d)";
        dependencies[3] = "(f,a)";
        dependencies[4] = "(d,c)";

         */

        // We will use both a While and a For loop. The For loop increments through the projects and the
        // While loop is there as it will need to go through all dependecies
        while (true){

            //Compare every project to every dependency
            for (int i = 0; i < projects.length; i++){
                dependenciesFullfilled = true;
                for (int j = 0; j < dependencies.length; j++){
                    // Check for dependencies for the project
                    examinedDependency = dependencies[j];
                    if (projects[i].equals(examinedDependency.substring(3, 4))){
                        // if this If statement was triggered, then this isn't a project
                        // without any dependencies. So that possiblity is eliminated
                        dependenciesFullfilled = false;
                        // Check to see if the dependency it does have is already covered or not
                        for (int k = 0; k < output.length; k++){
                            if (examinedDependency.substring(1, 2).equals(output[k])){
                                // Dependency was already covered, so set this back to true
                                dependenciesFullfilled = true;
                            }
                        }
                    }
                }
                // project 'i' has been compared to all dependencies now.
                if (dependenciesFullfilled == true && !projects[i].equals("")){
                    // add onto Output array
                    output[nextSlot] = projects[i];
                    nextSlot++;
                    // pop it off of the projects array so it isn't examined again
                    projects[i] = "";
                }
            }
            // Break if all slots in output have been filled
            if (nextSlot == output.length){
                break;
            }
            // Implementing loop escape function (for use on if there is no possible arrangement for the projects
            // and dependencies)
            iteration++;
            if (iteration > 10000){
                System.out.println("No possible arrangement for projects and dependencies exist. Breaking out of loop");
                break;
            }
        }
        // Loop is completed, print results
        System.out.print("Results: ");
        for (int i = 0; i < output.length; i++){
            System.out.print(output[i] + ", ");
        }
        System.out.println("Program concluded");
    }
}
