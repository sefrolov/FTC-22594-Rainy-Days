package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous
public class Auto extends LinearOpMode {
    DcMotor MotorRF, MotorLF, MotorRB, MotorLB;
    ElapsedTime timer = new ElapsedTime();

    public void runOpMode() {
        //servo = hardwareMap.get(Servo.class, "servo");
        MotorLB = hardwareMap.get(DcMotor.class, "motor_lb");
        MotorRB = hardwareMap.get(DcMotor.class, "motor_rb");
        MotorLF = hardwareMap.get(DcMotor.class, "motor_lf");
        MotorRF = hardwareMap.get(DcMotor.class, "motor_rf");

        MotorRB.setDirection(DcMotorSimple.Direction.REVERSE);
        MotorRF.setDirection(DcMotorSimple.Direction.REVERSE);

        MotorLB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorRB.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorLF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        MotorRF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        telemetry.addData("", "Init complited");
        telemetry.update();

        waitForStart();

        MotorLB.setPower(1);
        MotorRB.setPower(1);
        MotorLF.setPower(1);
        MotorRF.setPower(1);
        timer.reset();
        while (timer.milliseconds() < 1500 && opModeIsActive()) ;
        MotorLB.setPower(0);
        MotorRB.setPower(0);
        MotorLF.setPower(0);
        MotorRF.setPower(0);


    }
}