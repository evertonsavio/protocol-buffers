// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: credentials.proto

package dev.evertonsavio.protobuf.models;

public final class CredentialsOuterClass {
  private CredentialsOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EmailCredentials_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EmailCredentials_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PhoneOTP_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PhoneOTP_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Credentials_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Credentials_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021credentials.proto\"3\n\020EmailCredentials\022" +
      "\r\n\005email\030\001 \001(\t\022\020\n\010password\030\002 \001(\t\"(\n\010Phon" +
      "eOTP\022\016\n\006number\030\001 \001(\005\022\014\n\004code\030\002 \001(\005\"]\n\013Cr" +
      "edentials\022&\n\temailMode\030\001 \001(\0132\021.EmailCred" +
      "entialsH\000\022\036\n\tphoneMode\030\002 \001(\0132\t.PhoneOTPH" +
      "\000B\006\n\004modeB$\n dev.evertonsavio.protobuf.m" +
      "odelsP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_EmailCredentials_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EmailCredentials_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EmailCredentials_descriptor,
        new java.lang.String[] { "Email", "Password", });
    internal_static_PhoneOTP_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_PhoneOTP_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PhoneOTP_descriptor,
        new java.lang.String[] { "Number", "Code", });
    internal_static_Credentials_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_Credentials_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Credentials_descriptor,
        new java.lang.String[] { "EmailMode", "PhoneMode", "Mode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
