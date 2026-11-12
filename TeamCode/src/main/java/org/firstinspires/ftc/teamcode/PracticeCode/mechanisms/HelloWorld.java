package org.firstinspires.ftc.teamcode.PracticeCode.mechanisms;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@Disabled
@Autonomous
public class HelloWorld extends OpMode {

    @Override
    public void init() {
        telemetry.addData("Hello","Ammar ");
    }

    @Override
    public void loop() {
    }
    /*
    this code is to output hello world on the robot programming test bench
     */
}
