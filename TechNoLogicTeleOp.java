package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

/**
 * This OpMode ramps a single motor speed up and down repeatedly until Stop is pressed.
 * The code is structured as a LinearOpMode
 *
 * This code assumes a DC motor configured with the name "left_drive" as is found on a pushbot.
 *
 * INCREMENT sets how much to increase/decrease the power each cycle
 * CYCLE_MS sets the update period.
 *
 * Use Android Studio to Copy this Class, and Paste it into your team's code folder with a new name.
 * Remove or comment out the @Disabled line to add this opmode to the Driver Station OpMode list
 */
@TeleOp(name = "Concept: Ramp Motor Speed", group = "Concept")
//@Disabled
public class TechNoLogicTeleOp extends OpMode{

    // Define class members
    DcMotor leftFront;
    DcMotor leftRear;
    DcMotor rightFront;
    DcMotor rightRear;

    @Override
    public void init() {

        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        leftRear = hardwareMap.get(DcMotor.class, "leftRear");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        rightRear = hardwareMap.get(DcMotor.class, "rightRear");

        leftFront.setDirection(DcMotor.Direction.REVERSE);
        leftRear.setDirection(DcMotor.Direction.REVERSE);

        // Wait for the start button
        telemetry.addData(">", "Press Start" );
        telemetry.update();
    }

    @Override
    public void loop() {

        // Variables for joystick values
        double leftDrives = -gamepad1.left_stick_y;
        double rightDrives = -gamepad1.right_stick_y;

        // Set motor powers to joystick values
        leftFront.setPower(leftDrives);
        rightFront.setPower(rightDrives);
        leftRear.setPower(leftDrives);
        rightRear.setPower(rightDrives);

        // Telemetry output for driver assistance
        telemetry.addData(">", "Press Stop to end program." );
        telemetry.update();
    }
}

