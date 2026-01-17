/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchtrigonometrylab;
import java.util.Scanner;
import static java.lang.Math.*;

/**
 *
 * @author SHANE
 */
public class SwitchtrigonometryLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */



        Scanner input = new Scanner(System.in);
        System.out.println("--- Trigonometric Function Calculator ---");
        // No. 1 problem Solve
        System.out.println("Hello User!!");
        System.out.println("Provide an Angle in Degree");
        System.out.print("Input Here: ");
        int A = input.nextInt();
        System.out.println("Choose the following Function you want to choose");
        System.out.println(" 1:Sine\n 2:cosine\n 3:tangent\n 4:all Three of them");
        System.out.print("Input Here: ");
        int B = input.nextInt();

        // CHANGED: Converted if-statements to switch(B)
        switch (B) {
            case 1:
                System.out.println("Welcome to the Sine function");
                double C_sin = sin(toRadians(A));
                System.out.println("The sine is: " + C_sin);
                break;
            case 2:
                System.out.println("Welcome to the cosine function");
                double D = cos(toRadians(A));
                System.out.println("The cosine is: " + D);
                break;
            case 3:
                System.out.println("welcome User to the tangent function");
                if (A == 270 || A == 90) {
                    A++;
                    double E = tan(toRadians(A));
                    System.out.println("WARNING: \nthe Data provided is invalid, the data has been updated with +1°");
                    System.out.println("The tangent is: " + E);
                } else {
                    double E = tan(toRadians(A));
                    System.out.println("The tangent is: " + E);
                }
                break;
            case 4:
                System.out.println("Isuuga Bataa oi competitive dili pa pildi!!");
                double F = sin(toRadians(A));
                System.out.println("The sine is: " + F);
                System.out.println(" ");
                double G = cos(toRadians(A));
                System.out.println("The cosine is: " + G);
                System.out.println(" ");
                if (A == 90 || A == 270) {
                    A++;
                    System.out.println("WARNING: \nthe Data provided is invalid, the data has been updated with +1°");
                    double E = tan(toRadians(A));
                    System.out.println("The tangent is: " + E);
                } else {
                    double E = tan(toRadians(A));
                    System.out.println("The tangent is: " + E);
                    System.out.println(" ");
                }
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }

        System.out.println("\n--- Angle Quadrant Detector ---");
        // NO. 2 Problem Solved
        // NOTE: Switch is not possible here because this logic relies on ranges (Greater than/Less than).
        System.out.println("welcome User!\ninput an angle in degree (0-360)");
        System.out.print("Type Here: ");
        int H = input.nextInt();
        H = (H % 360 + 360) % 360;
        H = abs(H);
        double I = toRadians(H);
        double J = sin(I);
        double K = cos(I);
        double L = tan(I);
        
        if (H == 0 || H == 360) {
            System.out.println("the angle is positive at x-axis and sin: " + J + " cos: " + K + " tan:" + L);
        } else if (H > 0 && H < 90) {
            System.out.println("the Degree is within the 1st Quadrant and sin: " + J + " cos: " + K + " tan:" + L);
        } else if (H == 90) {
            System.out.println("the angle is positive at y-axis and sin: " + J + " cos: 0.0 tan: Undefined");
        } else if (H > 90 && H < 180) {
            System.out.println("the Degree is within the 2nd Quadrant and sin: " + J + " cos: " + K + " tan:" + L);
        } else if (H == 180) {
            System.out.println("the angle is negative at x-axis and sin: 0.0 cos: " + K + " tan: 0.0");
        } else if (H > 180 && H < 270) {
            System.out.println("the Degree is within the 3rd Quadrant and sin: " + J + " cos: " + K + " tan:" + L);
        } else if (H == 270) {
            System.out.println("the angle is negative at y-axis and sin: " + J + " cos: 0.0 tan: Undefined");
        } else if (H > 270 && H < 360) {
            System.out.println("the Degree is within the 4th Quadrant and sin: " + J + " cos: " + K + " tan:" + L);
        }

        System.out.println("\n--- Right Triangle Solver ---");
        // NO. 3 PROBLEM SOLVED
        System.out.println("welcome user!!, and lets solved the Right triagle");
        System.out.println("Now, first question\n 1. is problem concises of two sides?\n 2. or one side and one angle? (1/2)");
        System.out.print("type here: ");
        int a = input.nextInt();

        // CHANGED: Converted outer if(a==1)/if(a==2) to switch(a)
        switch (a) {
            case 1:
                System.out.println("two sides?, interesting....");
                System.out.println("Second Question, what side is not present?\n 1. Opposite\n 2. Adjacent\n 3. Hypotenuse ");
                System.out.print("Input here: ");
                int b = input.nextInt();
                
                // CHANGED: Converted inner if(b==1)... to switch(b)
                switch (b) {
                    case 1:
                        System.out.println("ok, Now please incode the Adjacent and Hypotenuse");
                        System.out.print("Input the size of Hypotenuse here: ");
                        double c = input.nextDouble();
                        System.out.print("Input the size of Adjacent here: ");
                        double d = input.nextDouble();
                        double e = sqrt(pow(c, 2) - pow(d, 2));
                        double h = 90;
                        double f = toDegrees(acos(d / c));
                        double g = (h - f);
                        System.out.println("Opposite is " + e + "\nAdjacent is " + d + "\nHypotenuse is " + c);
                        System.out.println("Angle A is " + f + "\nAngle B is " + g + "\nAngle C is " + h);
                        break;
                    case 2:
                        System.out.println("ok, Now please incode the size of Opposite and Hypotenuse");
                        System.out.print("Input the size of Hypotenuse here: ");
                        double C_hyp = input.nextDouble();
                        System.out.print("Input the size of Opposite here: ");
                        double D = input.nextDouble();
                        double E = sqrt(pow(C_hyp, 2) - pow(D, 2));
                        double h2 = 90;
                        double F = toDegrees(asin(D / C_hyp));
                        double G = (h2 - F);
                        System.out.println("Oposite is " + D + "\nAdjacent is " + E + "\nHypotenuse is " + C_hyp);
                        System.out.println("Angle A is " + F + "\nAngle B is " + G + "\nAngle C is " + h2);
                        break;
                    case 3:
                        System.out.println("ok, Now please incode the size of Opposite and Adjacent");
                        System.out.print("Input the size of Opposite here: ");
                        double C_opp = input.nextDouble();
                        System.out.print("Input the size of Adjacent here: ");
                        double D_adj = input.nextDouble();
                        double E_hyp = sqrt(pow(C_opp, 2) + pow(D_adj, 2));
                        double h3 = 90;
                        double F_ang = toDegrees(atan(D_adj / C_opp));
                        double G_ang = (h3 - F_ang);
                        System.out.println("Oposite is " + C_opp + "\nAdjacent is " + D_adj + "\nHypotenuse is " + E_hyp);
                        System.out.println("Angle A is " + F_ang + "\nAngle B is " + G_ang + "\nAngle C is " + h3);
                        break;
                }
                break; // Break for case 1 of outer switch

            case 2:
                System.out.println("one side and one angle?, hmm...");
                System.out.println("ok, now to the second question.\n what side is present in the problem?\n 1. Opposite\n 2. Adjacent\n 3. Hypotenuse ");
                short C = input.nextShort();
                
                // CHANGED: Converted inner if(C==1)... to switch(C)
                switch (C) {
                    case 1:
                        System.out.println("ok, now incode side of the Opposite and the Angle present(pls, not the 90 degree)");
                        System.out.print("Input the size of Opposite here: ");
                        double D = input.nextDouble();
                        System.out.print("Input the angle here: ");
                        double E = input.nextDouble();
                        double Fdegree = 90;
                        double F = 180 - Fdegree - E;
                        double G = D / sin(toRadians(E));
                        double h = sqrt(pow(G, 2) - pow(D, 2));
                        System.out.println("Oposite is " + D + "\nAdjacent is " + h + "\nHypotenuse is " + G);
                        System.out.println("Angle A is " + E + "\nAngle B is " + F + "\nAngle C is " + Fdegree);
                        break;
                    case 2:
                        System.out.println("ok, now incode side of the Adjacent and the Angle present(pls, not the 90 degree)");
                        System.out.print("Input the size of Adjacent here: ");
                        double D2 = input.nextDouble();
                        System.out.print("Input the angle here: ");
                        double E2 = input.nextDouble();
                        double Fdegree2 = 90;
                        double F2 = 180 - Fdegree2 - E2;
                        double G2 = D2 / cos(toRadians(E2));
                        double h2 = sqrt(pow(G2, 2) - pow(D2, 2));
                        System.out.println("Oposite is " + h2 + "\nAdjacent is " + D2 + "\nHypotenuse is " + G2);
                        System.out.println("Angle A is " + E2 + "\nAngle B is " + F2 + "\nAngle C is " + Fdegree2);
                        break;
                    case 3:
                        System.out.println("ok, now incode side of the Hypotenuse and the Angle present(pls, not the 90 degree)");
                        System.out.print("Input the size of Hypotenuse here: ");
                        double D3 = input.nextDouble();
                        System.out.print("Input the angle here: ");
                        double E3 = input.nextDouble();
                        double Fdegree3 = 90;
                        double F3 = 180 - Fdegree3 - E3;
                        double G3 = D3 * sin(toRadians(E3));
                        double h3 = sqrt(pow(D3, 2) - pow(G3, 2));
                        System.out.println("Oposite is " + G3 + "\nAdjacent is " + h3 + "\nHypotenuse is " + D3);
                        System.out.println("Angle A is " + E3 + "\nAngle B is " + F3 + "Angle C is " + Fdegree3);
                        break;
                }
                break; // Break for case 2 of outer switch
        }

        System.out.println("\n--- Trigonometric Identity Verifier ---");
        // problme 4 solved
        // NOTE: Switch not possible here (Floating point epsilon comparisons)
        System.out.print("Enter angle in degrees: ");
        double degrees = input.nextDouble();
        double x = toRadians(degrees);
        double epsilon = 1e-9;
        System.out.println("\nAnalyzing for angle: " + degrees + " degrees (" + String.format("%.4f", x) + " rad)");
        System.out.println("\n1. Verifying: sin^2(θ) + cos^2(θ) = 1");
        double sinVal = sin(x);
        double cosVal = cos(x);
        double r = (sinVal * sinVal) + (cosVal * cosVal);
        double R = 1.0;
        System.out.println("   LHS: " + r);
        System.out.println("   RHS: " + R);
        if (abs(r - R) < epsilon) {
            System.out.println("   Result: VERIFIED (True)");
        } else {
            System.out.println("   Result: FALSE (Difference: " + (r - R) + ")");
        }
        System.out.println("\n2. Verifying: 1 + tan^2(θ) = sec^2(θ)");
        if (abs(cosVal) < epsilon) {
            System.out.println("   Skipped: Identity undefined at 90, 270, etc. (Division by zero)");
        } else {
            double tanVal = tan(x);
            double secVal = 1.0 / cosVal;

            double r2 = 1 + (tanVal * tanVal);
            double R2 = (secVal * secVal);

            System.out.println("   LHS: " + r2);
            System.out.println("   RHS: " + R2);

            if (abs(r2 - R2) < epsilon) {
                System.out.println("   Result: VERIFIED (True)");
            } else {
                System.out.println("   Result: FALSE (Difference: " + (r2 - R2) + ")");
            }
        }
        System.out.println("\n--- Waves Properties Analyzer ---");
        // No. 5 Problem Solved
        // NOTE: Switch not possible here (Floating point comparisons)
        System.out.println("Welcome User, Now we will be solving sinusoids property\nenter the following data asks");
        System.out.println("ok, now incode the following data");
        System.out.print("Amplitude: ");
        double l = input.nextDouble();
        System.out.print("Freqency: ");
        double m = input.nextDouble();
        System.out.print("Phase Shitf of a wave: ");
        double n = input.nextDouble();
        System.out.print("Time Value: ");
        double o = input.nextDouble();
        if (m == 0) {
            System.out.println("Wave is constant.");
        } else {
            // 3. Calculate Instantaneous Value
            // y = A * sin(2 * pi * f * t + phi)
            double omega = 2 * PI * m; // Angular frequency
            double currentValue = l * sin(omega * o + n);
            System.out.println("Value at time " + o + " is: " + currentValue);
            double epsilon2 = 0.0001;
            if (abs(currentValue - l) < epsilon2) {
                System.out.println("State: At a Peak");
            } else if (abs(currentValue + l) < epsilon2) {
                System.out.println("State: At a Trough");
            } else if (abs(currentValue) < epsilon2) {
                System.out.println("State: Zero-Crossing");
            } else {
                System.out.println("State: In between peak and trough");
            }
            double period = 1.0 / m;
            double nextPeakTime = (PI / 2 - n) / omega;
            while (nextPeakTime <= o) {
                nextPeakTime = nextPeakTime + period;
            }
            System.out.println("Next peak will occur at: " + nextPeakTime);
        }

    }

}
    
    
