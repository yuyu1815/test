/*    */ package ai.grazie.gen.tasks.vcs.generateCommitMessage;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.EncodeDefault;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020 \n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,BU\b\021\022\006\020\002\032\0020\003\022\020\b\001\020\004\032\n\022\004\022\0020\006\030\0010\005\022\n\b\001\020\007\032\004\030\0010\006\022\n\b\001\020\b\032\004\030\0010\006\022\020\b\001\020\t\032\n\022\004\022\0020\006\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB9\022\f\020\004\032\b\022\004\022\0020\0060\005\022\006\020\007\032\0020\006\022\n\b\002\020\b\032\004\030\0010\006\022\020\b\002\020\t\032\n\022\004\022\0020\006\030\0010\005¢\006\002\020\rJ\017\020\031\032\b\022\004\022\0020\0060\005HÆ\003J\t\020\032\032\0020\006HÆ\003J\013\020\033\032\004\030\0010\006HÆ\003J\021\020\034\032\n\022\004\022\0020\006\030\0010\005HÆ\003JA\020\035\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\b\b\002\020\007\032\0020\0062\n\b\002\020\b\032\004\030\0010\0062\020\b\002\020\t\032\n\022\004\022\0020\006\030\0010\005HÆ\001J\023\020\036\032\0020\0372\b\020 \032\004\030\0010\001HÖ\003J\t\020!\032\0020\003HÖ\001J\t\020\"\032\0020\006HÖ\001J&\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÁ\001¢\006\002\b*R\"\020\004\032\b\022\004\022\0020\0060\0058\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\036\020\b\032\004\030\0010\0068\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\024R$\020\t\032\n\022\004\022\0020\006\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\025\020\017\032\004\b\026\020\021R\034\020\007\032\0020\0068\006X\004¢\006\016\n\000\022\004\b\027\020\017\032\004\b\030\020\024¨\006-"}, d2 = {"Lai/grazie/gen/tasks/vcs/generateCommitMessage/VcsGenerateCommitMessageV3TaskParams;", "", "seen1", "", "diff", "", "", "text", "instruction", "messages", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDiff$annotations", "()V", "getDiff", "()Ljava/util/List;", "getInstruction$annotations", "getInstruction", "()Ljava/lang/String;", "getMessages$annotations", "getMessages", "getText$annotations", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class VcsGenerateCommitMessageV3TaskParams {
/*    */   @NotNull
/* 31 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final List<String> diff; @NotNull
/*    */   private final String text;
/*    */   
/* 36 */   public VcsGenerateCommitMessageV3TaskParams(@NotNull List<String> diff, @NotNull String text, @Nullable String instruction, @Nullable List<String> messages) { this.diff = diff;
/*    */ 
/*    */     
/* 39 */     this.text = text;
/*    */ 
/*    */     
/* 42 */     this.instruction = instruction;
/*    */ 
/*    */ 
/*    */     
/* 46 */     this.messages = messages; } @Nullable private final String instruction; @Nullable private final List<String> messages; @JvmField @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; @Nullable
/* 48 */   public final List<String> getMessages() { return this.messages; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */     arrayOfKSerializer[0] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/*    */     arrayOfKSerializer[3] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/vcs/generateCommitMessage/VcsGenerateCommitMessageV3TaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/vcs/generateCommitMessage/VcsGenerateCommitMessageV3TaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<VcsGenerateCommitMessageV3TaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])VcsGenerateCommitMessageV3TaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*    */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*    */       arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[3]);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public VcsGenerateCommitMessageV3TaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       List list1 = null;
/*    */       String str1 = null, str2 = null;
/*    */       List list2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])VcsGenerateCommitMessageV3TaskParams.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*    */         i |= 0x1;
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x4;
/*    */         list2 = (List)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list2);
/*    */         i |= 0x8;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               list1 = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], list1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               list2 = (List)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list2);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new VcsGenerateCommitMessageV3TaskParams(i, list1, str1, str2, list2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull VcsGenerateCommitMessageV3TaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       VcsGenerateCommitMessageV3TaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.vcs.generateCommitMessage.VcsGenerateCommitMessageV3TaskParams", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("diff", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("text", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("instruction", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("messages", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/generateCommitMessage/VcsGenerateCommitMessageV3TaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/generateCommitMessage/VcsGenerateCommitMessageV3TaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<VcsGenerateCommitMessageV3TaskParams> serializer() {
/*    */       return (KSerializer<VcsGenerateCommitMessageV3TaskParams>)VcsGenerateCommitMessageV3TaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> getDiff() {
/*    */     return this.diff;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getText() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getInstruction() {
/*    */     return this.instruction;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component1() {
/*    */     return this.diff;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.text;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.instruction;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final List<String> component4() {
/*    */     return this.messages;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final VcsGenerateCommitMessageV3TaskParams copy(@NotNull List<String> diff, @NotNull String text, @Nullable String instruction, @Nullable List<String> messages) {
/*    */     Intrinsics.checkNotNullParameter(diff, "diff");
/*    */     Intrinsics.checkNotNullParameter(text, "text");
/*    */     return new VcsGenerateCommitMessageV3TaskParams(diff, text, instruction, messages);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "VcsGenerateCommitMessageV3TaskParams(diff=" + this.diff + ", text=" + this.text + ", instruction=" + this.instruction + ", messages=" + this.messages + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.diff.hashCode();
/*    */     result = result * 31 + this.text.hashCode();
/*    */     result = result * 31 + ((this.instruction == null) ? 0 : this.instruction.hashCode());
/*    */     return result * 31 + ((this.messages == null) ? 0 : this.messages.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof VcsGenerateCommitMessageV3TaskParams))
/*    */       return false; 
/*    */     VcsGenerateCommitMessageV3TaskParams vcsGenerateCommitMessageV3TaskParams = (VcsGenerateCommitMessageV3TaskParams)other;
/*    */     return !Intrinsics.areEqual(this.diff, vcsGenerateCommitMessageV3TaskParams.diff) ? false : (!Intrinsics.areEqual(this.text, vcsGenerateCommitMessageV3TaskParams.text) ? false : (!Intrinsics.areEqual(this.instruction, vcsGenerateCommitMessageV3TaskParams.instruction) ? false : (!!Intrinsics.areEqual(this.messages, vcsGenerateCommitMessageV3TaskParams.messages))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\generateCommitMessage\VcsGenerateCommitMessageV3TaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */