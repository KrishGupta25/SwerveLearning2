// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import javax.print.CancelablePrintJob;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsytem extends SubsystemBase {
  private final CANSparkMax rightMotor = new CANSparkMax(0, MotorType.kBrushless);
  private final CANSparkMax leftMotor = new CANSparkMax(0, MotorType.kBrushless);

  public IntakeSubsytem() 
  {
    rightMotor.setInverted(true);
    leftMotor.setInverted(false);

    rightMotor.restoreFactoryDefaults();
    leftMotor.restoreFactoryDefaults();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}