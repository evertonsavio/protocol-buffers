// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credentials.proto

package dev.evertonsavio.protobuf.models;

public interface CredentialsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Credentials)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   */
  boolean hasEmailMode();
  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   */
  dev.evertonsavio.protobuf.models.EmailCredentials getEmailMode();
  /**
   * <code>.EmailCredentials emailMode = 1;</code>
   */
  dev.evertonsavio.protobuf.models.EmailCredentialsOrBuilder getEmailModeOrBuilder();

  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   */
  boolean hasPhoneMode();
  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   */
  dev.evertonsavio.protobuf.models.PhoneOTP getPhoneMode();
  /**
   * <code>.PhoneOTP phoneMode = 2;</code>
   */
  dev.evertonsavio.protobuf.models.PhoneOTPOrBuilder getPhoneModeOrBuilder();

  public dev.evertonsavio.protobuf.models.Credentials.ModeCase getModeCase();
}
