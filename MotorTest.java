package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp (name = "Motor Test", group = "test")
public class MotorTest extends OpMode {

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
    }

    @Override
    public void loop() {

        if (gamepad1.a){
            leftFront.setPower(0.5);
        } else {
            leftFront.setPower(0.0);
        }

        if (gamepad1.b){
            leftRear.setPower(0.5);
        } else {
            leftRear.setPower(0.0);

        }
        if (gamepad1.x){
            rightFront.setPower(0.5);
        } else {
            rightFront.setPower(0.0);

        }
        if (gamepad1.y){
            rightRear.setPower(0.5);
        } else {
            rightRear.setPower(0.0);

        }

    }

}
