/*    */ package ai.grazie.model.task.library.v2.vcs;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\013\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\005HÆ\003J\t\020\022\032\0020\005HÆ\003J'\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\005HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\rR\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\017\020\r¨\006$"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/MergeConflictRanges;", "", "seen1", "", "leftRange", "Lai/grazie/model/task/library/v2/vcs/MergeConflictRange;", "rightRange", "baseRange", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/task/library/v2/vcs/MergeConflictRange;Lai/grazie/model/task/library/v2/vcs/MergeConflictRange;Lai/grazie/model/task/library/v2/vcs/MergeConflictRange;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/task/library/v2/vcs/MergeConflictRange;Lai/grazie/model/task/library/v2/vcs/MergeConflictRange;Lai/grazie/model/task/library/v2/vcs/MergeConflictRange;)V", "getBaseRange", "()Lai/grazie/model/task/library/v2/vcs/MergeConflictRange;", "getLeftRange", "getRightRange", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Companion", "model-task"})
/*    */ public final class MergeConflictRanges {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final MergeConflictRange leftRange;
/*    */   
/* 24 */   public MergeConflictRanges(@NotNull MergeConflictRange leftRange, @NotNull MergeConflictRange rightRange, @NotNull MergeConflictRange baseRange) { this.leftRange = leftRange;
/* 25 */     this.rightRange = rightRange;
/* 26 */     this.baseRange = baseRange; } @NotNull private final MergeConflictRange rightRange; @NotNull private final MergeConflictRange baseRange; @NotNull public final MergeConflictRange getBaseRange() { return this.baseRange; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/v2/vcs/MergeConflictRanges.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/v2/vcs/MergeConflictRanges;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*    */   public static final class $serializer implements GeneratedSerializer<MergeConflictRanges> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */       arrayOfKSerializer[0] = (KSerializer)MergeConflictRange.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)MergeConflictRange.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)MergeConflictRange.$serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public MergeConflictRanges deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       MergeConflictRange mergeConflictRange1 = null, mergeConflictRange2 = null, mergeConflictRange3 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         mergeConflictRange1 = (MergeConflictRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)MergeConflictRange.$serializer.INSTANCE, mergeConflictRange1);
/*    */         i |= 0x1;
/*    */         mergeConflictRange2 = (MergeConflictRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)MergeConflictRange.$serializer.INSTANCE, mergeConflictRange2);
/*    */         i |= 0x2;
/*    */         mergeConflictRange3 = (MergeConflictRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)MergeConflictRange.$serializer.INSTANCE, mergeConflictRange3);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               mergeConflictRange1 = (MergeConflictRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)MergeConflictRange.$serializer.INSTANCE, mergeConflictRange1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               mergeConflictRange2 = (MergeConflictRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)MergeConflictRange.$serializer.INSTANCE, mergeConflictRange2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               mergeConflictRange3 = (MergeConflictRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)MergeConflictRange.$serializer.INSTANCE, mergeConflictRange3);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new MergeConflictRanges(i, mergeConflictRange1, mergeConflictRange2, mergeConflictRange3, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull MergeConflictRanges value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       MergeConflictRanges.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.library.v2.vcs.MergeConflictRanges", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("leftRange", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("rightRange", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("baseRange", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/v2/vcs/MergeConflictRanges$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/v2/vcs/MergeConflictRanges;", "model-task"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<MergeConflictRanges> serializer() {
/*    */       return (KSerializer<MergeConflictRanges>)MergeConflictRanges.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MergeConflictRange getLeftRange() {
/*    */     return this.leftRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MergeConflictRange getRightRange() {
/*    */     return this.rightRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MergeConflictRange component1() {
/*    */     return this.leftRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MergeConflictRange component2() {
/*    */     return this.rightRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MergeConflictRange component3() {
/*    */     return this.baseRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final MergeConflictRanges copy(@NotNull MergeConflictRange leftRange, @NotNull MergeConflictRange rightRange, @NotNull MergeConflictRange baseRange) {
/*    */     Intrinsics.checkNotNullParameter(leftRange, "leftRange");
/*    */     Intrinsics.checkNotNullParameter(rightRange, "rightRange");
/*    */     Intrinsics.checkNotNullParameter(baseRange, "baseRange");
/*    */     return new MergeConflictRanges(leftRange, rightRange, baseRange);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "MergeConflictRanges(leftRange=" + this.leftRange + ", rightRange=" + this.rightRange + ", baseRange=" + this.baseRange + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.leftRange.hashCode();
/*    */     result = result * 31 + this.rightRange.hashCode();
/*    */     return result * 31 + this.baseRange.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof MergeConflictRanges))
/*    */       return false; 
/*    */     MergeConflictRanges mergeConflictRanges = (MergeConflictRanges)other;
/*    */     return !Intrinsics.areEqual(this.leftRange, mergeConflictRanges.leftRange) ? false : (!Intrinsics.areEqual(this.rightRange, mergeConflictRanges.rightRange) ? false : (!!Intrinsics.areEqual(this.baseRange, mergeConflictRanges.baseRange)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\vcs\MergeConflictRanges.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */