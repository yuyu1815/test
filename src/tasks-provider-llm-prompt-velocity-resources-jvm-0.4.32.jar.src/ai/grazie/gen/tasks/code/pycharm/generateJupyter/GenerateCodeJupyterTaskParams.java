/*    */ package ai.grazie.gen.tasks.code.pycharm.generateJupyter;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 $2\0020\001:\002#$B1\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\031\022\006\020\004\032\0020\005\022\n\b\002\020\006\032\004\030\0010\007¢\006\002\020\013J\t\020\023\032\0020\005HÆ\003J\013\020\024\032\004\030\0010\007HÆ\003J\037\020\025\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\007HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\007HÖ\001J&\020\033\032\0020\0342\006\020\035\032\0020\0002\006\020\036\032\0020\0372\006\020 \032\0020!HÁ\001¢\006\002\b\"R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\f\020\r\032\004\b\016\020\017R\036\020\006\032\004\030\0010\0078\006X\004¢\006\016\n\000\022\004\b\020\020\r\032\004\b\021\020\022¨\006%"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/GenerateCodeJupyterTaskParams;", "", "seen1", "", "infoForLLM", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM;", "userPrompt", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM;Ljava/lang/String;)V", "getInfoForLLM$annotations", "()V", "getInfoForLLM", "()Lai/grazie/gen/tasks/code/pycharm/generateJupyter/JupyterNotebookInfoForLLM;", "getUserPrompt$annotations", "getUserPrompt", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class GenerateCodeJupyterTaskParams {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   
/* 35 */   public GenerateCodeJupyterTaskParams(@NotNull JupyterNotebookInfoForLLM infoForLLM, @Nullable String userPrompt) { this.infoForLLM = infoForLLM;
/*    */ 
/*    */     
/* 38 */     this.userPrompt = userPrompt; } @NotNull private final JupyterNotebookInfoForLLM infoForLLM; @Nullable private final String userPrompt; @Nullable
/* 39 */   public final String getUserPrompt() { return this.userPrompt; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/tasks/code/pycharm/generateJupyter/GenerateCodeJupyterTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/GenerateCodeJupyterTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<GenerateCodeJupyterTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)JupyterNotebookInfoForLLM.$serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public GenerateCodeJupyterTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       JupyterNotebookInfoForLLM jupyterNotebookInfoForLLM = null;
/*    */       String str = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         jupyterNotebookInfoForLLM = (JupyterNotebookInfoForLLM)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)JupyterNotebookInfoForLLM.$serializer.INSTANCE, jupyterNotebookInfoForLLM);
/*    */         i |= 0x1;
/*    */         str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               jupyterNotebookInfoForLLM = (JupyterNotebookInfoForLLM)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)JupyterNotebookInfoForLLM.$serializer.INSTANCE, jupyterNotebookInfoForLLM);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new GenerateCodeJupyterTaskParams(i, jupyterNotebookInfoForLLM, str, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull GenerateCodeJupyterTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       GenerateCodeJupyterTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.tasks.code.pycharm.generateJupyter.GenerateCodeJupyterTaskParams", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("infoForLLM", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("userPrompt", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/tasks/code/pycharm/generateJupyter/GenerateCodeJupyterTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/tasks/code/pycharm/generateJupyter/GenerateCodeJupyterTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<GenerateCodeJupyterTaskParams> serializer() {
/*    */       return (KSerializer<GenerateCodeJupyterTaskParams>)GenerateCodeJupyterTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JupyterNotebookInfoForLLM getInfoForLLM() {
/*    */     return this.infoForLLM;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final JupyterNotebookInfoForLLM component1() {
/*    */     return this.infoForLLM;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.userPrompt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final GenerateCodeJupyterTaskParams copy(@NotNull JupyterNotebookInfoForLLM infoForLLM, @Nullable String userPrompt) {
/*    */     Intrinsics.checkNotNullParameter(infoForLLM, "infoForLLM");
/*    */     return new GenerateCodeJupyterTaskParams(infoForLLM, userPrompt);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "GenerateCodeJupyterTaskParams(infoForLLM=" + this.infoForLLM + ", userPrompt=" + this.userPrompt + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.infoForLLM.hashCode();
/*    */     return result * 31 + ((this.userPrompt == null) ? 0 : this.userPrompt.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof GenerateCodeJupyterTaskParams))
/*    */       return false; 
/*    */     GenerateCodeJupyterTaskParams generateCodeJupyterTaskParams = (GenerateCodeJupyterTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.infoForLLM, generateCodeJupyterTaskParams.infoForLLM) ? false : (!!Intrinsics.areEqual(this.userPrompt, generateCodeJupyterTaskParams.userPrompt));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\tasks\code\pycharm\generateJupyter\GenerateCodeJupyterTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */