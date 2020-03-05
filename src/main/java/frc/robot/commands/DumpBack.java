/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DumpMechanism;

public class DumpBack extends CommandBase {
  /**
   * Creates a new DumpBack.
   */
  private final DumpMechanism mDumpMechanism;
  private boolean isFinished;
  public DumpBack(DumpMechanism dumper) {
    this.mDumpMechanism = dumper;
    addRequirements(this.mDumpMechanism);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    isFinished = false;
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    Timer.delay(4);
    mDumpMechanism.spinRollersBackwards(1);
    Timer.delay(3);
    isFinished = true;
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    mDumpMechanism.spinRollersBackwards(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return isFinished;
  }
}
