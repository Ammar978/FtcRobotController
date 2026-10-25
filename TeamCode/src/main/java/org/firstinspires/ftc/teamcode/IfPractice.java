package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class IfPractice extends OpMode {

    @Override
    public void init() {


    }

    @Override
    public void loop() {
        double leftY = gamepad1.left_stick_y;

        if (leftY < 0) {
            telemetry.addData("left stick", "is negative");
        }
        else if (leftY > 0) {
            telemetry.addData("left stick", "is negative");
        }
        else {
            telemetry.addData("left stick", "not in use");
        }

        telemetry.addData("left stick value", leftY);
    }
}

/*

AND = &&
OR = ||
NOT = !

 */