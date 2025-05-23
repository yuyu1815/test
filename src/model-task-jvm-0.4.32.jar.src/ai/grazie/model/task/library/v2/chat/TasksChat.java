/*     */ package ai.grazie.model.task.library.v2.chat;
/*     */ 
/*     */ import ai.grazie.model.task.TaskCallData;
/*     */ import ai.grazie.model.task.id.TaskName;
/*     */ import ai.grazie.model.task.id.TaskTag;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\t\n\002\020\013\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\004\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 (2\0020\001:\003&'(B)\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\016\b\002\020\004\032\b\022\004\022\0020\0060\005¢\006\002\020\nJ\024\020\016\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\fJ\036\020\017\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\005HÆ\001¢\006\002\020\020J\023\020\021\032\0020\0222\b\020\023\032\004\030\0010\001H\002J\b\020\024\032\0020\003H\026J)\020\025\032\0020\0002!\020\026\032\035\022\023\022\0210\006¢\006\f\b\030\022\b\b\031\022\004\b\b(\032\022\004\022\0020\0060\027J\021\020\033\032\0020\0002\006\020\023\032\0020\000H\002J\021\020\033\032\0020\0002\006\020\032\032\0020\006H\002J\t\020\034\032\0020\035HÖ\001J&\020\036\032\0020\0372\006\020 \032\0020\0002\006\020!\032\0020\"2\006\020#\032\0020$HÁ\001¢\006\002\b%R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\r\032\004\b\013\020\f¨\006)"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChat;", "", "seen1", "", "messages", "", "Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/model/task/library/v2/chat/TasksChatMessage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/model/task/library/v2/chat/TasksChatMessage;)V", "getMessages", "()[Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "[Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "component1", "copy", "([Lai/grazie/model/task/library/v2/chat/TasksChatMessage;)Lai/grazie/model/task/library/v2/chat/TasksChat;", "equals", "", "other", "hashCode", "map", "body", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "message", "plus", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_task", "$serializer", "Builder", "Companion", "model-task"})
/*     */ @SourceDebugExtension({"SMAP\nTasksChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksChat.kt\nai/grazie/model/task/library/v2/chat/TasksChat\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,96:1\n11158#2:97\n11493#2,3:98\n37#3:101\n36#3,3:102\n*S KotlinDebug\n*F\n+ 1 TasksChat.kt\nai/grazie/model/task/library/v2/chat/TasksChat\n*L\n23#1:97\n23#1:98,3\n23#1:101\n23#1:102,3\n*E\n"})
/*     */ public final class TasksChat {
/*  21 */   public TasksChat(@NotNull TasksChatMessage[] messages) { this.messages = messages; } @NotNull public final TasksChatMessage[] getMessages() { return this.messages; } @NotNull
/*     */   public final TasksChat map(@NotNull Function1 body) {
/*  23 */     Intrinsics.checkNotNullParameter(body, "body"); TasksChatMessage[] arrayOfTasksChatMessage1 = this.messages; int $i$f$map = 0;
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
/*  97 */     TasksChatMessage[] arrayOfTasksChatMessage2 = arrayOfTasksChatMessage1; Collection<Object> destination$iv$iv = new ArrayList(arrayOfTasksChatMessage1.length); int $i$f$mapTo = 0; byte b; int i;
/*  98 */     for (b = 0, i = arrayOfTasksChatMessage2.length; b < i; ) { Object item$iv$iv = arrayOfTasksChatMessage2[b];
/*  99 */       destination$iv$iv.add(body.invoke(item$iv$iv)); b++; }
/* 100 */      List list = (List)destination$iv$iv;
/*     */     int $i$f$toTypedArray = 0;
/* 102 */     Collection thisCollection$iv = list;
/*     */     
/* 104 */     TasksChatMessage[] arrayOfTasksChatMessage3 = (TasksChatMessage[])thisCollection$iv.toArray((Object[])new TasksChatMessage[0]);
/*     */     return new TasksChat(arrayOfTasksChatMessage3);
/*     */   }
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/task/library/v2/chat/TasksChat.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/task/library/v2/chat/TasksChat;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-task"})
/*     */   public static final class $serializer implements GeneratedSerializer<TasksChat> {
/*     */     @NotNull
/*     */     public static final $serializer INSTANCE = new $serializer();
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] typeParametersSerializers() {
/*     */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SerialDescriptor getDescriptor() {
/*     */       return (SerialDescriptor)descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] childSerializers() {
/*     */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])TasksChat.$childSerializers, arrayOfKSerializer2 = new KSerializer[1];
/*     */       arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */       return (KSerializer<?>[])arrayOfKSerializer2;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public TasksChat deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       TasksChatMessage[] arrayOfTasksChatMessage = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       KSerializer[] arrayOfKSerializer = (KSerializer[])TasksChat.$childSerializers;
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         arrayOfTasksChatMessage = (TasksChatMessage[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfTasksChatMessage);
/*     */         i |= 0x1;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               arrayOfTasksChatMessage = (TasksChatMessage[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfTasksChatMessage);
/*     */               i |= 0x1;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new TasksChat(i, arrayOfTasksChatMessage, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull TasksChat value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       TasksChat.write$Self$model_task(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.task.library.v2.chat.TasksChat", INSTANCE, 1);
/*     */       pluginGeneratedSerialDescriptor.addElement("messages", true);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TasksChat plus(@NotNull TasksChat other) {
/*     */     Intrinsics.checkNotNullParameter(other, "other");
/*     */     return new TasksChat((TasksChatMessage[])ArraysKt.plus((Object[])this.messages, (Object[])other.messages));
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TasksChat plus(@NotNull TasksChatMessage message) {
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     return new TasksChat((TasksChatMessage[])ArraysKt.plus((Object[])this.messages, message));
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null || getClass() != other.getClass())
/*     */       return false; 
/*     */     (TasksChat)other;
/*     */     return Arrays.equals((Object[])this.messages, (Object[])((TasksChat)other).messages);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return Arrays.hashCode((Object[])this.messages);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\030\002\n\002\b\b\n\002\020 \n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\005¢\006\002\020\002J\016\020\006\032\0020\0002\006\020\007\032\0020\bJ\006\020\t\032\0020\nJ\026\020\013\032\0020\0002\006\020\f\032\0020\b2\006\020\r\032\0020\bJ\026\020\016\032\0020\0002\006\020\f\032\0020\b2\006\020\017\032\0020\bJ\016\020\020\032\0020\0002\006\020\020\032\0020\005J\016\020\003\032\0020\0002\006\020\021\032\0020\nJ\026\020\003\032\0020\0002\f\020\022\032\b\022\004\022\0020\0050\023H\007J\032\020\024\032\0020\0002\006\020\025\032\0020\0262\b\b\002\020\027\032\0020\030H\007J\020\020\024\032\0020\0002\006\020\024\032\0020\031H\007J\030\020\024\032\0020\0002\006\020\032\032\0020\0332\006\020\034\032\0020\035H\007J\"\020\024\032\0020\0002\006\020\036\032\0020\0372\006\020\034\032\0020 2\b\b\002\020\027\032\0020\030H\007J\016\020!\032\0020\0002\006\020\007\032\0020\bR\024\020\003\032\b\022\004\022\0020\0050\004X\004¢\006\002\n\000¨\006\""}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChat$Builder;", "", "()V", "messages", "", "Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "assistant", "text", "", "build", "Lai/grazie/model/task/library/v2/chat/TasksChat;", "functionCall", "name", "content", "functionResponse", "result", "message", "chat", "messagesList", "", "task", "data", "Lai/grazie/model/task/TaskCallData;", "taskTag", "Lai/grazie/model/task/id/TaskTag;", "Lai/grazie/model/task/exec/TaskCall;", "id", "Lai/grazie/model/task/id/TaskID;", "parameters", "Lai/grazie/model/task/exec/TaskParameters;", "taskName", "Lai/grazie/model/task/id/TaskName;", "Lai/grazie/utils/data/DataHolder;", "user", "model-task"})
/*     */   @SourceDebugExtension({"SMAP\nTasksChat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksChat.kt\nai/grazie/model/task/library/v2/chat/TasksChat$Builder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,96:1\n37#2:97\n36#2,3:98\n*S KotlinDebug\n*F\n+ 1 TasksChat.kt\nai/grazie/model/task/library/v2/chat/TasksChat$Builder\n*L\n87#1:97\n87#1:98,3\n*E\n"})
/*     */   public static final class Builder {
/*     */     @NotNull
/*     */     private final List<TasksChatMessage> messages;
/*     */     
/*     */     public Builder() {
/*     */       this.messages = new ArrayList<>();
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder user(@NotNull String text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return message(new TasksChatUserMessage(text));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder assistant(@NotNull String text) {
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return message(new TasksChatAssistantMessage(text));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder functionCall(@NotNull String name, @NotNull String content) {
/*     */       Intrinsics.checkNotNullParameter(name, "name");
/*     */       Intrinsics.checkNotNullParameter(content, "content");
/*     */       return message(new TasksChatFunctionCallMessage(name, content));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder functionResponse(@NotNull String name, @NotNull String result) {
/*     */       Intrinsics.checkNotNullParameter(name, "name");
/*     */       Intrinsics.checkNotNullParameter(result, "result");
/*     */       return message(new TasksChatFunctionResponseMessage(name, result));
/*     */     }
/*     */     
/*     */     @Deprecated(message = "JBAI-8430 in favour of `taskV2`")
/*     */     @NotNull
/*     */     public final Builder task(@NotNull TaskID id, @NotNull TaskParameters parameters) {
/*     */       Intrinsics.checkNotNullParameter(id, "id");
/*     */       Intrinsics.checkNotNullParameter(parameters, "parameters");
/*     */       return message(new TasksChatTaskCallMessage(TaskParametersKt.toDataHolder(parameters), id.getName(), id.getTag()));
/*     */     }
/*     */     
/*     */     @Deprecated(message = "JBAI-8430 in favour of `taskCallData`")
/*     */     @NotNull
/*     */     public final Builder task(@NotNull TaskCall task) {
/*     */       Intrinsics.checkNotNullParameter(task, "task");
/*     */       return message(new TasksChatTaskCallMessage(TaskParametersKt.toDataHolder(task.getParameters()), task.getId().getName(), task.getId().getTag()));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder task(@NotNull TaskName taskName, @NotNull DataHolder parameters, @NotNull TaskTag taskTag) {
/*     */       Intrinsics.checkNotNullParameter(taskName, "taskName");
/*     */       Intrinsics.checkNotNullParameter(parameters, "parameters");
/*     */       Intrinsics.checkNotNullParameter(taskTag, "taskTag");
/*     */       return message(new TasksChatTaskCallMessage(parameters, taskName, taskTag));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder task(@NotNull TaskCallData data, @NotNull TaskTag taskTag) {
/*     */       Intrinsics.checkNotNullParameter(data, "data");
/*     */       Intrinsics.checkNotNullParameter(taskTag, "taskTag");
/*     */       return message(new TasksChatTaskCallMessage(data.getParameters(), data.getTaskName(), taskTag));
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder message(@NotNull TasksChatMessage message) {
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       this.messages.add(message);
/*     */       return this;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder messages(@NotNull TasksChat chat) {
/*     */       Intrinsics.checkNotNullParameter(chat, "chat");
/*     */       CollectionsKt.addAll(this.messages, (Object[])chat.getMessages());
/*     */       return this;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Builder messages(@NotNull List<? extends TasksChatMessage> messagesList) {
/*     */       Intrinsics.checkNotNullParameter(messagesList, "messagesList");
/*     */       this.messages.addAll(messagesList);
/*     */       return this;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TasksChat build() {
/*     */       Collection<TasksChatMessage> $this$toTypedArray$iv = this.messages;
/*     */       int $i$f$toTypedArray = 0;
/*     */       Collection<TasksChatMessage> thisCollection$iv = $this$toTypedArray$iv;
/*     */       return new TasksChat(thisCollection$iv.<TasksChatMessage>toArray(new TasksChatMessage[0]));
/*     */     }
/*     */   }
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final TasksChatMessage[] messages;
/*     */   @JvmField
/*     */   @NotNull
/*     */   private static final KSerializer<Object>[] $childSerializers;
/*     */   
/*     */   static {
/*     */     KSerializer[] arrayOfKSerializer = new KSerializer[1];
/*     */     arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(TasksChatMessage.class), TasksChatMessage.Companion.serializer());
/*     */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TasksChatMessage[] component1() {
/*     */     return this.messages;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final TasksChat copy(@NotNull TasksChatMessage[] messages) {
/*     */     Intrinsics.checkNotNullParameter(messages, "messages");
/*     */     return new TasksChat(messages);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "TasksChat(messages=" + Arrays.toString((Object[])this.messages) + ")";
/*     */   }
/*     */   
/*     */   public TasksChat() {
/*     */     this((TasksChatMessage[])null, 1, (DefaultConstructorMarker)null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\tJ\017\020\n\032\b\022\004\022\0020\0040\013HÆ\001¨\006\f"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChat$Companion;", "", "()V", "build", "Lai/grazie/model/task/library/v2/chat/TasksChat;", "body", "Lkotlin/Function1;", "Lai/grazie/model/task/library/v2/chat/TasksChat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-task"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<TasksChat> serializer() {
/*     */       return (KSerializer<TasksChat>)TasksChat.$serializer.INSTANCE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TasksChat build(@NotNull Function1 body) {
/*     */       Intrinsics.checkNotNullParameter(body, "body");
/*     */       TasksChat.Builder builder = new TasksChat.Builder();
/*     */       body.invoke(builder);
/*     */       return builder.build();
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */