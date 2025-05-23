/*    */ package ai.grazie.gen.tasks.code.fleet.rewrite;
/*    */ 
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
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\002\b\025\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 .2\0020\001:\002-.BU\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\n\b\001\020\007\032\004\030\0010\005\022\n\b\001\020\b\032\004\030\0010\005\022\n\b\001\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB5\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\n\b\002\020\b\032\004\030\0010\005\022\n\b\002\020\t\032\004\030\0010\005¢\006\002\020\rJ\t\020\032\032\0020\005HÆ\003J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\005HÆ\003J\013\020\035\032\004\030\0010\005HÆ\003J\013\020\036\032\004\030\0010\005HÆ\003J?\020\037\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\n\b\002\020\b\032\004\030\0010\0052\n\b\002\020\t\032\004\030\0010\005HÆ\001J\023\020 \032\0020!2\b\020\"\032\004\030\0010\001HÖ\003J\t\020#\032\0020\003HÖ\001J\t\020$\032\0020\005HÖ\001J&\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+HÁ\001¢\006\002\b,R\034\020\007\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\016\020\017\032\004\b\020\020\021R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\022\020\017\032\004\b\023\020\021R\036\020\b\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\024\020\017\032\004\b\025\020\021R\036\020\t\032\004\030\0010\0058\006X\004¢\006\016\n\000\022\004\b\026\020\017\032\004\b\027\020\021R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\030\020\017\032\004\b\031\020\021¨\006/"}, d2 = {"Lai/grazie/gen/tasks/code/fleet/rewrite/CodeRewriteFleetTaskParams;", "", "seen1", "", "prompt", "", "context", "codeToRewrite", "filename", "language", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCodeToRewrite$annotations", "()V", "getCodeToRewrite", "()Ljava/lang/String;", "getContext$annotations", "getContext", "getFilename$annotations", "getFilename", "getLanguage$annotations", "getLanguage", "getPrompt$annotations", "getPrompt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class CodeRewriteFleetTaskParams {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String prompt;
/*    */   @NotNull
/*    */   private final String context;
/*    */   
/* 37 */   public CodeRewriteFleetTaskParams(@NotNull String prompt, @NotNull String context, @NotNull String codeToRewrite, @Nullable String filename, @Nullable String language) { this.prompt = prompt;
/*    */ 
/*    */     
/* 40 */     this.context = context;
/*    */ 
/*    */     
/* 43 */     this.codeToRewrite = codeToRewrite;
/*    */ 
/*    */     
/* 46 */     this.filename = filename;
/*    */ 
/*    */ 
/*    */     
/* 50 */     this.language = language; } @NotNull private final String codeToRewrite; @Nullable private final String filename; @Nullable
/*    */   private final String language; @Nullable
/* 52 */   public final String getLanguage() { return this.language; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/code/fleet/rewrite/CodeRewriteFleetTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/code/fleet/rewrite/CodeRewriteFleetTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<CodeRewriteFleetTaskParams> {
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
/*    */       arrayOfKSerializer[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public CodeRewriteFleetTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null, str3 = null, str4 = null, str5 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */         i |= 0x8;
/*    */         str5 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str5);
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
/*    */               str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               str5 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str5);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new CodeRewriteFleetTaskParams(i, str1, str2, str3, str4, str5, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull CodeRewriteFleetTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       CodeRewriteFleetTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.code.fleet.rewrite.CodeRewriteFleetTaskParams", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("prompt", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("context", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("codeToRewrite", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("filename", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("language", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/fleet/rewrite/CodeRewriteFleetTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/fleet/rewrite/CodeRewriteFleetTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<CodeRewriteFleetTaskParams> serializer() {
/*    */       return (KSerializer<CodeRewriteFleetTaskParams>)CodeRewriteFleetTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getPrompt() {
/*    */     return this.prompt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getContext() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getCodeToRewrite() {
/*    */     return this.codeToRewrite;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getFilename() {
/*    */     return this.filename;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.prompt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component3() {
/*    */     return this.codeToRewrite;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.filename;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CodeRewriteFleetTaskParams copy(@NotNull String prompt, @NotNull String context, @NotNull String codeToRewrite, @Nullable String filename, @Nullable String language) {
/*    */     Intrinsics.checkNotNullParameter(prompt, "prompt");
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     Intrinsics.checkNotNullParameter(codeToRewrite, "codeToRewrite");
/*    */     return new CodeRewriteFleetTaskParams(prompt, context, codeToRewrite, filename, language);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CodeRewriteFleetTaskParams(prompt=" + this.prompt + ", context=" + this.context + ", codeToRewrite=" + this.codeToRewrite + ", filename=" + this.filename + ", language=" + this.language + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.prompt.hashCode();
/*    */     result = result * 31 + this.context.hashCode();
/*    */     result = result * 31 + this.codeToRewrite.hashCode();
/*    */     result = result * 31 + ((this.filename == null) ? 0 : this.filename.hashCode());
/*    */     return result * 31 + ((this.language == null) ? 0 : this.language.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CodeRewriteFleetTaskParams))
/*    */       return false; 
/*    */     CodeRewriteFleetTaskParams codeRewriteFleetTaskParams = (CodeRewriteFleetTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.prompt, codeRewriteFleetTaskParams.prompt) ? false : (!Intrinsics.areEqual(this.context, codeRewriteFleetTaskParams.context) ? false : (!Intrinsics.areEqual(this.codeToRewrite, codeRewriteFleetTaskParams.codeToRewrite) ? false : (!Intrinsics.areEqual(this.filename, codeRewriteFleetTaskParams.filename) ? false : (!!Intrinsics.areEqual(this.language, codeRewriteFleetTaskParams.language)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\fleet\rewrite\CodeRewriteFleetTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */