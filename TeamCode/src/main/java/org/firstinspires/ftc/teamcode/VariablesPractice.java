package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class VariablesPractice extends OpMode {

    @Override
    public void init() {
        int teamNumber = 73200;
        double motorSpeed = 0.76;
        boolean clawClosed = true;
        String teamName = "Robotics1";
        int motorAngle = 90;

        telemetry.addData("team number", teamNumber);
        telemetry.addData("motor speeed", motorSpeed);
        telemetry.addData("claw  closed", clawClosed);
        telemetry.addData("team  name", teamName);
        telemetry.addData("motor angle", motorAngle);
    }

    @Override
    public void loop() {

    }
}
