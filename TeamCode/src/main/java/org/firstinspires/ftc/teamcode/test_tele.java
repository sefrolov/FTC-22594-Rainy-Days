package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class test_tele extends LinearOpMode {
    DcMotor m1, m2, m3, m4;
    @Override
    public void runOpMode() throws InterruptedException {
        m1 = hardwareMap.get(DcMotor.class, "m1");
        m2 = hardwareMap.get(DcMotor.class, "m2");
        m3 = hardwareMap.get(DcMotor.class, "m3");
        m4 = hardwareMap.get(DcMotor.class, "m4");
        waitForStart();
        while(opModeIsActive()){
            m1.setPower(-gamepad1.left_stick_y);
            m2.setPower(-gamepad1.left_stick_y);
            m3.setPower(-gamepad1.left_stick_y);
            m4.setPower(-gamepad1.left_stick_y);
        }
    }
}
