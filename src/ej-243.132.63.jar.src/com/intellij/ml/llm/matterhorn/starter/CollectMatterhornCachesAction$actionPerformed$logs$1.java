/*    */ package com.intellij.ml.llm.matterhorn.starter;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequestExecutorService;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import kotlinx.coroutines.CoroutineScope;
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
/*    */ @DebugMetadata(f = "MatterhornLogsProcessor.kt", l = {67}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.starter.CollectMatterhornCachesAction$actionPerformed$logs$1")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "Ljava/nio/file/Path;", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */ final class CollectMatterhornCachesAction$actionPerformed$logs$1
/*    */   extends SuspendLambda
/*    */   implements Function2<CoroutineScope, Continuation<? super Path>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   CollectMatterhornCachesAction$actionPerformed$logs$1(Project $project, ArtifactRequestExecutorService $service, Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/* 66 */     Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 67 */         this.label = 1; if (CollectMatterhornCachesAction.Companion.packMatterhornLogs(this.$project, this.$service.getCaches(), (Continuation<? super Path>)this) == object) return object;  return CollectMatterhornCachesAction.Companion.packMatterhornLogs(this.$project, this.$service.getCaches(), (Continuation<? super Path>)this);
/*    */       case 1:
/*    */         ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*    */         return SYNTHETIC_LOCAL_VARIABLE_1; }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super CollectMatterhornCachesAction$actionPerformed$logs$1> $completion) {
/*    */     return (Continuation<Unit>)new CollectMatterhornCachesAction$actionPerformed$logs$1(this.$project, this.$service, $completion);
/*    */   }
/*    */   
/*    */   public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */     return ((CollectMatterhornCachesAction$actionPerformed$logs$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\starter\CollectMatterhornCachesAction$actionPerformed$logs$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */