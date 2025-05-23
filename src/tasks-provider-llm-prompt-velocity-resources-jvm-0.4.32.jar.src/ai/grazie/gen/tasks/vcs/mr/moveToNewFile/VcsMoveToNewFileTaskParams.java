/*    */ package ai.grazie.gen.tasks.vcs.mr.moveToNewFile;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 +2\0020\001:\003*+,BI\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\n\b\001\020\007\032\004\030\0010\005\022\n\b\001\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\t¢\006\002\020\rJ\t\020\031\032\0020\005HÆ\003J\t\020\032\032\0020\005HÆ\003J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\tHÆ\003J1\020\035\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\tHÆ\001J\023\020\036\032\0020\0372\b\020 \032\004\030\0010\001HÖ\003J\t\020!\032\0020\003HÖ\001J\t\020\"\032\0020\005HÖ\001J&\020#\032\0020$2\006\020%\032\0020\0002\006\020\b\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\021R\034\020\007\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\024\020\017\032\004\b\025\020\021R\034\020\b\032\0020\t8\006X\004¢\006\016\n\000\022\004\b\026\020\017\032\004\b\027\020\030¨\006-"}, d2 = {"Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams;", "", "seen1", "", "comment", "", "codeFragment", "fileText", "output", "Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;)V", "getCodeFragment$annotations", "()V", "getCodeFragment", "()Ljava/lang/String;", "getComment$annotations", "getComment", "getFileText$annotations", "getFileText", "getOutput$annotations", "getOutput", "()Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "Output", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class VcsMoveToNewFileTaskParams {
/*    */   @NotNull
/*    */   private final String comment;
/*    */   @NotNull
/*    */   private final String codeFragment;
/*    */   @NotNull
/*    */   private final String fileText;
/*    */   @NotNull
/*    */   private final Output output;
/*    */   @NotNull
/* 31 */   public static final Companion Companion = new Companion(null);
/*    */   @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers;
/*    */   static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = Output.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"}) public static final class $serializer implements GeneratedSerializer<VcsMoveToNewFileTaskParams> {
/*    */     @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])VcsMoveToNewFileTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[3] = arrayOfKSerializer1[3]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public VcsMoveToNewFileTaskParams deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null, str3 = null; VcsMoveToNewFileTaskParams.Output output = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])VcsMoveToNewFileTaskParams.$childSerializers; if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; output = (VcsMoveToNewFileTaskParams.Output)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], output); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue;case 3: output = (VcsMoveToNewFileTaskParams.Output)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], output); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new VcsMoveToNewFileTaskParams(i, str1, str2, str3, output, null); } public void serialize(@NotNull Encoder encoder, @NotNull VcsMoveToNewFileTaskParams value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); VcsMoveToNewFileTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.vcs.mr.moveToNewFile.VcsMoveToNewFileTaskParams", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("comment", false); pluginGeneratedSerialDescriptor.addElement("codeFragment", false); pluginGeneratedSerialDescriptor.addElement("fileText", false); pluginGeneratedSerialDescriptor.addElement("output", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams;", "tasks-provider-llm-prompt-velocity-resources"}) public static final class Companion {
/* 36 */     private Companion() {} @NotNull public final KSerializer<VcsMoveToNewFileTaskParams> serializer() { return (KSerializer<VcsMoveToNewFileTaskParams>)VcsMoveToNewFileTaskParams.$serializer.INSTANCE; } } public VcsMoveToNewFileTaskParams(@NotNull String comment, @NotNull String codeFragment, @NotNull String fileText, @NotNull Output output) { this.comment = comment;
/*    */ 
/*    */     
/* 39 */     this.codeFragment = codeFragment;
/*    */ 
/*    */     
/* 42 */     this.fileText = fileText;
/*    */ 
/*    */     
/* 45 */     this.output = output; } @NotNull public final String getComment() { return this.comment; } @NotNull public final String getCodeFragment() { return this.codeFragment; } @NotNull public final String getFileText() { return this.fileText; }
/* 46 */   @NotNull public final Output getOutput() { return this.output; } @NotNull public final String component1() { return this.comment; }
/*    */   @NotNull public final String component2() { return this.codeFragment; }
/*    */   @NotNull public final String component3() { return this.fileText; }
/*    */   @NotNull public final Output component4() { return this.output; }
/*    */   @NotNull public final VcsMoveToNewFileTaskParams copy(@NotNull String comment, @NotNull String codeFragment, @NotNull String fileText, @NotNull Output output) { Intrinsics.checkNotNullParameter(comment, "comment"); Intrinsics.checkNotNullParameter(codeFragment, "codeFragment"); Intrinsics.checkNotNullParameter(fileText, "fileText"); Intrinsics.checkNotNullParameter(output, "output"); return new VcsMoveToNewFileTaskParams(comment, codeFragment, fileText, output); }
/*    */   @NotNull public String toString() { return "VcsMoveToNewFileTaskParams(comment=" + this.comment + ", codeFragment=" + this.codeFragment + ", fileText=" + this.fileText + ", output=" + this.output + ")"; }
/*    */   public int hashCode() { result = this.comment.hashCode(); result = result * 31 + this.codeFragment.hashCode(); result = result * 31 + this.fileText.hashCode(); return result * 31 + this.output.hashCode(); }
/*    */   public boolean equals(@Nullable Object other) { if (this == other)
/*    */       return true;  if (!(other instanceof VcsMoveToNewFileTaskParams))
/*    */       return false;  VcsMoveToNewFileTaskParams vcsMoveToNewFileTaskParams = (VcsMoveToNewFileTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.comment, vcsMoveToNewFileTaskParams.comment) ? false : (!Intrinsics.areEqual(this.codeFragment, vcsMoveToNewFileTaskParams.codeFragment) ? false : (!Intrinsics.areEqual(this.fileText, vcsMoveToNewFileTaskParams.fileText) ? false : (!(this.output != vcsMoveToNewFileTaskParams.output)))); }
/* 57 */   @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\b\b\001\030\000 \n2\b\022\004\022\0020\0000\001:\001\nB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\t¨\006\013"}, d2 = {"Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CURRENT_FILE_CONTENT", "NEW_FILE_CONTENT", "NEW_FILE_NAME", "Companion", "tasks-provider-llm-prompt-velocity-resources"}) public enum Output { CURRENT_FILE_CONTENT("CURRENT_FILE_CONTENT"),
/* 58 */     NEW_FILE_CONTENT("NEW_FILE_CONTENT"),
/* 59 */     NEW_FILE_NAME("NEW_FILE_NAME"); @NotNull public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final String value;
/*    */     @NotNull
/*    */     private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*    */     
/*    */     Output(String value) {
/*    */       this.value = value;
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */     static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */       public static final null INSTANCE = (null)new Function0<>();
/*    */       
/*    */       null() {
/*    */         super(0);
/*    */       }
/*    */       
/*    */       public final KSerializer<Object> invoke() {
/*    */         String[] arrayOfString = new String[3];
/*    */         arrayOfString[0] = "CURRENT_FILE_CONTENT";
/*    */         arrayOfString[1] = "NEW_FILE_CONTENT";
/*    */         arrayOfString[2] = "NEW_FILE_NAME";
/*    */         Annotation[][] arrayOfAnnotation = new Annotation[3][];
/*    */         arrayOfAnnotation[0] = null;
/*    */         arrayOfAnnotation[1] = null;
/*    */         arrayOfAnnotation[2] = null;
/*    */         return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.gen.tasks.vcs.mr.moveToNewFile.VcsMoveToNewFileTaskParams.Output", (Enum[])VcsMoveToNewFileTaskParams.Output.values(), arrayOfString, arrayOfAnnotation, null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<VcsMoveToNewFileTaskParams.Output> serializer() {
/*    */         return get$cachedSerializer();
/*    */       }
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final String getValue() {
/*    */       return this.value;
/*    */     }
/*    */     
/*    */     static {
/*    */     
/*    */     } }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/vcs/mr/moveToNewFile/VcsMoveToNewFileTaskParams$Output;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<VcsMoveToNewFileTaskParams.Output> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\vcs\mr\moveToNewFile\VcsMoveToNewFileTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */