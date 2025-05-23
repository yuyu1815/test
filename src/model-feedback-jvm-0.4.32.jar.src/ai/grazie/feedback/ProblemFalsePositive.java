/*    */ package ai.grazie.feedback;
/*    */ import ai.grazie.gec.model.problem.Problem;
/*    */ import ai.grazie.gec.model.problem.Problem$;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\023\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 02\0020\001:\002/0BM\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\n\b\001\020\n\032\004\030\0010\007\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016¢\006\002\020\017B)\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\n\b\002\020\n\032\004\030\0010\007¢\006\002\020\020J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\t\020\036\032\0020\tHÆ\003J\013\020\037\032\004\030\0010\007HÆ\003J3\020 \032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\n\b\002\020\n\032\004\030\0010\007HÆ\001J\023\020!\032\0020\"2\b\020#\032\004\030\0010$HÖ\003J\t\020%\032\0020\003HÖ\001J\t\020&\032\0020\007HÖ\001J&\020'\032\0020(2\006\020)\032\0020\0002\006\020*\032\0020+2\006\020,\032\0020-HÁ\001¢\006\002\b.R\036\020\n\032\004\030\0010\0078\006X\004¢\006\016\n\000\022\004\b\021\020\022\032\004\b\023\020\024R\024\020\013\032\0020\fX\004¢\006\b\n\000\032\004\b\025\020\026R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\027\020\030R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\031\020\032R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\033\020\024¨\0061"}, d2 = {"Lai/grazie/feedback/ProblemFalsePositive;", "Lai/grazie/feedback/FeedbackBody;", "seen1", "", "language", "Lai/grazie/nlp/langs/Language;", "sentence", "", "problem", "Lai/grazie/gec/model/problem/Problem;", "additionalData", "feedbackType", "Lai/grazie/feedback/FeedbackType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlp/langs/Language;Ljava/lang/String;Lai/grazie/gec/model/problem/Problem;Ljava/lang/String;Lai/grazie/feedback/FeedbackType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;Lai/grazie/gec/model/problem/Problem;Ljava/lang/String;)V", "getAdditionalData$annotations", "()V", "getAdditionalData", "()Ljava/lang/String;", "getFeedbackType", "()Lai/grazie/feedback/FeedbackType;", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "getProblem", "()Lai/grazie/gec/model/problem/Problem;", "getSentence", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_feedback", "$serializer", "Companion", "model-feedback"})
/*    */ public final class ProblemFalsePositive extends FeedbackBody {
/*    */   @NotNull
/* 29 */   public static final Companion Companion = new Companion(null); @NotNull private final Language language; @NotNull private final String sentence; @NotNull private final Problem problem; static { KSerializer[] arrayOfKSerializer = new KSerializer[5]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = FeedbackType.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Nullable private final String additionalData; @NotNull private final FeedbackType feedbackType; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/feedback/ProblemFalsePositive.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/feedback/ProblemFalsePositive;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-feedback"}) public static final class $serializer implements GeneratedSerializer<ProblemFalsePositive> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])ProblemFalsePositive.$childSerializers, arrayOfKSerializer2 = new KSerializer[5]; arrayOfKSerializer2[0] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)Problem$.serializer.INSTANCE; arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[4] = arrayOfKSerializer1[4]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public ProblemFalsePositive deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Language language = null; String str1 = null; Problem problem = null; String str2 = null; FeedbackType feedbackType = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])ProblemFalsePositive.$childSerializers; if (compositeDecoder.decodeSequentially()) { language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; problem = (Problem)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Problem$.serializer.INSTANCE, problem); i |= 0x4; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x8; feedbackType = (FeedbackType)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], feedbackType); i |= 0x10; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; continue;case 1: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: problem = (Problem)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Problem$.serializer.INSTANCE, problem); i |= 0x4; continue;case 3: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x8; continue;case 4: feedbackType = (FeedbackType)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], feedbackType); i |= 0x10; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ProblemFalsePositive(i, language, str1, problem, str2, feedbackType, null); } public void serialize(@NotNull Encoder encoder, @NotNull ProblemFalsePositive value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ProblemFalsePositive.write$Self$model_feedback(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.feedback.ProblemFalsePositive", INSTANCE, 5); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("sentence", false); pluginGeneratedSerialDescriptor.addElement("problem", false); pluginGeneratedSerialDescriptor.addElement("additionalData", true); pluginGeneratedSerialDescriptor.addElement("feedbackType", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/feedback/ProblemFalsePositive$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/feedback/ProblemFalsePositive;", "model-feedback"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ProblemFalsePositive> serializer() { return (KSerializer<ProblemFalsePositive>)ProblemFalsePositive.$serializer.INSTANCE; }
/*    */      }
/*    */   @NotNull
/* 32 */   public final Language getLanguage() { return this.language; } @NotNull
/* 33 */   public final String getSentence() { return this.sentence; } @NotNull
/* 34 */   public final Problem getProblem() { return this.problem; } @Nullable
/* 35 */   public final String getAdditionalData() { return this.additionalData; }
/* 36 */   public ProblemFalsePositive(@NotNull Language language, @NotNull String sentence, @NotNull Problem problem, @Nullable String additionalData) { super(null); this.language = language; this.sentence = sentence; this.problem = problem; this.additionalData = additionalData;
/* 37 */     this.feedbackType = FeedbackType.FALSE_POSITIVE; } @NotNull public FeedbackType getFeedbackType() { return this.feedbackType; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Language component1() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.sentence;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Problem component3() {
/*    */     return this.problem;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.additionalData;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProblemFalsePositive copy(@NotNull Language language, @NotNull String sentence, @NotNull Problem problem, @Nullable String additionalData) {
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     Intrinsics.checkNotNullParameter(sentence, "sentence");
/*    */     Intrinsics.checkNotNullParameter(problem, "problem");
/*    */     return new ProblemFalsePositive(language, sentence, problem, additionalData);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ProblemFalsePositive(language=" + this.language + ", sentence=" + this.sentence + ", problem=" + this.problem + ", additionalData=" + this.additionalData + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.language.hashCode();
/*    */     result = result * 31 + this.sentence.hashCode();
/*    */     result = result * 31 + this.problem.hashCode();
/*    */     return result * 31 + ((this.additionalData == null) ? 0 : this.additionalData.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ProblemFalsePositive))
/*    */       return false; 
/*    */     ProblemFalsePositive problemFalsePositive = (ProblemFalsePositive)other;
/*    */     return (this.language != problemFalsePositive.language) ? false : (!Intrinsics.areEqual(this.sentence, problemFalsePositive.sentence) ? false : (!Intrinsics.areEqual(this.problem, problemFalsePositive.problem) ? false : (!!Intrinsics.areEqual(this.additionalData, problemFalsePositive.additionalData))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-feedback-jvm-0.4.32.jar!\ai\grazie\feedback\ProblemFalsePositive.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */