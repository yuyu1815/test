/*    */ package ai.grazie.gen.tasks.vcs.resolveConflicts;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 '2\0020\001:\002&'B=\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\n\b\001\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005¢\006\002\020\013J\t\020\024\032\0020\005HÆ\003J\t\020\025\032\0020\005HÆ\003J\t\020\026\032\0020\005HÆ\003J'\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\005HÆ\001J\023\020\030\032\0020\0312\b\020\032\032\004\030\0010\001HÖ\003J\t\020\033\032\0020\003HÖ\001J\t\020\034\032\0020\035HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\034\020\007\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\017R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\022\020\r\032\004\b\023\020\017¨\006("}, d2 = {"Lai/grazie/gen/tasks/vcs/resolveConflicts/Conflict;", "", "seen1", "", "leftRange", "Lai/grazie/gen/tasks/vcs/resolveConflicts/Range;", "rightRange", "baseRange", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gen/tasks/vcs/resolveConflicts/Range;Lai/grazie/gen/tasks/vcs/resolveConflicts/Range;Lai/grazie/gen/tasks/vcs/resolveConflicts/Range;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gen/tasks/vcs/resolveConflicts/Range;Lai/grazie/gen/tasks/vcs/resolveConflicts/Range;Lai/grazie/gen/tasks/vcs/resolveConflicts/Range;)V", "getBaseRange$annotations", "()V", "getBaseRange", "()Lai/grazie/gen/tasks/vcs/resolveConflicts/Range;", "getLeftRange$annotations", "getLeftRange", "getRightRange$annotations", "getRightRange", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class Conflict {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Range leftRange;
/*    */   
/*    */   public Conflict(@NotNull Range leftRange, @NotNull Range rightRange, @NotNull Range baseRange) {
/* 36 */     this.leftRange = leftRange;
/*    */ 
/*    */     
/* 39 */     this.rightRange = rightRange;
/*    */ 
/*    */     
/* 42 */     this.baseRange = baseRange; } @NotNull private final Range rightRange; @NotNull private final Range baseRange; @NotNull
/* 43 */   public final Range getBaseRange() { return this.baseRange; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/vcs/resolveConflicts/Conflict.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/vcs/resolveConflicts/Conflict;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<Conflict> {
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
/*    */       arrayOfKSerializer[0] = (KSerializer)Range.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Range.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)Range.$serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Conflict deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Range range1 = null, range2 = null, range3 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         range1 = (Range)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Range.$serializer.INSTANCE, range1);
/*    */         i |= 0x1;
/*    */         range2 = (Range)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Range.$serializer.INSTANCE, range2);
/*    */         i |= 0x2;
/*    */         range3 = (Range)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Range.$serializer.INSTANCE, range3);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               range1 = (Range)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Range.$serializer.INSTANCE, range1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               range2 = (Range)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Range.$serializer.INSTANCE, range2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               range3 = (Range)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Range.$serializer.INSTANCE, range3);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Conflict(i, range1, range2, range3, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Conflict value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Conflict.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.vcs.resolveConflicts.Conflict", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("leftRange", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("rightRange", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("baseRange", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/resolveConflicts/Conflict$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/resolveConflicts/Conflict;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Conflict> serializer() {
/*    */       return (KSerializer<Conflict>)Conflict.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Range getLeftRange() {
/*    */     return this.leftRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Range getRightRange() {
/*    */     return this.rightRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Range component1() {
/*    */     return this.leftRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Range component2() {
/*    */     return this.rightRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Range component3() {
/*    */     return this.baseRange;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Conflict copy(@NotNull Range leftRange, @NotNull Range rightRange, @NotNull Range baseRange) {
/*    */     Intrinsics.checkNotNullParameter(leftRange, "leftRange");
/*    */     Intrinsics.checkNotNullParameter(rightRange, "rightRange");
/*    */     Intrinsics.checkNotNullParameter(baseRange, "baseRange");
/*    */     return new Conflict(leftRange, rightRange, baseRange);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Conflict(leftRange=" + this.leftRange + ", rightRange=" + this.rightRange + ", baseRange=" + this.baseRange + ")";
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
/*    */     if (!(other instanceof Conflict))
/*    */       return false; 
/*    */     Conflict conflict = (Conflict)other;
/*    */     return !Intrinsics.areEqual(this.leftRange, conflict.leftRange) ? false : (!Intrinsics.areEqual(this.rightRange, conflict.rightRange) ? false : (!!Intrinsics.areEqual(this.baseRange, conflict.baseRange)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\resolveConflicts\Conflict.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */