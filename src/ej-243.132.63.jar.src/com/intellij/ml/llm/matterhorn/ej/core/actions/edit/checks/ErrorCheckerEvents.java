/*    */ package com.intellij.ml.llm.matterhorn.ej.core.actions.edit.checks;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*    */ import com.intellij.ml.llm.matterhorn.ExecutionContext;
/*    */ import com.intellij.ml.llm.matterhorn.events.SerializableThrowable;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\002\b\005\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J5\020\004\032\002H\005\"\004\b\000\020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\f\020\n\032\b\022\004\022\002H\0050\013H\bø\001\000¢\006\002\020\f\002\007\n\005\b20\001¨\006\r"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/checks/ErrorCheckerEvents;", "", "<init>", "()V", "withTracking", "T", "nameForLogging", "", "contextForLogging", "Lcom/intellij/ml/llm/matterhorn/ExecutionContext;", "action", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/ExecutionContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "ej-core"})
/*    */ public final class ErrorCheckerEvents
/*    */ {
/*    */   @NotNull
/*    */   public static final ErrorCheckerEvents INSTANCE = new ErrorCheckerEvents();
/*    */   
/*    */   public final <T> T withTracking(@NotNull String nameForLogging, @NotNull ExecutionContext contextForLogging, @NotNull Function0 action) {
/* 34 */     Intrinsics.checkNotNullParameter(nameForLogging, "nameForLogging"); Intrinsics.checkNotNullParameter(contextForLogging, "contextForLogging"); Intrinsics.checkNotNullParameter(action, "action"); int $i$f$withTracking = 0; contextForLogging.sendEvent((CustomArtifactEvent)new ErrorCheckerStarted(nameForLogging));
/*    */     try {
/* 36 */       Object result = action.invoke();
/* 37 */       contextForLogging.sendEvent((CustomArtifactEvent)new ErrorCheckerFinished(nameForLogging, null, 2, null));
/* 38 */       return (T)result;
/* 39 */     } catch (Exception e) {
/* 40 */       contextForLogging.sendEvent((CustomArtifactEvent)new ErrorCheckerFinished(nameForLogging, new SerializableThrowable(e, true)));
/* 41 */       throw e;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\checks\ErrorCheckerEvents.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */