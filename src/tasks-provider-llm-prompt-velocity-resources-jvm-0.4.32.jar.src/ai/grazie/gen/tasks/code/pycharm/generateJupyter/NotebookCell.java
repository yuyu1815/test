/*    */ package ai.grazie.gen.tasks.code.pycharm.generateJupyter;
/*    */ import java.lang.annotation.Annotation;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\020\n\002\020\013\n\002\b\004\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 '2\0020\001:\003&'(B=\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\007\022\n\b\001\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\005¢\006\002\020\fJ\t\020\026\032\0020\005HÆ\003J\t\020\027\032\0020\007HÆ\003J\t\020\030\032\0020\005HÆ\003J'\020\031\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\005HÆ\001J\023\020\032\032\0020\0332\b\020\034\032\004\030\0010\001HÖ\003J\t\020\035\032\0020\003HÖ\001J\t\020\036\032\0020\005HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\b\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\034\020\b\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\020R\034\020\006\032\0020\0078\006X\004¢\006\016\n\000\022\004\b\023\020\016\032\004\b\024\020\025¨\006)"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell;", "", "seen1", "", "text", "", "type", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type;", "output", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type;Ljava/lang/String;)V", "getOutput$annotations", "()V", "getOutput", "()Ljava/lang/String;", "getText$annotations", "getText", "getType$annotations", "getType", "()Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "Type", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class NotebookCell {
/*    */   @NotNull
/*    */   private final String text;
/*    */   @NotNull
/*    */   private final Type type;
/*    */   @NotNull
/*    */   private final String output;
/*    */   @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/*    */   @NotNull
/* 30 */   public static final Companion Companion = new Companion(null);
/*    */   static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = Type.Companion.serializer(); arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"}) public static final class $serializer implements GeneratedSerializer<NotebookCell> {
/*    */     @NotNull public static final $serializer INSTANCE = new $serializer();
/*    */     @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])NotebookCell.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public NotebookCell deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null; NotebookCell.Type type = null; String str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])NotebookCell.$childSerializers; if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; type = (NotebookCell.Type)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], type); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: type = (NotebookCell.Type)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], type); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new NotebookCell(i, str1, type, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull NotebookCell value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); NotebookCell.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.code.pycharm.generateJupyter.NotebookCell", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("type", false); pluginGeneratedSerialDescriptor.addElement("output", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell;", "tasks-provider-llm-prompt-velocity-resources"}) public static final class Companion {
/* 35 */     private Companion() {} @NotNull public final KSerializer<NotebookCell> serializer() { return (KSerializer<NotebookCell>)NotebookCell.$serializer.INSTANCE; } } public NotebookCell(@NotNull String text, @NotNull Type type, @NotNull String output) { this.text = text;
/*    */ 
/*    */     
/* 38 */     this.type = type;
/*    */ 
/*    */     
/* 41 */     this.output = output; } @NotNull public final String getText() { return this.text; } @NotNull public final Type getType() { return this.type; }
/* 42 */   @NotNull public final String getOutput() { return this.output; } @NotNull public final String component1() { return this.text; }
/*    */   @NotNull public final Type component2() { return this.type; }
/*    */   @NotNull public final String component3() { return this.output; }
/*    */   @NotNull public final NotebookCell copy(@NotNull String text, @NotNull Type type, @NotNull String output) { Intrinsics.checkNotNullParameter(text, "text"); Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(output, "output"); return new NotebookCell(text, type, output); }
/*    */   @NotNull public String toString() { return "NotebookCell(text=" + this.text + ", type=" + this.type + ", output=" + this.output + ")"; }
/*    */   public int hashCode() { result = this.text.hashCode(); result = result * 31 + this.type.hashCode(); return result * 31 + this.output.hashCode(); }
/*    */   public boolean equals(@Nullable Object other) { if (this == other)
/*    */       return true;  if (!(other instanceof NotebookCell))
/*    */       return false; 
/*    */     NotebookCell notebookCell = (NotebookCell)other;
/*    */     return !Intrinsics.areEqual(this.text, notebookCell.text) ? false : ((this.type != notebookCell.type) ? false : (!!Intrinsics.areEqual(this.output, notebookCell.output))); }
/* 53 */   @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\b\b\001\030\000 \n2\b\022\004\022\0020\0000\001:\001\nB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\t¨\006\013"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CODE", "SQL", "MARKDOWN", "Companion", "tasks-provider-llm-prompt-velocity-resources"}) public enum Type { CODE("CODE"),
/* 54 */     SQL("SQL"),
/* 55 */     MARKDOWN("MARKDOWN"); @NotNull public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final String value;
/*    */     @NotNull
/*    */     private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*    */     
/*    */     Type(String value) {
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
/*    */         arrayOfString[0] = "CODE";
/*    */         arrayOfString[1] = "SQL";
/*    */         arrayOfString[2] = "MARKDOWN";
/*    */         Annotation[][] arrayOfAnnotation = new Annotation[3][];
/*    */         arrayOfAnnotation[0] = null;
/*    */         arrayOfAnnotation[1] = null;
/*    */         arrayOfAnnotation[2] = null;
/*    */         return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.gen.tasks.code.pycharm.generateJupyter.NotebookCell.Type", (Enum[])NotebookCell.Type.values(), arrayOfString, arrayOfAnnotation, null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<NotebookCell.Type> serializer() {
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
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/NotebookCell$Type;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<NotebookCell.Type> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\pycharm\generateJupyter\NotebookCell.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */