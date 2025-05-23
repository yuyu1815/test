/*    */ package ai.grazie.gen.tasks.text.complete.oneLine.trfNlc;
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
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 $2\0020\001:\003#$%B1\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\023\032\0020\005HÆ\003J\t\020\024\032\0020\007HÆ\003J\035\020\025\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\005HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\034\020\006\032\0020\0078\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\022¨\006&"}, d2 = {"Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams;", "", "seen1", "", "context", "", "profile", "Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile;)V", "getContext$annotations", "()V", "getContext", "()Ljava/lang/String;", "getProfile$annotations", "getProfile", "()Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_proxy_model", "$serializer", "Companion", "Profile", "tasks-provider-proxy-model"})
/*    */ public final class TextOneLineCompleteTaskParams {
/*    */   @NotNull
/*    */   private final String context;
/*    */   @NotNull
/*    */   private final Profile profile;
/*    */   @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/*    */   @NotNull
/* 29 */   public static final Companion Companion = new Companion(null);
/*    */   static { KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = Profile.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; }
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-proxy-model"}) public static final class $serializer implements GeneratedSerializer<TextOneLineCompleteTaskParams> {
/*    */     @NotNull public static final $serializer INSTANCE = new $serializer();
/*    */     @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); }
/*    */     @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; }
/* 35 */     @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])TextOneLineCompleteTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public TextOneLineCompleteTaskParams deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; TextOneLineCompleteTaskParams.Profile profile = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])TextOneLineCompleteTaskParams.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; profile = (TextOneLineCompleteTaskParams.Profile)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], profile); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: profile = (TextOneLineCompleteTaskParams.Profile)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], profile); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new TextOneLineCompleteTaskParams(i, str, profile, null); } public void serialize(@NotNull Encoder encoder, @NotNull TextOneLineCompleteTaskParams value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); TextOneLineCompleteTaskParams.write$Self$tasks_provider_proxy_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.text.complete.oneLine.trfNlc.TextOneLineCompleteTaskParams", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("context", false); pluginGeneratedSerialDescriptor.addElement("profile", false); descriptor = pluginGeneratedSerialDescriptor; } } public TextOneLineCompleteTaskParams(@NotNull String context, @NotNull Profile profile) { this.context = context;
/*    */ 
/*    */ 
/*    */     
/* 39 */     this.profile = profile; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams;", "tasks-provider-proxy-model"}) public static final class Companion {
/* 40 */     private Companion() {} @NotNull public final KSerializer<TextOneLineCompleteTaskParams> serializer() { return (KSerializer<TextOneLineCompleteTaskParams>)TextOneLineCompleteTaskParams.$serializer.INSTANCE; } } @NotNull public final String getContext() { return this.context; } @NotNull public final Profile getProfile() { return this.profile; } @NotNull public final String component1() { return this.context; }
/*    */   @NotNull public final Profile component2() { return this.profile; }
/*    */   @NotNull public final TextOneLineCompleteTaskParams copy(@NotNull String context, @NotNull Profile profile) { Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(profile, "profile"); return new TextOneLineCompleteTaskParams(context, profile); }
/*    */   @NotNull public String toString() { return "TextOneLineCompleteTaskParams(context=" + this.context + ", profile=" + this.profile + ")"; }
/*    */   public int hashCode() { result = this.context.hashCode(); return result * 31 + this.profile.hashCode(); }
/*    */   public boolean equals(@Nullable Object other) { if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TextOneLineCompleteTaskParams))
/*    */       return false; 
/*    */     TextOneLineCompleteTaskParams textOneLineCompleteTaskParams = (TextOneLineCompleteTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.context, textOneLineCompleteTaskParams.context) ? false : (!(this.profile != textOneLineCompleteTaskParams.profile)); }
/* 51 */   @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\007\b\001\030\000 \t2\b\022\004\022\0020\0000\001:\001\tB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\b¨\006\n"}, d2 = {"Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Always", "Moderate", "Companion", "tasks-provider-proxy-model"}) public enum Profile { Always("Always"),
/* 52 */     Moderate("Moderate"); @NotNull public static final Companion Companion = new Companion(null);
/*    */     @NotNull
/*    */     private final String value;
/*    */     @NotNull
/*    */     private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*    */     
/*    */     Profile(String value) {
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
/*    */         String[] arrayOfString = new String[2];
/*    */         arrayOfString[0] = "Always";
/*    */         arrayOfString[1] = "Moderate";
/*    */         Annotation[][] arrayOfAnnotation = new Annotation[2][];
/*    */         arrayOfAnnotation[0] = null;
/*    */         arrayOfAnnotation[1] = null;
/*    */         return EnumsKt.createAnnotatedEnumSerializer("ai.grazie.gen.tasks.text.complete.oneLine.trfNlc.TextOneLineCompleteTaskParams.Profile", (Enum[])TextOneLineCompleteTaskParams.Profile.values(), arrayOfString, arrayOfAnnotation, null);
/*    */       }
/*    */     }
/*    */     
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile;", "tasks-provider-proxy-model"})
/*    */     public static final class Companion {
/*    */       private Companion() {}
/*    */       
/*    */       @NotNull
/*    */       public final KSerializer<TextOneLineCompleteTaskParams.Profile> serializer() {
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
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/text/complete/oneLine/trfNlc/TextOneLineCompleteTaskParams$Profile;", "tasks-provider-proxy-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TextOneLineCompleteTaskParams.Profile> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-proxy-model-jvm-0.4.32.jar!\ai\grazie\gen\tasks\text\complete\oneLine\trfNlc\TextOneLineCompleteTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */