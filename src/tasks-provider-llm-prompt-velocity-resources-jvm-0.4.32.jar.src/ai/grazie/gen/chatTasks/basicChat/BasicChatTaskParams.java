/*    */ package ai.grazie.gen.chatTasks.basicChat;
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
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\000\n\002\030\002\n\002\b\r\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B7\b\021\022\006\020\002\032\0020\003\022\n\b\001\020\004\032\004\030\0010\005\022\020\b\001\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\024\032\0020\005HÆ\003J\017\020\025\032\b\022\004\022\0020\b0\007HÆ\003J#\020\026\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001HÖ\003J\t\020\032\032\0020\003HÖ\001J\t\020\033\032\0020\bHÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\"\020\006\032\b\022\004\022\0020\b0\0078\006X\004¢\006\016\n\000\022\004\b\r\020\016\032\004\b\017\020\020R\034\020\004\032\0020\0058\006X\004¢\006\016\n\000\022\004\b\021\020\016\032\004\b\022\020\023¨\006&"}, d2 = {"Lai/grazie/gen/chatTasks/basicChat/BasicChatTaskParams;", "", "seen1", "", "history", "Lai/grazie/model/task/library/v2/chat/TasksChat;", "functions", "", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/task/library/v2/chat/TasksChat;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/task/library/v2/chat/TasksChat;Ljava/util/List;)V", "getFunctions$annotations", "()V", "getFunctions", "()Ljava/util/List;", "getHistory$annotations", "getHistory", "()Lai/grazie/model/task/library/v2/chat/TasksChat;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$tasks_provider_llm_prompt_velocity_resources", "$serializer", "Companion", "tasks-provider-llm-prompt-velocity-resources"})
/*    */ public final class BasicChatTaskParams {
/*    */   @NotNull
/* 29 */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final TasksChat history; @NotNull
/*    */   private final List<String> functions; @JvmField
/*    */   @NotNull
/*    */   private static final KSerializer<Object>[] $childSerializers;
/* 34 */   public BasicChatTaskParams(@NotNull TasksChat history, @NotNull List<String> functions) { this.history = history;
/*    */ 
/*    */ 
/*    */     
/* 38 */     this.functions = functions; } @NotNull
/* 39 */   public final List<String> getFunctions() { return this.functions; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = (KSerializer)new ArrayListSerializer((KSerializer)StringSerializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gen/chatTasks/basicChat/BasicChatTaskParams.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gen/chatTasks/basicChat/BasicChatTaskParams;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class $serializer implements GeneratedSerializer<BasicChatTaskParams> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])BasicChatTaskParams.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*    */       arrayOfKSerializer2[0] = (KSerializer)TasksChat$.serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public BasicChatTaskParams deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       TasksChat tasksChat = null;
/*    */       List list = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])BasicChatTaskParams.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         tasksChat = (TasksChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TasksChat$.serializer.INSTANCE, tasksChat);
/*    */         i |= 0x1;
/*    */         list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               tasksChat = (TasksChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TasksChat$.serializer.INSTANCE, tasksChat);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new BasicChatTaskParams(i, tasksChat, list, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull BasicChatTaskParams value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       BasicChatTaskParams.write$Self$tasks_provider_llm_prompt_velocity_resources(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gen.chatTasks.basicChat.BasicChatTaskParams", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("history", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("functions", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gen/chatTasks/basicChat/BasicChatTaskParams$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gen/chatTasks/basicChat/BasicChatTaskParams;", "tasks-provider-llm-prompt-velocity-resources"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<BasicChatTaskParams> serializer() {
/*    */       return (KSerializer<BasicChatTaskParams>)BasicChatTaskParams.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TasksChat getHistory() {
/*    */     return this.history;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TasksChat component1() {
/*    */     return this.history;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<String> component2() {
/*    */     return this.functions;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final BasicChatTaskParams copy(@NotNull TasksChat history, @NotNull List<String> functions) {
/*    */     Intrinsics.checkNotNullParameter(history, "history");
/*    */     Intrinsics.checkNotNullParameter(functions, "functions");
/*    */     return new BasicChatTaskParams(history, functions);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "BasicChatTaskParams(history=" + this.history + ", functions=" + this.functions + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.history.hashCode();
/*    */     return result * 31 + this.functions.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof BasicChatTaskParams))
/*    */       return false; 
/*    */     BasicChatTaskParams basicChatTaskParams = (BasicChatTaskParams)other;
/*    */     return !Intrinsics.areEqual(this.history, basicChatTaskParams.history) ? false : (!!Intrinsics.areEqual(this.functions, basicChatTaskParams.functions));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-llm-prompt-velocity-resources-jvm-0.4.32.jar!\ai\grazie\gen\chatTasks\basicChat\BasicChatTaskParams.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */