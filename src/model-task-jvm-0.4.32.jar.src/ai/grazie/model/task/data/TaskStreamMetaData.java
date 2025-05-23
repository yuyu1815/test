/*    */ package ai.grazie.model.task.data;
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
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0232\0020\001:\001\023B#\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007¢\006\002\020\bB\007\b\004¢\006\002\020\tJ!\020\f\032\0020\r2\006\020\016\032\0020\0002\006\020\017\032\0020\0202\006\020\021\032\0020\022HÇ\001R\024\020\004\032\0020\005XD¢\006\b\n\000\032\004\b\n\020\013\001\002\024\025¨\006\026"}, d2 = {"Lai/grazie/model/task/data/TaskStreamMetaData;", "Lai/grazie/model/task/data/TaskStreamData;", "seen1", "", "content", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getContent", "()Ljava/lang/String;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "Lai/grazie/model/task/data/TaskStreamExecutionMetadata;", "Lai/grazie/model/task/data/TaskStreamQuotaMetaData;", "model-task"})
/*    */ public abstract class TaskStreamMetaData
/*    */   extends TaskStreamData
/*    */ {
/*    */   @NotNull
/* 43 */   public static final Companion Companion = new Companion(null); @NotNull private final String content; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(TaskStreamExecutionMetadata.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TaskStreamQuotaMetaData.class); KSerializer[] arrayOfKSerializer = new KSerializer[2]; arrayOfKSerializer[0] = (KSerializer)TaskStreamExecutionMetadata.$serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)TaskStreamQuotaMetaData.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.model.task.data.TaskStreamMetaData", Reflection.getOrCreateKotlinClass(TaskStreamMetaData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } null() { super(0); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/data/TaskStreamMetaData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/data/TaskStreamMetaData;", "model-task"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<TaskStreamMetaData> serializer() { return get$cachedSerializer(); }
/*    */      }
/* 45 */   private TaskStreamMetaData() { super(null);
/*    */     
/* 47 */     this.content = ""; } @NotNull public String getContent() { return this.content; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\data\TaskStreamMetaData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */