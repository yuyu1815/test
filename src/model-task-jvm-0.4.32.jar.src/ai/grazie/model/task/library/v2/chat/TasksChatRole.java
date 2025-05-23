/*    */ package ai.grazie.model.task.library.v2.chat;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.internal.EnumsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\020\n\000\n\002\020\016\n\002\b\013\b\001\030\000 \r2\b\022\004\022\0020\0000\001:\001\rB\017\b\002\022\006\020\002\032\0020\003¢\006\002\020\004R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006j\002\b\007j\002\b\bj\002\b\tj\002\b\nj\002\b\013j\002\b\f¨\006\016"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatRole;", "", "role", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getRole", "()Ljava/lang/String;", "User", "Assistant", "FunctionCall", "FunctionResponse", "Task", "TaskCall", "Companion", "model-task"})
/*    */ public enum TasksChatRole {
/* 18 */   User("user"),
/* 19 */   Assistant("assistant"),
/* 20 */   FunctionCall("functionCall"),
/* 21 */   FunctionResponse("functionResponse"),
/* 22 */   Task("task"),
/* 23 */   TaskCall("taskCall"); static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Companion Companion;
/*    */   @NotNull
/*    */   private final String role;
/*    */   @NotNull
/*    */   private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;
/*    */   
/*    */   TasksChatRole(String role) {
/*    */     this.role = role;
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/*    */     
/*    */     null() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final KSerializer<Object> invoke() {
/*    */       return EnumsKt.createSimpleEnumSerializer("ai.grazie.model.task.library.v2.chat.TasksChatRole", (Enum[])TasksChatRole.values());
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/v2/chat/TasksChatRole$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/v2/chat/TasksChatRole;", "model-task"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TasksChatRole> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getRole() {
/*    */     return this.role;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\v2\chat\TasksChatRole.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */