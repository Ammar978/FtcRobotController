package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
@TeleOp
public class GamePadPractice extends OpMode {

    @Override
    public void init() {

    }

    @Override
    public void loop() {
        double speedForward = -gamepad1.left_stick_y/2.0;
        double differenceInX = gamepad1.left_stick_x - gamepad1.right_stick_x;
        double sumTriggers = gamepad1.right_trigger + gamepad1.left_trigger;

        telemetry.addData("left stick x", gamepad1.left_stick_x);
        telemetry.addData("left stick y", speedForward);
        telemetry.addData("right stick x", gamepad1.right_stick_x);
        telemetry.addData("right stick y", gamepad1.right_stick_y);

        telemetry.addData("a", gamepad1.a);
        telemetry.addData("b", gamepad1.b);

        telemetry.addData("difference in X", differenceInX);
        telemetry.addData("Sum of triggers", sumTriggers);
    }
}
