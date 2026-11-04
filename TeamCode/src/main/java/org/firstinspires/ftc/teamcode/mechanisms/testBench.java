package org.firstinspires.ftc.teamcode.mechanisms;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.gamepad1;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;
@Disabled
public class testBench  {

    //Touch Sensor
    private DigitalChannel touchSensor;

    public boolean getTouchSensorState() {
        return !touchSensor.getState();
    }

    public boolean isTouchSensorReleased() {
        return touchSensor.getState();
    }

    //DC Motor
    private DcMotor motor;
    private double ticksPerRev;

    public void setMotorSpeed(double speed) {
        //accepts 1.0 to -1.0
        motor.setPower(speed);
    }

    public double getTicksPerRev() {
        return motor.getCurrentPosition() / ticksPerRev;
    }

    public void motorBrakeBehaviour() {
        if (gamepad1.a) {
            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        else if (gamepad1.b) {
            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        }
    }



    //init statement
    public void init(HardwareMap hwMap) {

        //Touch sensor
        touchSensor = hwMap.get(DigitalChannel.class, "touch_sensor");
        touchSensor.setMode(DigitalChannel.Mode.INPUT);

        //DC Motor
        motor = hwMap.get(DcMotor.class, "motor");
        motor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        ticksPerRev = motor.getMotorType().getTicksPerRev();
    }
}