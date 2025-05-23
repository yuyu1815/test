/*    */ package com.intellij.ml.llm.matterhorn.ej.goland;
/*    */ import com.intellij.ml.llm.matterhorn.ArtifactRequest;
/*    */ import com.intellij.ml.llm.matterhorn.RootExecutionContext;
/*    */ import com.intellij.openapi.project.DumbKt;
/*    */ import com.intellij.openapi.project.Project;
/*    */ import java.util.List;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020 \n\000\n\002\030\002\n\002\b\002\n\002\020\002\n\002\b\002\b\026\030\0002\0020\001B\007¢\006\004\b\002\020\003J<\020\004\032\n\022\002\b\003\022\002\b\0030\0052\006\020\006\032\0020\0072\006\020\b\032\0020\0072\f\020\t\032\b\022\004\022\0020\0070\n2\006\020\013\032\0020\fH@¢\006\002\020\rJ\020\020\016\032\0020\0172\006\020\020\032\0020\007H\002¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/goland/GoLandAgentMatterhornStarter;", "Lcom/intellij/ml/llm/matterhorn/ej/core/EvaluationMatterhornStarterBase;", "<init>", "()V", "buildArtifactRequest", "Lcom/intellij/ml/llm/matterhorn/ArtifactRequest;", "name", "", "task", "args", "", "context", "Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/RootExecutionContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "log", "", "message", "ej-goland"})
/*    */ public class GoLandAgentMatterhornStarter extends EvaluationMatterhornStarterBase {
/*    */   public GoLandAgentMatterhornStarter() {
/* 17 */     super(GoLandAgentArtifactTypes.INSTANCE.getSWEPatchArtifactType());
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public Object buildArtifactRequest(@NotNull String name, @NotNull String task, @NotNull List<String> args, @NotNull RootExecutionContext context, @NotNull Continuation<? super ArtifactRequest<?, ?>> $completion) {
/*    */     return buildArtifactRequest$suspendImpl(this, name, task, args, context, $completion);
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GoLandAgentMatterhornStarter.kt", l = {37, 52, 57, 62}, i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4"}, n = {"$this", "name", "task", "args", "context", "project", "i", "$this", "name", "task", "args", "context", "project", "i", "$this", "name", "task", "args", "context"}, m = "buildArtifactRequest$suspendImpl", c = "com.intellij.ml.llm.matterhorn.ej.goland.GoLandAgentMatterhornStarter")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*    */   static final class GoLandAgentMatterhornStarter$buildArtifactRequest$1 extends ContinuationImpl {
/*    */     Object L$0;
/*    */     Object L$1;
/*    */     Object L$2;
/*    */     Object L$3;
/*    */     Object L$4;
/*    */     Object L$5;
/*    */     int I$0;
/*    */     int label;
/*    */     
/*    */     GoLandAgentMatterhornStarter$buildArtifactRequest$1(Continuation $completion) {
/*    */       super($completion);
/*    */     }
/*    */     
/*    */     @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       this.result = $result;
/*    */       this.label |= Integer.MIN_VALUE;
/*    */       return GoLandAgentMatterhornStarter.buildArtifactRequest$suspendImpl(GoLandAgentMatterhornStarter.this, null, null, null, null, (Continuation<? super ArtifactRequest<?, ?>>)this);
/*    */     }
/*    */   }
/*    */   
/*    */   @DebugMetadata(f = "GoLandAgentMatterhornStarter.kt", l = {58}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.goland.GoLandAgentMatterhornStarter$buildArtifactRequest$2")
/*    */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*    */   static final class GoLandAgentMatterhornStarter$buildArtifactRequest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*    */     
/*    */     GoLandAgentMatterhornStarter$buildArtifactRequest$2(Project $project, Continuation $completion) {
/*    */       super(2, $completion);
/*    */     }
/*    */     
/* 57 */     public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 58 */           this.label = 1; if (DumbKt.waitForSmartMode(this.$project, (Continuation)this) == object) return object;  DumbKt.waitForSmartMode(this.$project, (Continuation)this);
/* 59 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*    */       
/*    */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Object value, Continuation<? super GoLandAgentMatterhornStarter$buildArtifactRequest$2> $completion) {
/*    */       return (Continuation<Unit>)new GoLandAgentMatterhornStarter$buildArtifactRequest$2(this.$project, $completion);
/*    */     } public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*    */       return ((GoLandAgentMatterhornStarter$buildArtifactRequest$2)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */     } } private final void log(String message) {
/* 66 */     System.out.println("[Matterhorn] GoLandAgentMatterhornStarter: " + message);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\goland\GoLandAgentMatterhornStarter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */