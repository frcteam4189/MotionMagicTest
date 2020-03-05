/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DumpMechanism;

public class SpinRollers extends CommandBase {
  /**
   * Creates a new SpinRollers.
   */
  private final DumpMechanism mDumpMechanism;
  public SpinRollers(DumpMechanism dumper) {
    this.mDumpMechanism = dumper;
    addRequirements(this.mDumpMechanism);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    mDumpMechanism.spinRollersForwards(1);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    //double leftTrigger = mDriveController.getRawAxis(2);
    //if(leftTrigger <= .1) mDumpMechanism.spinRollersForwards(0);
    //mDumpMechanism.spinRollersForwards(leftTrigger);
    //double rightTrigger = mDriveController.getRawAxis(3);
    //if(rightTrigger <= .1) mDumpMechanism.spinRollersForwards(0);
    //mDumpMechanism.spinRollersBackwards(rightTrigger);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mDumpMechanism.spinRollersForwards(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
