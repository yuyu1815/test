/*    */ package ai.grazie.gen.tasks.code.complete.llm.fast;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\023\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 -2\0020\001:\002,-BO\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\005\022\n\b\001\020\007\032\004\030\0010\005\022\020\b\001\020\b\032\n\022\004\022\0020\n\030\0010\t\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB-\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\016\b\002\020\b\032\b\022\004\022\0020\n0\t¢\006\002\020\016J\t\020\032\032\0020\005HÆ\003J\t\020\033\032\0020\005HÆ\003J\t\020\034\032\0020\005HÆ\003J\017\020\035\032\b\022\004\022\0020\n0\tHÆ\003J7\020\036\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\0052\016\b\002\020\b\032\b\022\004\022\0020\n0\tHÆ\001J\023\020\037\032\0020 2\b\020!\032\004\030\0010\001HÖ\003J\t\020\"\032\0020\003HÖ\001J\t\020#\032\0020\005HÖ\001J&\020$\032\0020%2\006\020&\032\0020\0002\006\020'\032\0020(2\006\020)\032\0020*HÁ\001¢\006\002\b+R\"\020\b\032\b\022\004\022\0020\n0\t8\006X\004¢\006\016\n\000\022\004\b\017\020\020\032\004\b\021\020\022R\034\020\007\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\023\020\020\032\004\b\024\020\025R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\026\020\020\032\004\b\027\020\025R\034\020\006\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\030\020\020\032\004\b\031\020\025¨\006."}, d2 = {"Lai/grazie/gen/tasks/code/complete/llm/fast/CodeCompleteFastTaskParams;", "", "seen1", "", "prefix", "", "suffix", "filepath", "context", "", "Lai/grazie/gen/tasks/code/complete/llm/fast/ContextItem;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getContext$annotations", "()V", "getContext", "()Ljava/util/List;", "getFilepath$annotations", "getFilepath", "()Ljava/lang/String;", "getPrefix$annotations", "getPrefix", "getSuffix$annotations", "getSuffix", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_completion_model", "$serializer", "Companion", "tasks-provider-llm-completion-model"})
/*    */ public final class CodeCompleteFastTaskParams {
/*    */   @NotNull
/* 32 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String prefix;
/*    */   @NotNull
/*    */   private final String suffix;
/*    */   
/* 38 */   public CodeCompleteFastTaskParams(@NotNull String prefix, @NotNull String suffix, @NotNull String filepath, @NotNull List<ContextItem> context) { this.prefix = prefix;
/*    */ 
/*    */ 
/*    */     
/* 42 */     this.suffix = suffix;
/*    */ 
/*    */ 
/*    */     
/* 46 */     this.filepath = filepath;
/*    */ 
/*    */     
/* 49 */     this.context = context; } @NotNull private final String filepath; @NotNull private final List<ContextItem> context; @JvmField @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers; @NotNull
/* 51 */   public final List<ContextItem> getContext() { return this.context; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/*    */     arrayOfKSerializer[3] = (KSerializer)new ArrayListSerializer((KSerializer)ContextItem.$serializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/code/complete/llm/fast/CodeCompleteFastTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/code/complete/llm/fast/CodeCompleteFastTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-completion-model"})
/*    */   public static final class $serializer implements GeneratedSerializer<CodeCompleteFastTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])CodeCompleteFastTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[3] = arrayOfKSerializer1[3];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public CodeCompleteFastTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null, str3 = null;
/*    */       List list = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])CodeCompleteFastTaskParams.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list);
/*    */         i |= 0x8;
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
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], list);
/*    */               i |= 0x8;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new CodeCompleteFastTaskParams(i, str1, str2, str3, list, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull CodeCompleteFastTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       CodeCompleteFastTaskParams.write$Self$tasks_provider_llm_completion_model(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.code.complete.llm.fast.CodeCompleteFastTaskParams", INSTANCE, 4);
/*    */       pluginGeneratedSerialDescriptor.addElement("prefix", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("suffix", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("filepath", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("context", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/complete/llm/fast/CodeCompleteFastTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/complete/llm/fast/CodeCompleteFastTaskParams;", "tasks-provider-llm-completion-model"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<CodeCompleteFastTaskParams> serializer() {
/*    */       return (KSerializer<CodeCompleteFastTaskParams>)CodeCompleteFastTaskParams.$serializer.INSTANCE;
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
/*    */   public final List<ContextItem> component4() {
/*    */     return this.context;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CodeCompleteFastTaskParams copy(@NotNull String prefix, @NotNull String suffix, @NotNull String filepath, @NotNull List<ContextItem> context) {
/*    */     Intrinsics.checkNotNullParameter(prefix, "prefix");
/*    */     Intrinsics.checkNotNullParameter(suffix, "suffix");
/*    */     Intrinsics.checkNotNullParameter(filepath, "filepath");
/*    */     Intrinsics.checkNotNullParameter(context, "context");
/*    */     return new CodeCompleteFastTaskParams(prefix, suffix, filepath, context);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CodeCompleteFastTaskParams(prefix=" + this.prefix + ", suffix=" + this.suffix + ", filepath=" + this.filepath + ", context=" + this.context + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.prefix.hashCode();
/*    */     result = result * 31 + this.suffix.hashCode();
/*    */     result = result * 31 + this.filepath.hashCode();
/*    */     return result * 31 + this.context.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CodeCompleteFastTaskParams))
/*    */       return false; 
/*    */     CodeCompleteFastTaskParams codeCompleteFastTaskParams = (CodeCompleteFastTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.prefix, codeCompleteFastTaskParams.prefix) ? false : (!Intrinsics.areEqual(this.suffix, codeCompleteFastTaskParams.suffix) ? false : (!Intrinsics.areEqual(this.filepath, codeCompleteFastTaskParams.filepath) ? false : (!!Intrinsics.areEqual(this.context, codeCompleteFastTaskParams.context))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-completion-model-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\complete\llm\fast\CodeCompleteFastTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */