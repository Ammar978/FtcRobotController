package org.firstinspires.ftc.teamcode.PracticeCode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@Disabled
@TeleOp
public class TouchSensorPractice extends OpMode {
    testBench bench = new testBench();

    @Override
    public void init() {
        bench.init(hardwareMap);
    }

    @Override
    public void loop() {
        if (bench.getTouchSensorState()) {
            telemetry.addData("touch sensor", "pressed");
        }
        else {
            telemetry.addData("touch sensor", "released");
        }
    }
}
