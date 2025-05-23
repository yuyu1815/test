/*    */ package com.intellij.ml.llm.matterhorn;
/*    */ 
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlinx.coroutines.Job;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0005\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\0020\001J\026\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006J(\020\007\032\0020\0032\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\006\020\f\032\0020\013H@¢\006\002\020\rJ\036\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\013H@¢\006\002\020\023J\036\020\024\032\0020\0172\006\020\025\032\0020\0212\006\020\022\032\0020\013H@¢\006\002\020\023¨\006\026"}, d2 = {"com/intellij/ml/llm/matterhorn/HumanInLoop$Companion$DENY_ALL$1", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "shouldAllowAction", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "action", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "(Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldAllowEdit", "path", "Ljava/nio/file/Path;", "before", "", "after", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCurrentAction", "", "currentAction", "Lkotlinx/coroutines/Job;", "command", "(Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCurrentAction", "job", "core"})
/*    */ public final class HumanInLoop$Companion$DENY_ALL$1
/*    */   implements HumanInLoop
/*    */ {
/*    */   public Object shouldAllowAction(HumanInLoopAction action, Continuation $completion) {
/* 38 */     return HumanInLoopResponse.Disagree.INSTANCE;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public Object shouldAllowEdit(Path path, String before, String after, Continuation $completion) {
/* 46 */     return HumanInLoopResponse.Disagree.INSTANCE;
/*    */   }
/*    */ 
/*    */   
/*    */   public Object addCurrentAction(Job currentAction, String command, Continuation $completion) {
/* 51 */     return Unit.INSTANCE;
/*    */   }
/*    */   
/*    */   public Object removeCurrentAction(Job job, String command, Continuation $completion) {
/* 55 */     return Unit.INSTANCE;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\HumanInLoop$Companion$DENY_ALL$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */