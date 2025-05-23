/*     */ package ai.grazie.gen.tasks.code.complete.mellum;
/*     */ import java.lang.annotation.Annotation;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.EncodeDefault;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\002\n\002\020\013\n\000\n\002\020 \n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b,\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\b\030\000 J2\0020\001:\004IJKLB\001\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\n\b\001\020\007\032\004\030\0010\b\022\n\b\001\020\t\032\004\030\0010\005\022\b\b\001\020\n\032\0020\013\022\020\b\001\020\f\032\n\022\004\022\0020\016\030\0010\r\022\b\b\001\020\017\032\0020\013\022\n\b\001\020\020\032\004\030\0010\021\022\b\b\001\020\022\032\0020\013\022\b\b\001\020\023\032\0020\013\022\b\020\024\032\004\030\0010\025¢\006\002\020\026Bc\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\006\020\t\032\0020\005\022\006\020\n\032\0020\013\022\016\b\002\020\f\032\b\022\004\022\0020\0160\r\022\b\b\002\020\017\032\0020\013\022\006\020\020\032\0020\021\022\b\b\002\020\022\032\0020\013\022\b\b\002\020\023\032\0020\013¢\006\002\020\027J\t\0202\032\0020\005HÆ\003J\t\0203\032\0020\013HÆ\003J\t\0204\032\0020\005HÆ\003J\t\0205\032\0020\bHÆ\003J\t\0206\032\0020\005HÆ\003J\t\0207\032\0020\013HÆ\003J\017\0208\032\b\022\004\022\0020\0160\rHÆ\003J\t\0209\032\0020\013HÆ\003J\t\020:\032\0020\021HÆ\003J\t\020;\032\0020\013HÆ\003Js\020<\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\0052\b\b\002\020\n\032\0020\0132\016\b\002\020\f\032\b\022\004\022\0020\0160\r2\b\b\002\020\017\032\0020\0132\b\b\002\020\020\032\0020\0212\b\b\002\020\022\032\0020\0132\b\b\002\020\023\032\0020\013HÆ\001J\023\020=\032\0020\0132\b\020>\032\004\030\0010\001HÖ\003J\t\020?\032\0020\003HÖ\001J\t\020@\032\0020\005HÖ\001J&\020A\032\0020B2\006\020C\032\0020\0002\006\020D\032\0020E2\006\020F\032\0020GHÁ\001¢\006\002\bHR\"\020\f\032\b\022\004\022\0020\0160\r8\006X\004¢\006\016\n\000\022\004\b\030\020\031\032\004\b\032\020\033R\034\020\017\032\0020\0138\006X\004¢\006\016\n\000\022\004\b\034\020\031\032\004\b\035\020\036R\034\020\t\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\037\020\031\032\004\b \020!R\034\020\022\032\0020\0138\006X\004¢\006\016\n\000\022\004\b\"\020\031\032\004\b#\020\036R\034\020\007\032\0020\b8\006X\004¢\006\016\n\000\022\004\b$\020\031\032\004\b%\020&R\034\020\n\032\0020\0138\006X\004¢\006\016\n\000\022\004\b'\020\031\032\004\b(\020\036R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b)\020\031\032\004\b*\020!R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b+\020\031\032\004\b,\020!R\034\020\023\032\0020\0138\006X\004¢\006\016\n\000\022\004\b-\020\031\032\004\b.\020\036R\034\020\020\032\0020\0218\006X\004¢\006\016\n\000\022\004\b/\020\031\032\004\b0\0201¨\006M"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams;", "", "seen1", "", "prefix", "", "suffix", "language", "Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language;", "filepath", "multilineAllowed", "", "context", "", "Lai/grazie/gen/tasks/code/complete/mellum/ContextItem;", "explicit", "useControlModel", "Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel;", "generateIndents", "useCloneFinder", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language;Ljava/lang/String;ZLjava/util/List;ZLai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language;Ljava/lang/String;ZLjava/util/List;ZLai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel;ZZ)V", "getContext$annotations", "()V", "getContext", "()Ljava/util/List;", "getExplicit$annotations", "getExplicit", "()Z", "getFilepath$annotations", "getFilepath", "()Ljava/lang/String;", "getGenerateIndents$annotations", "getGenerateIndents", "getLanguage$annotations", "getLanguage", "()Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language;", "getMultilineAllowed$annotations", "getMultilineAllowed", "getPrefix$annotations", "getPrefix", "getSuffix$annotations", "getSuffix", "getUseCloneFinder$annotations", "getUseCloneFinder", "getUseControlModel$annotations", "getUseControlModel", "()Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_jet_completion_model", "$serializer", "Companion", "Language", "UseControlModel", "tasks-provider-jet-completion-model"})
/*     */ public final class CodeCompleteMellumTaskParams {
/*     */   @NotNull
/*     */   private final String prefix;
/*     */   @NotNull
/*     */   private final String suffix;
/*     */   @NotNull
/*     */   private final Language language;
/*     */   @NotNull
/*     */   private final String filepath;
/*     */   private final boolean multilineAllowed;
/*     */   @NotNull
/*     */   private final List<ContextItem> context;
/*     */   private final boolean explicit;
/*     */   @NotNull
/*     */   private final UseControlModel useControlModel;
/*     */   private final boolean generateIndents;
/*     */   @NotNull
/*  38 */   public static final Companion Companion = new Companion(null);
/*     */   private final boolean useCloneFinder;
/*     */   @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers;
/*     */   static { KSerializer[] arrayOfKSerializer = new KSerializer[10]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = Language.Companion.serializer(); arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = (KSerializer)new ArrayListSerializer((KSerializer)ContextItem.$serializer.INSTANCE); arrayOfKSerializer[6] = null; arrayOfKSerializer[7] = UseControlModel.Companion.serializer(); arrayOfKSerializer[8] = null; arrayOfKSerializer[9] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; }
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-jet-completion-model"}) public static final class $serializer implements GeneratedSerializer<CodeCompleteMellumTaskParams> {
/*     */     @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])CodeCompleteMellumTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[10]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[4] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer2[5] = arrayOfKSerializer1[5]; arrayOfKSerializer2[6] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer2[7] = arrayOfKSerializer1[7]; arrayOfKSerializer2[8] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer2[9] = (KSerializer)BooleanSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public CodeCompleteMellumTaskParams deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; CodeCompleteMellumTaskParams.Language language = null; String str3 = null; boolean bool1 = false; List list = null; boolean bool2 = false; CodeCompleteMellumTaskParams.UseControlModel useControlModel = null; boolean bool3 = false, bool4 = false; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])CodeCompleteMellumTaskParams.$childSerializers; if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; language = (CodeCompleteMellumTaskParams.Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], language); i |= 0x4; str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4); i |= 0x10; list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], list); i |= 0x20; bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6); i |= 0x40; useControlModel = (CodeCompleteMellumTaskParams.UseControlModel)compositeDecoder.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy)arrayOfKSerializer[7], useControlModel); i |= 0x80; bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 8); i |= 0x100; bool4 = compositeDecoder.decodeBooleanElement(serialDescriptor, 9); i |= 0x200; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: language = (CodeCompleteMellumTaskParams.Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], language); i |= 0x4; continue;case 3: str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue;case 4: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4); i |= 0x10; continue;case 5: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], list); i |= 0x20; continue;case 6: bool2 = compositeDecoder.decodeBooleanElement(serialDescriptor, 6); i |= 0x40; continue;case 7: useControlModel = (CodeCompleteMellumTaskParams.UseControlModel)compositeDecoder.decodeSerializableElement(serialDescriptor, 7, (DeserializationStrategy)arrayOfKSerializer[7], useControlModel); i |= 0x80; continue;case 8: bool3 = compositeDecoder.decodeBooleanElement(serialDescriptor, 8); i |= 0x100; continue;case 9: bool4 = compositeDecoder.decodeBooleanElement(serialDescriptor, 9); i |= 0x200; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new CodeCompleteMellumTaskParams(i, str1, str2, language, str3, bool1, list, bool2, useControlModel, bool3, bool4, null); } public void serialize(@NotNull Encoder encoder, @NotNull CodeCompleteMellumTaskParams value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); CodeCompleteMellumTaskParams.write$Self$tasks_provider_jet_completion_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.code.complete.mellum.CodeCompleteMellumTaskParams", INSTANCE, 10); pluginGeneratedSerialDescriptor.addElement("prefix", false); pluginGeneratedSerialDescriptor.addElement("suffix", false); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("filepath", false); pluginGeneratedSerialDescriptor.addElement("multilineAllowed", false); pluginGeneratedSerialDescriptor.addElement("context", true); pluginGeneratedSerialDescriptor.addElement("explicit", true); pluginGeneratedSerialDescriptor.addElement("useControlModel", false); pluginGeneratedSerialDescriptor.addElement("generateIndents", true); pluginGeneratedSerialDescriptor.addElement("useCloneFinder", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams;", "tasks-provider-jet-completion-model"}) public static final class Companion {
/*  44 */     private Companion() {} @NotNull public final KSerializer<CodeCompleteMellumTaskParams> serializer() { return (KSerializer<CodeCompleteMellumTaskParams>)CodeCompleteMellumTaskParams.$serializer.INSTANCE; } } @NotNull public final String getPrefix() { return this.prefix; } @NotNull public final String getSuffix() { return this.suffix; } @NotNull public final Language getLanguage() { return this.language; } public CodeCompleteMellumTaskParams(@NotNull String prefix, @NotNull String suffix, @NotNull Language language, @NotNull String filepath, boolean multilineAllowed, @NotNull List<ContextItem> context, boolean explicit, @NotNull UseControlModel useControlModel, boolean generateIndents, boolean useCloneFinder) { this.prefix = prefix;
/*     */ 
/*     */ 
/*     */     
/*  48 */     this.suffix = suffix;
/*     */ 
/*     */ 
/*     */     
/*  52 */     this.language = language;
/*     */ 
/*     */ 
/*     */     
/*  56 */     this.filepath = filepath;
/*     */ 
/*     */ 
/*     */     
/*  60 */     this.multilineAllowed = multilineAllowed;
/*     */ 
/*     */     
/*  63 */     this.context = context;
/*     */ 
/*     */ 
/*     */     
/*  67 */     this.explicit = explicit;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*  72 */     this.useControlModel = useControlModel;
/*     */ 
/*     */     
/*  75 */     this.generateIndents = generateIndents;
/*     */ 
/*     */ 
/*     */     
/*  79 */     this.useCloneFinder = useCloneFinder; } @NotNull public final String getFilepath() { return this.filepath; } public final boolean getMultilineAllowed() { return this.multilineAllowed; } @NotNull public final List<ContextItem> getContext() { return this.context; } public final boolean getExplicit() { return this.explicit; } @NotNull public final UseControlModel getUseControlModel() { return this.useControlModel; }
/*     */   public final boolean getGenerateIndents() { return this.generateIndents; }
/*  81 */   public final boolean getUseCloneFinder() { return this.useCloneFinder; } @NotNull public final String component1() { return this.prefix; } @NotNull public final String component2() { return this.suffix; } @NotNull public final Language component3() { return this.language; } @NotNull public final String component4() { return this.filepath; }
/*     */   public final boolean component5() { return this.multilineAllowed; }
/*     */   @NotNull public final List<ContextItem> component6() { return this.context; }
/*     */   public final boolean component7() { return this.explicit; }
/*     */   @NotNull public final UseControlModel component8() { return this.useControlModel; }
/*     */   public final boolean component9() { return this.generateIndents; }
/*     */   public final boolean component10() { return this.useCloneFinder; }
/*     */   @NotNull public final CodeCompleteMellumTaskParams copy(@NotNull String prefix, @NotNull String suffix, @NotNull Language language, @NotNull String filepath, boolean multilineAllowed, @NotNull List<ContextItem> context, boolean explicit, @NotNull UseControlModel useControlModel, boolean generateIndents, boolean useCloneFinder) { Intrinsics.checkNotNullParameter(prefix, "prefix"); Intrinsics.checkNotNullParameter(suffix, "suffix"); Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(filepath, "filepath"); Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(useControlModel, "useControlModel"); return new CodeCompleteMellumTaskParams(prefix, suffix, language, filepath, multilineAllowed, context, explicit, useControlModel, generateIndents, useCloneFinder); }
/*     */   @NotNull public String toString() { return "CodeCompleteMellumTaskParams(prefix=" + this.prefix + ", suffix=" + this.suffix + ", language=" + this.language + ", filepath=" + this.filepath + ", multilineAllowed=" + this.multilineAllowed + ", context=" + this.context + ", explicit=" + this.explicit + ", useControlModel=" + this.useControlModel + ", generateIndents=" + this.generateIndents + ", useCloneFinder=" + this.useCloneFinder + ")"; }
/*     */   public int hashCode() { result = this.prefix.hashCode(); result = result * 31 + this.suffix.hashCode(); result = result * 31 + this.language.hashCode(); result = result * 31 + this.filepath.hashCode(); result = result * 31 + Boolean.hashCode(this.multilineAllowed); result = result * 31 + this.context.hashCode(); result = result * 31 + Boolean.hashCode(this.explicit); result = result * 31 + this.useControlModel.hashCode(); result = result * 31 + Boolean.hashCode(this.generateIndents); return result * 31 + Boolean.hashCode(this.useCloneFinder); }
/*     */   public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof CodeCompleteMellumTaskParams)) return false;  CodeCompleteMellumTaskParams codeCompleteMellumTaskParams = (CodeCompleteMellumTaskParams)other; return !Intrinsics.areEqual(this.prefix, codeCompleteMellumTaskParams.prefix) ? false : (!Intrinsics.areEqual(this.suffix, codeCompleteMellumTaskParams.suffix) ? false : ((this.language != codeCompleteMellumTaskParams.language) ? false : (!Intrinsics.areEqual(this.filepath, codeCompleteMellumTaskParams.filepath) ? false : ((this.multilineAllowed != codeCompleteMellumTaskParams.multilineAllowed) ? false : (!Intrinsics.areEqual(this.context, codeCompleteMellumTaskParams.context) ? false : ((this.explicit != codeCompleteMellumTaskParams.explicit) ? false : ((this.useControlModel != codeCompleteMellumTaskParams.useControlModel) ? false : ((this.generateIndents != codeCompleteMellumTaskParams.generateIndents) ? false : (!(this.useCloneFinder != codeCompleteMellumTaskParams.useCloneFinder)))))))))); }
/*  92 */   @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\n\b\001\030\000 \f2\b\022\004\022\0020\0000\001:\001\fB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013¨\006\r"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "KOTLIN", "JAVA", "PYTHON", "HCL", "OTHER", "Companion", "tasks-provider-jet-completion-model"}) public enum Language { KOTLIN("KOTLIN"),
/*  93 */     JAVA("JAVA"),
/*  94 */     PYTHON("PYTHON"),
/*  95 */     HCL("HCL"),
/*  96 */     OTHER("OTHER"); @NotNull public static final Companion Companion = new Companion(null); @NotNull private final String value; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); Language(String value) { this.value = value; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*     */       public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { String[] arrayOfString = new String[5]; arrayOfString[0] = "KOTLIN"; arrayOfString[1] = "JAVA"; arrayOfString[2] = "PYTHON"; arrayOfString[3] = "HCL"; arrayOfString[4] = "OTHER"; Annotation[][] arrayOfAnnotation = new Annotation[5][]; arrayOfAnnotation[0] = null; arrayOfAnnotation[1] = null; arrayOfAnnotation[2] = null; arrayOfAnnotation[3] = null; arrayOfAnnotation[4] = null; return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.gen.tasks.code.complete.mellum.CodeCompleteMellumTaskParams.Language", (Enum[])CodeCompleteMellumTaskParams.Language.values(), arrayOfString, arrayOfAnnotation, null); } }
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language;", "tasks-provider-jet-completion-model"}) public static final class Companion {
/*     */       private Companion() {}
/*     */       @NotNull public final KSerializer<CodeCompleteMellumTaskParams.Language> serializer() { return get$cachedSerializer(); } }
/*     */     @NotNull public final String getValue() { return this.value; }
/*     */     static {  } }
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$Language;", "tasks-provider-jet-completion-model"}) public static final class Companion { private Companion() {}
/*     */     @NotNull public final KSerializer<CodeCompleteMellumTaskParams.Language> serializer() { return get$cachedSerializer(); } }
/* 105 */   @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\b\b\001\030\000 \n2\b\022\004\022\0020\0000\001:\001\nB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\t¨\006\013"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ON", "OFF", "SILENT", "Companion", "tasks-provider-jet-completion-model"}) public enum UseControlModel { ON("ON"),
/* 106 */     OFF("OFF"),
/* 107 */     SILENT("SILENT"); @NotNull public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final String value;
/*     */     @NotNull
/*     */     private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*     */     
/*     */     UseControlModel(String value) {
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*     */       public static final null INSTANCE = (null)new Function0<>();
/*     */       
/*     */       null() {
/*     */         super(0);
/*     */       }
/*     */       
/*     */       public final KSerializer<Object> invoke() {
/*     */         String[] arrayOfString = new String[3];
/*     */         arrayOfString[0] = "ON";
/*     */         arrayOfString[1] = "OFF";
/*     */         arrayOfString[2] = "SILENT";
/*     */         Annotation[][] arrayOfAnnotation = new Annotation[3][];
/*     */         arrayOfAnnotation[0] = null;
/*     */         arrayOfAnnotation[1] = null;
/*     */         arrayOfAnnotation[2] = null;
/*     */         return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.gen.tasks.code.complete.mellum.CodeCompleteMellumTaskParams.UseControlModel", (Enum[])CodeCompleteMellumTaskParams.UseControlModel.values(), arrayOfString, arrayOfAnnotation, null);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel;", "tasks-provider-jet-completion-model"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<CodeCompleteMellumTaskParams.UseControlModel> serializer() {
/*     */         return get$cachedSerializer();
/*     */       }
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     static {
/*     */     
/*     */     } }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/complete/mellum/CodeCompleteMellumTaskParams$UseControlModel;", "tasks-provider-jet-completion-model"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<CodeCompleteMellumTaskParams.UseControlModel> serializer() {
/*     */       return get$cachedSerializer();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-jet-completion-model-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\complete\mellum\CodeCompleteMellumTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */