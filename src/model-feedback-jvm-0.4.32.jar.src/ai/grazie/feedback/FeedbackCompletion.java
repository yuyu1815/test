/*    */ package ai.grazie.feedback;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\023\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 12\0020\001:\00201B[\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\007\022\b\020\t\032\004\030\0010\007\022\016\020\n\032\n\022\004\022\0020\007\030\0010\013\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017¢\006\002\020\020B3\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\007\022\006\020\t\032\0020\007\022\f\020\n\032\b\022\004\022\0020\0070\013¢\006\002\020\021J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\t\020\036\032\0020\007HÆ\003J\t\020\037\032\0020\007HÆ\003J\017\020 \032\b\022\004\022\0020\0070\013HÆ\003JA\020!\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\0072\b\b\002\020\t\032\0020\0072\016\b\002\020\n\032\b\022\004\022\0020\0070\013HÆ\001J\023\020\"\032\0020#2\b\020$\032\004\030\0010%HÖ\003J\t\020&\032\0020\003HÖ\001J\t\020'\032\0020\007HÖ\001J&\020(\032\0020)2\006\020*\032\0020\0002\006\020+\032\0020,2\006\020-\032\0020.HÁ\001¢\006\002\b/R\027\020\n\032\b\022\004\022\0020\0070\013¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\024\020\f\032\0020\rX\004¢\006\b\n\000\032\004\b\026\020\027R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\030\020\031R\021\020\b\032\0020\007¢\006\b\n\000\032\004\b\032\020\025R\021\020\t\032\0020\007¢\006\b\n\000\032\004\b\033\020\025¨\0062"}, d2 = {"Lai/grazie/feedback/FeedbackCompletion;", "Lai/grazie/feedback/FeedbackBody;", "seen1", "", "language", "Lai/grazie/nlp/langs/Language;", "context", "", "prefix", "profile", "completions", "", "feedbackType", "Lai/grazie/feedback/FeedbackType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/nlp/langs/Language;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lai/grazie/feedback/FeedbackType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/nlp/langs/Language;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCompletions", "()Ljava/util/List;", "getContext", "()Ljava/lang/String;", "getFeedbackType", "()Lai/grazie/feedback/FeedbackType;", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "getPrefix", "getProfile", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_feedback", "$serializer", "Companion", "model-feedback"})
/*    */ public final class FeedbackCompletion extends FeedbackBody {
/*    */   @NotNull
/*    */   private final Language language;
/*    */   @NotNull
/*    */   private final String context;
/*    */   @NotNull
/*    */   private final String prefix;
/*    */   @NotNull
/*    */   private final String profile;
/*    */   @NotNull
/*    */   private final List<String> completions;
/*    */   @NotNull
/*    */   private final FeedbackType feedbackType;
/*    */   @NotNull
/* 43 */   public static final Companion Companion = new Companion(null); @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[5] = FeedbackType.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/feedback/FeedbackCompletion.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/feedback/FeedbackCompletion;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-feedback"}) public static final class $serializer implements GeneratedSerializer<FeedbackCompletion> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])FeedbackCompletion.$childSerializers, arrayOfKSerializer2 = new KSerializer[6]; arrayOfKSerializer2[0] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[4] = arrayOfKSerializer1[4]; arrayOfKSerializer2[5] = arrayOfKSerializer1[5]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public FeedbackCompletion deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Language language = null; String str1 = null, str2 = null, str3 = null; List list = null; FeedbackType feedbackType = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])FeedbackCompletion.$childSerializers; if (compositeDecoder.decodeSequentially()) { language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], list); i |= 0x10; feedbackType = (FeedbackType)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], feedbackType); i |= 0x20; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x1; continue;case 1: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2); i |= 0x4; continue;case 3: str3 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue;case 4: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], list); i |= 0x10; continue;case 5: feedbackType = (FeedbackType)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], feedbackType); i |= 0x20; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new FeedbackCompletion(i, language, str1, str2, str3, list, feedbackType, null); } public void serialize(@NotNull Encoder encoder, @NotNull FeedbackCompletion value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); FeedbackCompletion.write$Self$model_feedback(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.feedback.FeedbackCompletion", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("context", false); pluginGeneratedSerialDescriptor.addElement("prefix", false); pluginGeneratedSerialDescriptor.addElement("profile", false); pluginGeneratedSerialDescriptor.addElement("completions", false); pluginGeneratedSerialDescriptor.addElement("feedbackType", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/feedback/FeedbackCompletion$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/feedback/FeedbackCompletion;", "model-feedback"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<FeedbackCompletion> serializer() { return (KSerializer<FeedbackCompletion>)FeedbackCompletion.$serializer.INSTANCE; }
/*    */      }
/*    */   @NotNull
/* 46 */   public final Language getLanguage() { return this.language; } @NotNull
/* 47 */   public final String getContext() { return this.context; } @NotNull
/* 48 */   public final String getPrefix() { return this.prefix; } @NotNull
/* 49 */   public final String getProfile() { return this.profile; } @NotNull
/* 50 */   public final List<String> getCompletions() { return this.completions; }
/* 51 */   public FeedbackCompletion(@NotNull Language language, @NotNull String context, @NotNull String prefix, @NotNull String profile, @NotNull List<String> completions) { super(null); this.language = language; this.context = context; this.prefix = prefix; this.profile = profile; this.completions = completions;
/* 52 */     this.feedbackType = FeedbackType.COMPLETION; } @NotNull public FeedbackType getFeedbackType() { return this.feedbackType; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Language component1() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.profile;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component5() {
/*    */     return this.completions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FeedbackCompletion copy(@NotNull Language language, @NotNull String context, @NotNull String prefix, @NotNull String profile, @NotNull List<String> completions) {
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */     Intrinsics.checkNotNullParameter(profile, "profile");
/*    */     Intrinsics.checkNotNullParameter(completions, "completions");
/*    */     return new FeedbackCompletion(language, context, prefix, profile, completions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FeedbackCompletion(language=" + this.language + ", context=" + this.context + ", prefix=" + this.prefix + ", profile=" + this.profile + ", completions=" + this.completions + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.language.hashCode();
/*    */     result = result * 31 + this.context.hashCode();
/*    */     result = result * 31 + this.prefix.hashCode();
/*    */     result = result * 31 + this.profile.hashCode();
/*    */     return result * 31 + this.completions.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof FeedbackCompletion))
/*    */       return false; 
/*    */     FeedbackCompletion feedbackCompletion = (FeedbackCompletion)other;
/*    */     return (this.language != feedbackCompletion.language) ? false : (!Intrinsics.areEqual(this.context, feedbackCompletion.context) ? false : (!Intrinsics.areEqual(this.prefix, feedbackCompletion.prefix) ? false : (!Intrinsics.areEqual(this.profile, feedbackCompletion.profile) ? false : (!!Intrinsics.areEqual(this.completions, feedbackCompletion.completions)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-feedback-jvm-0.4.32.jar!\ai\grazie\feedback\FeedbackCompletion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */