/*    */ package ai.grazie.gen.tasks.code.complete.slow;
/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.EncodeDefault;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\026\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 12\0020\001:\00201B[\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\n\b\001\020\007\032\004\030\0010\005\022\n\b\001\020\b\032\004\030\0010\005\022\020\b\001\020\t\032\n\022\004\022\0020\013\030\0010\n\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B5\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\005\022\016\b\002\020\t\032\b\022\004\022\0020\0130\n¢\006\002\020\017J\t\020\035\032\0020\005HÆ\003J\t\020\036\032\0020\005HÆ\003J\t\020\037\032\0020\005HÆ\003J\t\020 \032\0020\005HÆ\003J\017\020!\032\b\022\004\022\0020\0130\nHÆ\003JA\020\"\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\b\b\002\020\b\032\0020\0052\016\b\002\020\t\032\b\022\004\022\0020\0130\nHÆ\001J\023\020#\032\0020$2\b\020%\032\004\030\0010\001HÖ\003J\t\020&\032\0020\003HÖ\001J\t\020'\032\0020\005HÖ\001J&\020(\032\0020)2\006\020*\032\0020\0002\006\020+\032\0020,2\006\020-\032\0020.HÁ\001¢\006\002\b/R\"\020\t\032\b\022\004\022\0020\0130\n8\006X\004¢\006\016\n\000\022\004\b\020\020\021\032\004\b\022\020\023R\034\020\007\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\024\020\021\032\004\b\025\020\026R\034\020\b\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\027\020\021\032\004\b\030\020\026R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\031\020\021\032\004\b\032\020\026R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\033\020\021\032\004\b\034\020\026¨\0062"}, d2 = {"Lai/grazie/gen/tasks/code/complete/slow/CodeCompleteSlowTaskParams;", "", "seen1", "", "prefix", "", "suffix", "filepath", "language", "context", "", "Lai/grazie/gen/tasks/code/complete/slow/ContextItem;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContext$annotations", "()V", "getContext", "()Ljava/util/List;", "getFilepath$annotations", "getFilepath", "()Ljava/lang/String;", "getLanguage$annotations", "getLanguage", "getPrefix$annotations", "getPrefix", "getSuffix$annotations", "getSuffix", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class CodeCompleteSlowTaskParams {
/*    */   @NotNull
/* 33 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String prefix; @NotNull
/*    */   private final String suffix; @NotNull
/*    */   private final String filepath;
/* 38 */   public CodeCompleteSlowTaskParams(@NotNull String prefix, @NotNull String suffix, @NotNull String filepath, @NotNull String language, @NotNull List<ContextItem> context) { this.prefix = prefix;
/*    */ 
/*    */     
/* 41 */     this.suffix = suffix;
/*    */ 
/*    */     
/* 44 */     this.filepath = filepath;
/*    */ 
/*    */     
/* 47 */     this.language = language;
/*    */ 
/*    */     
/* 50 */     this.context = context; } @NotNull private final String language; @NotNull private final List<ContextItem> context; @JvmField @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; @NotNull
/* 52 */   public final List<ContextItem> getContext() { return this.context; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/*    */     arrayOfKSerializer[3] = null;
/*    */     arrayOfKSerializer[4] = (KSerializer)new ArrayListSerializer((KSerializer)ContextItem.$serializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/code/complete/slow/CodeCompleteSlowTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/code/complete/slow/CodeCompleteSlowTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<CodeCompleteSlowTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])CodeCompleteSlowTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[5];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[4] = arrayOfKSerializer1[4];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public CodeCompleteSlowTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null, str3 = null, str4 = null;
/*    */       List list = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])CodeCompleteSlowTaskParams.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         str4 = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], list);
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
/*    */               str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               str4 = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], list);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new CodeCompleteSlowTaskParams(i, str1, str2, str3, str4, list, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull CodeCompleteSlowTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       CodeCompleteSlowTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.code.complete.slow.CodeCompleteSlowTaskParams", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("prefix", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("suffix", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("filepath", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("language", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("context", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/complete/slow/CodeCompleteSlowTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/complete/slow/CodeCompleteSlowTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<CodeCompleteSlowTaskParams> serializer() {
/*    */       return (KSerializer<CodeCompleteSlowTaskParams>)CodeCompleteSlowTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getPrefix() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getSuffix() {
/*    */     return this.suffix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getFilepath() {
/*    */     return this.filepath;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getLanguage() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.prefix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.suffix;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.filepath;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ContextItem> component5() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CodeCompleteSlowTaskParams copy(@NotNull String prefix, @NotNull String suffix, @NotNull String filepath, @NotNull String language, @NotNull List<ContextItem> context) {
/*    */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */     Intrinsics.checkNotNullParameter(suffix, "suffix");
/*    */     Intrinsics.checkNotNullParameter(filepath, "filepath");
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     return new CodeCompleteSlowTaskParams(prefix, suffix, filepath, language, context);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CodeCompleteSlowTaskParams(prefix=" + this.prefix + ", suffix=" + this.suffix + ", filepath=" + this.filepath + ", language=" + this.language + ", context=" + this.context + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.prefix.hashCode();
/*    */     result = result * 31 + this.suffix.hashCode();
/*    */     result = result * 31 + this.filepath.hashCode();
/*    */     result = result * 31 + this.language.hashCode();
/*    */     return result * 31 + this.context.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CodeCompleteSlowTaskParams))
/*    */       return false; 
/*    */     CodeCompleteSlowTaskParams codeCompleteSlowTaskParams = (CodeCompleteSlowTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.prefix, codeCompleteSlowTaskParams.prefix) ? false : (!Intrinsics.areEqual(this.suffix, codeCompleteSlowTaskParams.suffix) ? false : (!Intrinsics.areEqual(this.filepath, codeCompleteSlowTaskParams.filepath) ? false : (!Intrinsics.areEqual(this.language, codeCompleteSlowTaskParams.language) ? false : (!!Intrinsics.areEqual(this.context, codeCompleteSlowTaskParams.context)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\complete\slow\CodeCompleteSlowTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */