/*    */ package ai.grazie.gen.tasks.vcs.editCommitMessage;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\030\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 12\0020\001:\00201BU\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\n\b\001\020\007\032\004\030\0010\003\022\n\b\001\020\b\032\004\030\0010\003\022\n\b\001\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB9\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\n\b\002\020\007\032\004\030\0010\003\022\n\b\002\020\b\032\004\030\0010\003\022\n\b\002\020\t\032\004\030\0010\005¢\006\002\020\rJ\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\005HÆ\003J\020\020\036\032\004\030\0010\003HÆ\003¢\006\002\020\021J\020\020\037\032\004\030\0010\003HÆ\003¢\006\002\020\021J\013\020 \032\004\030\0010\005HÆ\003JF\020!\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\n\b\002\020\007\032\004\030\0010\0032\n\b\002\020\b\032\004\030\0010\0032\n\b\002\020\t\032\004\030\0010\005HÆ\001¢\006\002\020\"J\023\020#\032\0020$2\b\020%\032\004\030\0010\001HÖ\003J\t\020&\032\0020\003HÖ\001J\t\020'\032\0020\005HÖ\001J&\020(\032\0020)2\006\020*\032\0020\0002\006\020+\032\0020,2\006\020-\032\0020.HÁ\001¢\006\002\b/R \020\b\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\022\022\004\b\016\020\017\032\004\b\020\020\021R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\023\020\017\032\004\b\024\020\025R\036\020\t\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\026\020\017\032\004\b\027\020\025R \020\007\032\004\030\0010\0038\006X\004¢\006\020\n\002\020\022\022\004\b\030\020\017\032\004\b\031\020\021R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\032\020\017\032\004\b\033\020\025¨\0062"}, d2 = {"Lai/grazie/gen/tasks/vcs/editCommitMessage/VcsEditCommitMessageTaskParams;", "", "seen1", "", "diff", "", "text", "summaryLength", "descriptionLength", "instruction", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDescriptionLength$annotations", "()V", "getDescriptionLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDiff$annotations", "getDiff", "()Ljava/lang/String;", "getInstruction$annotations", "getInstruction", "getSummaryLength$annotations", "getSummaryLength", "getText$annotations", "getText", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lai/grazie/gen/tasks/vcs/editCommitMessage/VcsEditCommitMessageTaskParams;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class VcsEditCommitMessageTaskParams {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String diff;
/*    */   @NotNull
/*    */   private final String text;
/*    */   
/* 37 */   public VcsEditCommitMessageTaskParams(@NotNull String diff, @NotNull String text, @Nullable Integer summaryLength, @Nullable Integer descriptionLength, @Nullable String instruction) { this.diff = diff;
/*    */ 
/*    */     
/* 40 */     this.text = text;
/*    */ 
/*    */     
/* 43 */     this.summaryLength = summaryLength;
/*    */ 
/*    */     
/* 46 */     this.descriptionLength = descriptionLength;
/*    */ 
/*    */     
/* 49 */     this.instruction = instruction; } @Nullable private final Integer summaryLength; @Nullable private final Integer descriptionLength; @Nullable private final String instruction; @Nullable
/* 50 */   public final String getInstruction() { return this.instruction; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/vcs/editCommitMessage/VcsEditCommitMessageTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/vcs/editCommitMessage/VcsEditCommitMessageTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<VcsEditCommitMessageTaskParams> {
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
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE);
/*    */       arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public VcsEditCommitMessageTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null;
/*    */       Integer integer1 = null, integer2 = null;
/*    */       String str3 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         integer1 = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer1);
/*    */         i |= 0x4;
/*    */         integer2 = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, integer2);
/*    */         i |= 0x8;
/*    */         str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               integer1 = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)IntSerializer.INSTANCE, integer1);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               integer2 = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)IntSerializer.INSTANCE, integer2);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new VcsEditCommitMessageTaskParams(i, str1, str2, integer1, integer2, str3, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull VcsEditCommitMessageTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       VcsEditCommitMessageTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.vcs.editCommitMessage.VcsEditCommitMessageTaskParams", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("diff", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("text", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("summaryLength", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("descriptionLength", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("instruction", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/editCommitMessage/VcsEditCommitMessageTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/editCommitMessage/VcsEditCommitMessageTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<VcsEditCommitMessageTaskParams> serializer() {
/*    */       return (KSerializer<VcsEditCommitMessageTaskParams>)VcsEditCommitMessageTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDiff() {
/*    */     return this.diff;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer getSummaryLength() {
/*    */     return this.summaryLength;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer getDescriptionLength() {
/*    */     return this.descriptionLength;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.diff;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component3() {
/*    */     return this.summaryLength;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final Integer component4() {
/*    */     return this.descriptionLength;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.instruction;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VcsEditCommitMessageTaskParams copy(@NotNull String diff, @NotNull String text, @Nullable Integer summaryLength, @Nullable Integer descriptionLength, @Nullable String instruction) {
/*    */     Intrinsics.checkNotNullParameter(diff, "diff");
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     return new VcsEditCommitMessageTaskParams(diff, text, summaryLength, descriptionLength, instruction);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VcsEditCommitMessageTaskParams(diff=" + this.diff + ", text=" + this.text + ", summaryLength=" + this.summaryLength + ", descriptionLength=" + this.descriptionLength + ", instruction=" + this.instruction + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.diff.hashCode();
/*    */     result = result * 31 + this.text.hashCode();
/*    */     result = result * 31 + ((this.summaryLength == null) ? 0 : this.summaryLength.hashCode());
/*    */     result = result * 31 + ((this.descriptionLength == null) ? 0 : this.descriptionLength.hashCode());
/*    */     return result * 31 + ((this.instruction == null) ? 0 : this.instruction.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VcsEditCommitMessageTaskParams))
/*    */       return false; 
/*    */     VcsEditCommitMessageTaskParams vcsEditCommitMessageTaskParams = (VcsEditCommitMessageTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.diff, vcsEditCommitMessageTaskParams.diff) ? false : (!Intrinsics.areEqual(this.text, vcsEditCommitMessageTaskParams.text) ? false : (!Intrinsics.areEqual(this.summaryLength, vcsEditCommitMessageTaskParams.summaryLength) ? false : (!Intrinsics.areEqual(this.descriptionLength, vcsEditCommitMessageTaskParams.descriptionLength) ? false : (!!Intrinsics.areEqual(this.instruction, vcsEditCommitMessageTaskParams.instruction)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\editCommitMessage\VcsEditCommitMessageTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */