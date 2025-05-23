/*    */ package ai.grazie.gen.chatTasks.codeAiAssistant;
/*    */ import ai.grazie.model.task.library.v2.chat.TasksChat;
/*    */ import ai.grazie.model.task.library.v2.chat.TasksChat$;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerialName;
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
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+BC\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\n\b\001\020\006\032\004\030\0010\007\022\020\b\001\020\b\032\n\022\004\022\0020\n\030\0010\t\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB#\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\002\020\016J\t\020\031\032\0020\005HÆ\003J\t\020\032\032\0020\007HÆ\003J\017\020\033\032\b\022\004\022\0020\n0\tHÆ\003J-\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\tHÆ\001J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001HÖ\003J\t\020 \032\0020\003HÖ\001J\t\020!\032\0020\nHÖ\001J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\"\020\b\032\b\022\004\022\0020\n0\t8\006X\004¢\006\016\n\000\022\004\b\017\020\020\032\004\b\021\020\022R\034\020\006\032\0020\0078\006X\004¢\006\016\n\000\022\004\b\023\020\020\032\004\b\024\020\025R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\026\020\020\032\004\b\027\020\030¨\006,"}, d2 = {"Lai/grazie/gen/chatTasks/codeAiAssistant/CodeAiAssistantTaskParams;", "", "seen1", "", "product", "Lai/grazie/gen/chatTasks/codeAiAssistant/CodeAIAssistantProduct;", "history", "Lai/grazie/model/task/library/v2/chat/TasksChat;", "functions", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gen/chatTasks/codeAiAssistant/CodeAIAssistantProduct;Lai/grazie/model/task/library/v2/chat/TasksChat;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gen/chatTasks/codeAiAssistant/CodeAIAssistantProduct;Lai/grazie/model/task/library/v2/chat/TasksChat;Ljava/util/List;)V", "getFunctions$annotations", "()V", "getFunctions", "()Ljava/util/List;", "getHistory$annotations", "getHistory", "()Lai/grazie/model/task/library/v2/chat/TasksChat;", "getProduct$annotations", "getProduct", "()Lai/grazie/gen/chatTasks/codeAiAssistant/CodeAIAssistantProduct;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class CodeAiAssistantTaskParams {
/*    */   @NotNull
/* 31 */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final CodeAIAssistantProduct product; @NotNull
/*    */   private final TasksChat history;
/*    */   
/* 36 */   public CodeAiAssistantTaskParams(@NotNull CodeAIAssistantProduct product, @NotNull TasksChat history, @NotNull List<String> functions) { this.product = product;
/*    */ 
/*    */     
/* 39 */     this.history = history;
/*    */ 
/*    */ 
/*    */     
/* 43 */     this.functions = functions; } @NotNull private final List<String> functions; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull
/* 44 */   public final List<String> getFunctions() { return this.functions; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/chatTasks/codeAiAssistant/CodeAiAssistantTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/chatTasks/codeAiAssistant/CodeAiAssistantTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<CodeAiAssistantTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])CodeAiAssistantTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*    */       arrayOfKSerializer2[0] = (KSerializer)CodeAIAssistantProduct.$serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)TasksChat$.serializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public CodeAiAssistantTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       CodeAIAssistantProduct codeAIAssistantProduct = null;
/*    */       TasksChat tasksChat = null;
/*    */       List list = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])CodeAiAssistantTaskParams.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         codeAIAssistantProduct = (CodeAIAssistantProduct)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)CodeAIAssistantProduct.$serializer.INSTANCE, codeAIAssistantProduct);
/*    */         i |= 0x1;
/*    */         tasksChat = (TasksChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TasksChat$.serializer.INSTANCE, tasksChat);
/*    */         i |= 0x2;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               codeAIAssistantProduct = (CodeAIAssistantProduct)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)CodeAIAssistantProduct.$serializer.INSTANCE, codeAIAssistantProduct);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               tasksChat = (TasksChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)TasksChat$.serializer.INSTANCE, tasksChat);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], list);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new CodeAiAssistantTaskParams(i, codeAIAssistantProduct, tasksChat, list, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull CodeAiAssistantTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       CodeAiAssistantTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.chatTasks.codeAiAssistant.CodeAiAssistantTaskParams", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("product", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("history", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("functions", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/chatTasks/codeAiAssistant/CodeAiAssistantTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/chatTasks/codeAiAssistant/CodeAiAssistantTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<CodeAiAssistantTaskParams> serializer() {
/*    */       return (KSerializer<CodeAiAssistantTaskParams>)CodeAiAssistantTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CodeAIAssistantProduct getProduct() {
/*    */     return this.product;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TasksChat getHistory() {
/*    */     return this.history;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CodeAIAssistantProduct component1() {
/*    */     return this.product;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TasksChat component2() {
/*    */     return this.history;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component3() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CodeAiAssistantTaskParams copy(@NotNull CodeAIAssistantProduct product, @NotNull TasksChat history, @NotNull List<String> functions) {
/*    */     Intrinsics.checkNotNullParameter(product, "product");
/*    */     Intrinsics.checkNotNullParameter(history, "history");
/*    */     Intrinsics.checkNotNullParameter(functions, "functions");
/*    */     return new CodeAiAssistantTaskParams(product, history, functions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "CodeAiAssistantTaskParams(product=" + this.product + ", history=" + this.history + ", functions=" + this.functions + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.product.hashCode();
/*    */     result = result * 31 + this.history.hashCode();
/*    */     return result * 31 + this.functions.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof CodeAiAssistantTaskParams))
/*    */       return false; 
/*    */     CodeAiAssistantTaskParams codeAiAssistantTaskParams = (CodeAiAssistantTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.product, codeAiAssistantTaskParams.product) ? false : (!Intrinsics.areEqual(this.history, codeAiAssistantTaskParams.history) ? false : (!!Intrinsics.areEqual(this.functions, codeAiAssistantTaskParams.functions)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\chatTasks\codeAiAssistant\CodeAiAssistantTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */