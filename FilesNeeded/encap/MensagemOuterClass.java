// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mensagem.proto

package encap;

public final class MensagemOuterClass {
  private MensagemOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MensagemOrBuilder extends
      // @@protoc_insertion_point(interface_extends:encap.Mensagem)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required string conteudo = 1;</code>
     * @return Whether the conteudo field is set.
     */
    boolean hasConteudo();
    /**
     * <code>required string conteudo = 1;</code>
     * @return The conteudo.
     */
    java.lang.String getConteudo();
    /**
     * <code>required string conteudo = 1;</code>
     * @return The bytes for conteudo.
     */
    com.google.protobuf.ByteString
        getConteudoBytes();

    /**
     * <code>optional int32 id = 2;</code>
     * @return Whether the id field is set.
     */
    boolean hasId();
    /**
     * <code>optional int32 id = 2;</code>
     * @return The id.
     */
    int getId();
  }
  /**
   * Protobuf type {@code encap.Mensagem}
   */
  public static final class Mensagem extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:encap.Mensagem)
      MensagemOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Mensagem.newBuilder() to construct.
    private Mensagem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Mensagem() {
      conteudo_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Mensagem();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Mensagem(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              conteudo_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              id_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return encap.MensagemOuterClass.internal_static_encap_Mensagem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return encap.MensagemOuterClass.internal_static_encap_Mensagem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              encap.MensagemOuterClass.Mensagem.class, encap.MensagemOuterClass.Mensagem.Builder.class);
    }

    private int bitField0_;
    public static final int CONTEUDO_FIELD_NUMBER = 1;
    private volatile java.lang.Object conteudo_;
    /**
     * <code>required string conteudo = 1;</code>
     * @return Whether the conteudo field is set.
     */
    @java.lang.Override
    public boolean hasConteudo() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string conteudo = 1;</code>
     * @return The conteudo.
     */
    @java.lang.Override
    public java.lang.String getConteudo() {
      java.lang.Object ref = conteudo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          conteudo_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string conteudo = 1;</code>
     * @return The bytes for conteudo.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getConteudoBytes() {
      java.lang.Object ref = conteudo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        conteudo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ID_FIELD_NUMBER = 2;
    private int id_;
    /**
     * <code>optional int32 id = 2;</code>
     * @return Whether the id field is set.
     */
    @java.lang.Override
    public boolean hasId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasConteudo()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, conteudo_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeInt32(2, id_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, conteudo_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, id_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof encap.MensagemOuterClass.Mensagem)) {
        return super.equals(obj);
      }
      encap.MensagemOuterClass.Mensagem other = (encap.MensagemOuterClass.Mensagem) obj;

      if (hasConteudo() != other.hasConteudo()) return false;
      if (hasConteudo()) {
        if (!getConteudo()
            .equals(other.getConteudo())) return false;
      }
      if (hasId() != other.hasId()) return false;
      if (hasId()) {
        if (getId()
            != other.getId()) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasConteudo()) {
        hash = (37 * hash) + CONTEUDO_FIELD_NUMBER;
        hash = (53 * hash) + getConteudo().hashCode();
      }
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static encap.MensagemOuterClass.Mensagem parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static encap.MensagemOuterClass.Mensagem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static encap.MensagemOuterClass.Mensagem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static encap.MensagemOuterClass.Mensagem parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(encap.MensagemOuterClass.Mensagem prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code encap.Mensagem}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:encap.Mensagem)
        encap.MensagemOuterClass.MensagemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return encap.MensagemOuterClass.internal_static_encap_Mensagem_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return encap.MensagemOuterClass.internal_static_encap_Mensagem_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                encap.MensagemOuterClass.Mensagem.class, encap.MensagemOuterClass.Mensagem.Builder.class);
      }

      // Construct using encap.MensagemOuterClass.Mensagem.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        conteudo_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return encap.MensagemOuterClass.internal_static_encap_Mensagem_descriptor;
      }

      @java.lang.Override
      public encap.MensagemOuterClass.Mensagem getDefaultInstanceForType() {
        return encap.MensagemOuterClass.Mensagem.getDefaultInstance();
      }

      @java.lang.Override
      public encap.MensagemOuterClass.Mensagem build() {
        encap.MensagemOuterClass.Mensagem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public encap.MensagemOuterClass.Mensagem buildPartial() {
        encap.MensagemOuterClass.Mensagem result = new encap.MensagemOuterClass.Mensagem(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          to_bitField0_ |= 0x00000001;
        }
        result.conteudo_ = conteudo_;
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof encap.MensagemOuterClass.Mensagem) {
          return mergeFrom((encap.MensagemOuterClass.Mensagem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(encap.MensagemOuterClass.Mensagem other) {
        if (other == encap.MensagemOuterClass.Mensagem.getDefaultInstance()) return this;
        if (other.hasConteudo()) {
          bitField0_ |= 0x00000001;
          conteudo_ = other.conteudo_;
          onChanged();
        }
        if (other.hasId()) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasConteudo()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        encap.MensagemOuterClass.Mensagem parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (encap.MensagemOuterClass.Mensagem) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object conteudo_ = "";
      /**
       * <code>required string conteudo = 1;</code>
       * @return Whether the conteudo field is set.
       */
      public boolean hasConteudo() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>required string conteudo = 1;</code>
       * @return The conteudo.
       */
      public java.lang.String getConteudo() {
        java.lang.Object ref = conteudo_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            conteudo_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string conteudo = 1;</code>
       * @return The bytes for conteudo.
       */
      public com.google.protobuf.ByteString
          getConteudoBytes() {
        java.lang.Object ref = conteudo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          conteudo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string conteudo = 1;</code>
       * @param value The conteudo to set.
       * @return This builder for chaining.
       */
      public Builder setConteudo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        conteudo_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string conteudo = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearConteudo() {
        bitField0_ = (bitField0_ & ~0x00000001);
        conteudo_ = getDefaultInstance().getConteudo();
        onChanged();
        return this;
      }
      /**
       * <code>required string conteudo = 1;</code>
       * @param value The bytes for conteudo to set.
       * @return This builder for chaining.
       */
      public Builder setConteudoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        conteudo_ = value;
        onChanged();
        return this;
      }

      private int id_ ;
      /**
       * <code>optional int32 id = 2;</code>
       * @return Whether the id field is set.
       */
      @java.lang.Override
      public boolean hasId() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional int32 id = 2;</code>
       * @return The id.
       */
      @java.lang.Override
      public int getId() {
        return id_;
      }
      /**
       * <code>optional int32 id = 2;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(int value) {
        bitField0_ |= 0x00000002;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:encap.Mensagem)
    }

    // @@protoc_insertion_point(class_scope:encap.Mensagem)
    private static final encap.MensagemOuterClass.Mensagem DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new encap.MensagemOuterClass.Mensagem();
    }

    public static encap.MensagemOuterClass.Mensagem getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<Mensagem>
        PARSER = new com.google.protobuf.AbstractParser<Mensagem>() {
      @java.lang.Override
      public Mensagem parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Mensagem(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Mensagem> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Mensagem> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public encap.MensagemOuterClass.Mensagem getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_encap_Mensagem_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_encap_Mensagem_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016mensagem.proto\022\005encap\"(\n\010Mensagem\022\020\n\010c" +
      "onteudo\030\001 \002(\t\022\n\n\002id\030\002 \001(\005"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_encap_Mensagem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_encap_Mensagem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_encap_Mensagem_descriptor,
        new java.lang.String[] { "Conteudo", "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
