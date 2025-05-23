/*    */ package ai.grazie.code.indexing.model.snapshot;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\030\002\n\002\b\025\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 -2\0020\001:\002,-BE\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n\022\006\020\013\032\0020\003\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B-\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n\022\006\020\013\032\0020\003¢\006\002\020\017J\t\020\031\032\0020\005HÆ\003J\t\020\032\032\0020\007HÆ\003J\t\020\033\032\0020\003HÆ\003J\t\020\034\032\0020\nHÆ\003J\t\020\035\032\0020\003HÆ\003J;\020\036\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\n2\b\b\002\020\013\032\0020\003HÆ\001J\023\020\037\032\0020\n2\b\020 \032\004\030\0010\001HÖ\003J\t\020!\032\0020\003HÖ\001J\t\020\"\032\0020#HÖ\001J&\020$\032\0020%2\006\020&\032\0020\0002\006\020'\032\0020(2\006\020)\032\0020*HÁ\001¢\006\002\b+R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\020\020\021R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\022\020\023R\021\020\013\032\0020\003¢\006\b\n\000\032\004\b\024\020\021R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\025\020\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\027\020\030¨\006."}, d2 = {"Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;", "", "seen1", "", "snapshot", "Lai/grazie/code/indexing/model/snapshot/Snapshot;", "createdAt", "Lai/grazie/utils/mpp/time/Timestamp;", "clusters", "completed", "", "completionPercent", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/utils/mpp/time/Timestamp;IZILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/code/indexing/model/snapshot/Snapshot;Lai/grazie/utils/mpp/time/Timestamp;IZI)V", "getClusters", "()I", "getCompleted", "()Z", "getCompletionPercent", "getCreatedAt", "()Lai/grazie/utils/mpp/time/Timestamp;", "getSnapshot", "()Lai/grazie/code/indexing/model/snapshot/Snapshot;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_indexing", "$serializer", "Companion", "model-indexing"})
/*    */ public final class JSSnapshotMetadata {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Snapshot snapshot;
/*    */   @NotNull
/*    */   private final Timestamp createdAt;
/*    */   
/* 19 */   public JSSnapshotMetadata(@NotNull Snapshot snapshot, @NotNull Timestamp createdAt, int clusters, boolean completed, int completionPercent) { this.snapshot = snapshot;
/* 20 */     this.createdAt = createdAt;
/* 21 */     this.clusters = clusters;
/* 22 */     this.completed = completed;
/* 23 */     this.completionPercent = completionPercent; } private final int clusters; private final boolean completed; private final int completionPercent; public final int getCompletionPercent() { return this.completionPercent; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-indexing"})
/*    */   public static final class $serializer implements GeneratedSerializer<JSSnapshotMetadata> {
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
/*    */       arrayOfKSerializer[2] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer[4] = (KSerializer)IntSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public JSSnapshotMetadata deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Snapshot snapshot = null;
/*    */       Timestamp timestamp = null;
/*    */       int j = 0;
/*    */       boolean bool1 = false;
/*    */       int k = 0;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         snapshot = (Snapshot)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Snapshot.$serializer.INSTANCE, snapshot);
/*    */         i |= 0x1;
/*    */         timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */         i |= 0x2;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         k = compositeDecoder.decodeIntElement(serialDescriptor, 4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int m = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (m) {
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
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               k = compositeDecoder.decodeIntElement(serialDescriptor, 4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(m);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new JSSnapshotMetadata(i, snapshot, timestamp, j, bool1, k, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull JSSnapshotMetadata value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       JSSnapshotMetadata.write$Self$model_indexing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.code.indexing.model.snapshot.JSSnapshotMetadata", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("snapshot", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("createdAt", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("clusters", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("completed", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("completionPercent", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/code/indexing/model/snapshot/JSSnapshotMetadata;", "model-indexing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<JSSnapshotMetadata> serializer() {
/*    */       return (KSerializer<JSSnapshotMetadata>)JSSnapshotMetadata.$serializer.INSTANCE;
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
/*    */   public final int getClusters() {
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
/*    */   public final int component3() {
/*    */     return this.clusters;
/*    */   }
/*    */   
/*    */   public final boolean component4() {
/*    */     return this.completed;
/*    */   }
/*    */   
/*    */   public final int component5() {
/*    */     return this.completionPercent;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JSSnapshotMetadata copy(@NotNull Snapshot snapshot, @NotNull Timestamp createdAt, int clusters, boolean completed, int completionPercent) {
/*    */     Intrinsics.checkNotNullParameter(snapshot, "snapshot");
/*    */     Intrinsics.checkNotNullParameter(createdAt, "createdAt");
/*    */     return new JSSnapshotMetadata(snapshot, createdAt, clusters, completed, completionPercent);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "JSSnapshotMetadata(snapshot=" + this.snapshot + ", createdAt=" + this.createdAt + ", clusters=" + this.clusters + ", completed=" + this.completed + ", completionPercent=" + this.completionPercent + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.snapshot.hashCode();
/*    */     result = result * 31 + this.createdAt.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.clusters);
/*    */     result = result * 31 + Boolean.hashCode(this.completed);
/*    */     return result * 31 + Integer.hashCode(this.completionPercent);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof JSSnapshotMetadata))
/*    */       return false; 
/*    */     JSSnapshotMetadata jSSnapshotMetadata = (JSSnapshotMetadata)other;
/*    */     return !Intrinsics.areEqual(this.snapshot, jSSnapshotMetadata.snapshot) ? false : (!Intrinsics.areEqual(this.createdAt, jSSnapshotMetadata.createdAt) ? false : ((this.clusters != jSSnapshotMetadata.clusters) ? false : ((this.completed != jSSnapshotMetadata.completed) ? false : (!(this.completionPercent != jSSnapshotMetadata.completionPercent)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-indexing-jvm-0.4.32.jar!\ai\grazie\code\indexing\model\snapshot\JSSnapshotMetadata.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */