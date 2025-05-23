/*    */ package ai.grazie.code.indexing.model.snapshot;
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\t\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\032\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 42\0020\001:\00234BG\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017¢\006\002\020\020B-\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r¢\006\002\020\021J\t\020\035\032\0020\005HÆ\003J\t\020\036\032\0020\007HÆ\003J\t\020\037\032\0020\tHÆ\003J\t\020 \032\0020\013HÆ\003J\026\020!\032\0020\rHÆ\003ø\001\001ø\001\000¢\006\004\b\"\020\027JE\020#\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\rHÆ\001ø\001\000¢\006\004\b$\020%J\023\020&\032\0020\0132\b\020'\032\004\030\0010\001HÖ\003J\t\020(\032\0020\003HÖ\001J\t\020)\032\0020*HÖ\001J&\020+\032\0020,2\006\020-\032\0020\0002\006\020.\032\0020/2\006\0200\032\00201HÁ\001¢\006\002\b2R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\022\020\023R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\024\020\025R\031\020\f\032\0020\rø\001\000ø\001\001¢\006\n\n\002\020\030\032\004\b\026\020\027R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\031\020\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\033\020\034\002\013\n\005\b¡\0360\001\n\002\b!¨\0065"}, d2 = {"Lai/grazie/code/indexing/model/snapshot/SnapshotMetadata;", "", "seen1", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "createdAt", "Lai/grazie/utils/mpp/time/Timestamp;", "clusters", "", "completed", "", "completionPercent", "Lkotlin/UInt;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/utils/mpp/time/Timestamp;JZLkotlin/UInt;Lkotlinx/serialization/internal/SerializationConstructorMarker;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Lai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/utils/mpp/time/Timestamp;JZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClusters", "()J", "getCompleted", "()Z", "getCompletionPercent-pVg5ArA", "()I", "I", "getCreatedAt", "()Lai/grazie/utils/mpp/time/Timestamp;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "component1", "component2", "component3", "component4", "component5", "component5-pVg5ArA", "copy", "copy-pqXDGC8", "(Lai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/utils/mpp/time/Timestamp;JZI)Lai/grazie/code/indexing/model/snapshot/SnapshotMetadata;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class SnapshotMetadata { @NotNull
/*    */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final Snapshot snapshot; @NotNull
/*    */   private final Timestamp createdAt;
/*    */   
/*  9 */   private SnapshotMetadata(Snapshot snapshot, Timestamp createdAt, long clusters, boolean completed, int completionPercent) { this.snapshot = snapshot;
/* 10 */     this.createdAt = createdAt;
/* 11 */     this.clusters = clusters;
/* 12 */     this.completed = completed;
/* 13 */     this.completionPercent = completionPercent; } private final long clusters; private final boolean completed; private final int completionPercent; private SnapshotMetadata(int seen1, Snapshot snapshot, Timestamp createdAt, long clusters, boolean completed, UInt completionPercent, SerializationConstructorMarker serializationConstructorMarker) { this.snapshot = snapshot; this.createdAt = createdAt; this.clusters = clusters; this.completed = completed; this.completionPercent = completionPercent.unbox-impl(); } public final int getCompletionPercent-pVg5ArA() { return this.completionPercent; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/snapshot/SnapshotMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/snapshot/SnapshotMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"})
/*    */   public static final class $serializer implements GeneratedSerializer<SnapshotMetadata> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */       arrayOfKSerializer[0] = (KSerializer)Snapshot.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)LongSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer[4] = (KSerializer)UIntSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SnapshotMetadata deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Snapshot snapshot = null;
/*    */       Timestamp timestamp = null;
/*    */       long l = 0L;
/*    */       boolean bool1 = false;
/*    */       UInt uInt = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot.$serializer.INSTANCE, snapshot);
/*    */         i |= 0x1;
/*    */         timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */         i |= 0x2;
/*    */         l = compositeDecoder.decodeLongElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         uInt = (UInt)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)UIntSerializer.INSTANCE, uInt);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot.$serializer.INSTANCE, snapshot);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               l = compositeDecoder.decodeLongElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               uInt = (UInt)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)UIntSerializer.INSTANCE, uInt);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new SnapshotMetadata(i, snapshot, timestamp, l, bool1, uInt, null, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull SnapshotMetadata value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       SnapshotMetadata.write$Self$model_indexing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.snapshot.SnapshotMetadata", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("createdAt", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("clusters", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("completed", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("completionPercent", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/snapshot/SnapshotMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/snapshot/SnapshotMetadata;", "model-indexing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SnapshotMetadata> serializer() {
/*    */       return (KSerializer<SnapshotMetadata>)SnapshotMetadata.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot getSnapshot() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp getCreatedAt() {
/*    */     return this.createdAt;
/*    */   }
/*    */   
/*    */   public final long getClusters() {
/*    */     return this.clusters;
/*    */   }
/*    */   
/*    */   public final boolean getCompleted() {
/*    */     return this.completed;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Snapshot component1() {
/*    */     return this.snapshot;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component2() {
/*    */     return this.createdAt;
/*    */   }
/*    */   
/*    */   public final long component3() {
/*    */     return this.clusters;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.completed;
/*    */   }
/*    */   
/*    */   public final int component5-pVg5ArA() {
/*    */     return this.completionPercent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SnapshotMetadata copy-pqXDGC8(@NotNull Snapshot snapshot, @NotNull Timestamp createdAt, long clusters, boolean completed, int completionPercent) {
/*    */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*    */     Intrinsics.checkNotNullParameter(createdAt, "createdAt");
/*    */     return new SnapshotMetadata(snapshot, createdAt, clusters, completed, completionPercent, null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SnapshotMetadata(snapshot=" + this.snapshot + ", createdAt=" + this.createdAt + ", clusters=" + this.clusters + ", completed=" + this.completed + ", completionPercent=" + UInt.toString-impl(this.completionPercent) + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.snapshot.hashCode();
/*    */     result = result * 31 + this.createdAt.hashCode();
/*    */     result = result * 31 + Long.hashCode(this.clusters);
/*    */     result = result * 31 + Boolean.hashCode(this.completed);
/*    */     return result * 31 + UInt.hashCode-impl(this.completionPercent);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof SnapshotMetadata))
/*    */       return false; 
/*    */     SnapshotMetadata snapshotMetadata = (SnapshotMetadata)other;
/*    */     return !Intrinsics.areEqual(this.snapshot, snapshotMetadata.snapshot) ? false : (!Intrinsics.areEqual(this.createdAt, snapshotMetadata.createdAt) ? false : ((this.clusters != snapshotMetadata.clusters) ? false : ((this.completed != snapshotMetadata.completed) ? false : (!(this.completionPercent != snapshotMetadata.completionPercent)))));
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\snapshot\SnapshotMetadata.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */