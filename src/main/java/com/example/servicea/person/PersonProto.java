// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.example.servicea.person;

public final class PersonProto {
  private PersonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_person_PersonRequestId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_person_PersonRequestId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_person_PersonRequestCarId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_person_PersonRequestCarId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_person_PersonReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_person_PersonReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014person.proto\022\006person\"\035\n\017PersonRequestI" +
      "d\022\n\n\002id\030\001 \001(\t\"#\n\022PersonRequestCarId\022\r\n\005c" +
      "arId\030\001 \001(\t\"G\n\013PersonReply\022\n\n\002id\030\001 \001(\t\022\014\n" +
      "\004name\030\002 \001(\t\022\017\n\007surname\030\003 \001(\t\022\r\n\005carId\030\004 " +
      "\001(\t2\222\001\n\006Person\022?\n\rGetPersonById\022\027.person" +
      ".PersonRequestId\032\023.person.PersonReply\"\000\022" +
      "G\n\020GetPersonByCarId\022\032.person.PersonReque" +
      "stCarId\032\023.person.PersonReply\"\0000\001B2\n\033com." +
      "example.servicea.personB\013PersonProtoP\001\242\002" +
      "\003RTGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_person_PersonRequestId_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_person_PersonRequestId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_person_PersonRequestId_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_person_PersonRequestCarId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_person_PersonRequestCarId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_person_PersonRequestCarId_descriptor,
        new java.lang.String[] { "CarId", });
    internal_static_person_PersonReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_person_PersonReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_person_PersonReply_descriptor,
        new java.lang.String[] { "Id", "Name", "Surname", "CarId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
