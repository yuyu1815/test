/*    */ package com.intellij.ml.llm.matterhorn.ej.core.tests;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.ej.core.aiignore.AiIgnoreUtilKt;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ResultKt;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*    */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*    */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.functions.Function2;
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
/*    */ @DebugMetadata(f = "RealAgentActionExtension.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.ej.core.tests.RealAgentActionExtension$buildContext$rootContext$3")
/*    */ @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\013\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H\n"}, d2 = {"<anonymous>", "", "it", "Ljava/nio/file/Path;"})
/*    */ final class RealAgentActionExtension$buildContext$rootContext$3
/*    */   extends SuspendLambda
/*    */   implements Function2<Path, Continuation<? super Boolean>, Object>
/*    */ {
/*    */   int label;
/*    */   
/*    */   RealAgentActionExtension$buildContext$rootContext$3(Continuation $completion) {
/*    */     super(2, $completion);
/*    */   }
/*    */   
/*    */   public final Object invokeSuspend(Object $result) {
/*    */     Path it;
/*    */     Function1 checker;
/* 43 */     IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); it = (Path)this.L$0;
/*    */         
/* 45 */         checker = AiIgnoreUtilKt.obtainAIIgnoreChecker(RealAgentActionExtension.this.getProject());
/* 46 */         return checker.invoke(it); }
/*    */     
/*    */     throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*    */   }
/*    */   
/*    */   public final Continuation<Unit> create(Object value, Continuation<? super RealAgentActionExtension$buildContext$rootContext$3> $completion) {
/*    */     RealAgentActionExtension$buildContext$rootContext$3 realAgentActionExtension$buildContext$rootContext$3 = new RealAgentActionExtension$buildContext$rootContext$3($completion);
/*    */     realAgentActionExtension$buildContext$rootContext$3.L$0 = value;
/*    */     return (Continuation<Unit>)realAgentActionExtension$buildContext$rootContext$3;
/*    */   }
/*    */   
/*    */   public final Object invoke(Path p1, Continuation<?> p2) {
/*    */     return ((RealAgentActionExtension$buildContext$rootContext$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\tests\RealAgentActionExtension$buildContext$rootContext$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */