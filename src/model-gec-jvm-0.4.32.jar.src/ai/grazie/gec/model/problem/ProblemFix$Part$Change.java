/*     */ package ai.grazie.gec.model.problem;
/*     */ 
/*     */ import ai.grazie.text.ExtensionsKt;
/*     */ import ai.grazie.text.TextRange;
/*     */ import ai.grazie.text.TextRange$;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @SerialName("Change")
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 /2\0020\001:\003-./BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\007\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\016J\016\020\032\032\0020\0072\006\020\033\032\0020\007J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\035\020\036\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\037\032\0020 2\b\020!\032\004\030\0010\"HÖ\003J\t\020#\032\0020\003HÖ\001J\t\020$\032\0020\007HÖ\001J&\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+HÁ\001¢\006\002\b,R\024\020\n\032\0020\007X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\021\020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\023\020\024R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\025\020\020R\021\020\026\032\0020\0278F¢\006\006\032\004\b\030\020\031¨\0060"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "seen1", "", "range", "Lai/grazie/text/TextRange;", "text", "", "kind", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "display", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/text/TextRange;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/text/TextRange;Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "getKind", "()Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "getRange", "()Lai/grazie/text/TextRange;", "getText", "type", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "getType", "()Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "apply", "sentence", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "ChangeType", "Companion", "model-gec"})
/*     */ @SourceDebugExtension({"SMAP\nProblemFix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProblemFix.kt\nai/grazie/gec/model/problem/ProblemFix$Part$Change\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/*     */ public final class Change
/*     */   extends ProblemFix.Part
/*     */ {
/*     */   @NotNull
/*     */   private final TextRange range;
/*     */   @NotNull
/*     */   private final String text;
/*     */   @NotNull
/*     */   private final ProblemFix.Part.PartKind kind;
/*     */   @NotNull
/*  92 */   public static final Companion Companion = new Companion(null); @NotNull private final String display; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = ProblemFix.Part.PartKind.Companion.serializer(); arrayOfKSerializer[3] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.Part.Change.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<Change> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])ProblemFix.Part.Change.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)TextRange$.serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public ProblemFix.Part.Change deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; TextRange textRange = null; String str1 = null; ProblemFix.Part.PartKind partKind = null; String str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])ProblemFix.Part.Change.$childSerializers; if (compositeDecoder.decodeSequentially()) { textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange); i |= 0x1; str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], partKind); i |= 0x4; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange); i |= 0x1; continue;case 1: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], partKind); i |= 0x4; continue;case 3: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ProblemFix.Part.Change(i, textRange, str1, partKind, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix.Part.Change value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ProblemFix.Part.Change.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Change", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("range", false); pluginGeneratedSerialDescriptor.addElement("text", false); pluginGeneratedSerialDescriptor.addElement("kind", true); pluginGeneratedSerialDescriptor.addElement("display", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "model-gec"}) public static final class Companion { @NotNull public final KSerializer<ProblemFix.Part.Change> serializer() { return (KSerializer<ProblemFix.Part.Change>)ProblemFix.Part.Change.$serializer.INSTANCE; }
/*     */      private Companion() {} } public Change(@NotNull TextRange range, @NotNull String text) {
/*  94 */     super(null); this.range = range; this.text = text;
/*     */ 
/*     */     
/*  97 */     if (!((this.range.getStart() >= 0) ? 1 : 0)) {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 134 */       int $i$a$-require-ProblemFix$Part$Change$1 = 0;
/*     */       String str = "Negative change start: " + this.range;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     this.kind = ProblemFix.Part.PartKind.CHANGE;
/*     */     this.display = this.text;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TextRange getRange() {
/*     */     return this.range;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String getText() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public ProblemFix.Part.PartKind getKind() {
/*     */     return this.kind;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String getDisplay() {
/*     */     return this.display;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "", "(Ljava/lang/String;I)V", "INSERT", "REPLACE", "REMOVE", "model-gec"})
/*     */   public enum ChangeType {
/*     */     INSERT, REPLACE, REMOVE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String apply(@NotNull String sentence) {
/*     */     Intrinsics.checkNotNullParameter(sentence, "sentence");
/*     */     return ExtensionsKt.replace(sentence, this.range, this.text);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ChangeType getType() {
/*     */     if ((((CharSequence)this.text).length() == 0))
/*     */       return ChangeType.REMOVE; 
/*     */     if (this.range.isEmpty())
/*     */       return ChangeType.INSERT; 
/*     */     return ChangeType.REPLACE;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TextRange component1() {
/*     */     return this.range;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.text;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Change copy(@NotNull TextRange range, @NotNull String text) {
/*     */     Intrinsics.checkNotNullParameter(range, "range");
/*     */     Intrinsics.checkNotNullParameter(text, "text");
/*     */     return new Change(range, text);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Change(range=" + this.range + ", text=" + this.text + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.range.hashCode();
/*     */     return result * 31 + this.text.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof Change))
/*     */       return false; 
/*     */     Change change = (Change)other;
/*     */     return !Intrinsics.areEqual(this.range, change.range) ? false : (!!Intrinsics.areEqual(this.text, change.text));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemFix$Part$Change.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */