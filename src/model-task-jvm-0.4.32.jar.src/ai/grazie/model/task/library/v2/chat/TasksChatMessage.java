/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0232\0020\001:\001\023B\031\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\007\b\004¢\006\002\020\007J!\020\f\032\0020\r2\006\020\016\032\0020\0002\006\020\017\032\0020\0202\006\020\021\032\0020\022HÇ\001R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013\001\005\024\025\026\027\030¨\006\031"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "role", "Lai/grazie/model/task/library/v2/chat/TasksChatRole;", "getRole", "()Lai/grazie/model/task/library/v2/chat/TasksChatRole;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lai/grazie/model/task/library/v2/chat/TasksChatFunctionCallMessage;", "Lai/grazie/model/task/library/v2/chat/TasksChatFunctionResponseMessage;", "Lai/grazie/model/task/library/v2/chat/TasksChatTaskCallMessage;", "Lai/grazie/model/task/library/v2/chat/TasksChatTaskMessage;", "Lai/grazie/model/task/library/v2/chat/TasksChatTextMessage;", "model-task"})
/*    */ public abstract class TasksChatMessage
/*    */ {
/*    */   @NotNull
/* 30 */   public static final Companion Companion = new Companion(null); private TasksChatMessage() {} @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); @NotNull public abstract TasksChatRole getRole(); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[6]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(TasksChatFunctionCallMessage.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TasksChatFunctionResponseMessage.class); arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(TasksChatTaskCallMessage.class); arrayOfKClass[3] = Reflection.getOrCreateKotlinClass(TasksChatTaskMessage.class); arrayOfKClass[4] = Reflection.getOrCreateKotlinClass(TasksChatAssistantMessage.class); arrayOfKClass[5] = Reflection.getOrCreateKotlinClass(TasksChatUserMessage.class); KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)TasksChatFunctionCallMessage.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TasksChatFunctionResponseMessage.$serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)TasksChatTaskCallMessage.$serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)TasksChatTaskMessage.$serializer.INSTANCE; arrayOfKSerializer[4] = (KSerializer)TasksChatAssistantMessage.$serializer.INSTANCE; arrayOfKSerializer[5] = (KSerializer)TasksChatUserMessage.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.model.task.library.v2.chat.TasksChatMessage", Reflection.getOrCreateKotlinClass(TasksChatMessage.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/v2/chat/TasksChatMessage;", "model-task"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TasksChatMessage> serializer() { return get$cachedSerializer(); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */