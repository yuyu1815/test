/*    */ package ai.grazie.model.task.exec;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.reflect.KCallable;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\n\020\002\032\006\022\002\b\0030\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lkotlin/reflect/KCallable;", "invoke"})
/*    */ final class TaskParametersAttributesKt$fqdn$1
/*    */   extends Lambda
/*    */   implements Function1<KCallable<?>, CharSequence>
/*    */ {
/*    */   public static final TaskParametersAttributesKt$fqdn$1 INSTANCE = new TaskParametersAttributesKt$fqdn$1();
/*    */   
/*    */   TaskParametersAttributesKt$fqdn$1() {
/*    */     super(1);
/*    */   }
/*    */   
/*    */   public final CharSequence invoke(KCallable it) {
/* 45 */     Intrinsics.checkNotNullParameter(it, "it"); return it.getName();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\exec\TaskParametersAttributesKt$fqdn$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */