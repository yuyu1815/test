/*    */ package com.intellij.ml.llm.matterhorn;@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\006\bf\030\000 \0262\0020\001:\001\026J\026\020\002\032\0020\0032\006\020\004\032\0020\005H¦@¢\006\002\020\006J(\020\007\032\0020\0032\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\006\020\f\032\0020\013H¦@¢\006\002\020\rJ\036\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\013H¦@¢\006\002\020\023J\036\020\024\032\0020\0172\006\020\025\032\0020\0212\006\020\022\032\0020\013H¦@¢\006\002\020\023¨\006\027"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "", "shouldAllowAction", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "action", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "(Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldAllowEdit", "path", "Ljava/nio/file/Path;", "before", "", "after", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCurrentAction", "", "currentAction", "Lkotlinx/coroutines/Job;", "command", "(Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCurrentAction", "job", "Companion", "core"})
/*    */ public interface HumanInLoop { @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE; @Nullable
/*    */   Object shouldAllowAction(@NotNull HumanInLoopAction paramHumanInLoopAction, @NotNull Continuation<? super HumanInLoopResponse> paramContinuation);
/*    */   @Nullable
/*    */   Object shouldAllowEdit(@NotNull Path paramPath, @Nullable String paramString1, @NotNull String paramString2, @NotNull Continuation<? super HumanInLoopResponse> paramContinuation);
/*    */   @Nullable
/*    */   Object addCurrentAction(@NotNull Job paramJob, @NotNull String paramString, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   @Nullable
/*    */   Object removeCurrentAction(@NotNull Job paramJob, @NotNull String paramString, @NotNull Continuation<? super Unit> paramContinuation);
/*    */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\006\020\007R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\t\020\007¨\006\n"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/HumanInLoop$Companion;", "", "<init>", "()V", "ALLOW_ALL", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "getALLOW_ALL", "()Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "DENY_ALL", "getDENY_ALL", "core"})
/*    */   public static final class Companion { @NotNull
/* 13 */     private static final HumanInLoop ALLOW_ALL = new HumanInLoop$Companion$ALLOW_ALL$1(); @NotNull public final HumanInLoop getALLOW_ALL() { return ALLOW_ALL; }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0005\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\0020\001J\026\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006J(\020\007\032\0020\0032\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\006\020\f\032\0020\013H@¢\006\002\020\rJ\036\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\013H@¢\006\002\020\023J\036\020\024\032\0020\0172\006\020\025\032\0020\0212\006\020\022\032\0020\013H@¢\006\002\020\023¨\006\026"}, d2 = {"com/intellij/ml/llm/matterhorn/HumanInLoop$Companion$ALLOW_ALL$1", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "shouldAllowAction", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "action", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "(Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldAllowEdit", "path", "Ljava/nio/file/Path;", "before", "", "after", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCurrentAction", "", "currentAction", "Lkotlinx/coroutines/Job;", "command", "(Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCurrentAction", "job", "core"})
/*    */     public static final class HumanInLoop$Companion$ALLOW_ALL$1 implements HumanInLoop { public Object shouldAllowAction(HumanInLoopAction action, Continuation $completion) {
/* 17 */         return HumanInLoopResponse.Agree.INSTANCE;
/*    */       }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       public Object shouldAllowEdit(Path path, String before, String after, Continuation $completion) {
/* 25 */         return HumanInLoopResponse.Agree.INSTANCE;
/*    */       }
/*    */       
/*    */       public Object addCurrentAction(Job currentAction, String command, Continuation $completion) {
/* 29 */         return Unit.INSTANCE;
/*    */       }
/*    */       public Object removeCurrentAction(Job job, String command, Continuation $completion) {
/* 32 */         return Unit.INSTANCE;
/*    */       } } @NotNull
/* 34 */     private static final HumanInLoop DENY_ALL = new HumanInLoop$Companion$DENY_ALL$1(); @NotNull public final HumanInLoop getDENY_ALL() { return DENY_ALL; }
/*    */     
/*    */     @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0005\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\005*\001\000\b\n\030\0002\0020\001J\026\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006J(\020\007\032\0020\0032\006\020\b\032\0020\t2\b\020\n\032\004\030\0010\0132\006\020\f\032\0020\013H@¢\006\002\020\rJ\036\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\013H@¢\006\002\020\023J\036\020\024\032\0020\0172\006\020\025\032\0020\0212\006\020\022\032\0020\013H@¢\006\002\020\023¨\006\026"}, d2 = {"com/intellij/ml/llm/matterhorn/HumanInLoop$Companion$DENY_ALL$1", "Lcom/intellij/ml/llm/matterhorn/HumanInLoop;", "shouldAllowAction", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "action", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "(Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldAllowEdit", "path", "Ljava/nio/file/Path;", "before", "", "after", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addCurrentAction", "", "currentAction", "Lkotlinx/coroutines/Job;", "command", "(Lkotlinx/coroutines/Job;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeCurrentAction", "job", "core"})
/*    */     public static final class HumanInLoop$Companion$DENY_ALL$1 implements HumanInLoop { public Object shouldAllowAction(HumanInLoopAction action, Continuation $completion) {
/* 38 */         return HumanInLoopResponse.Disagree.INSTANCE;
/*    */       }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/*    */       public Object shouldAllowEdit(Path path, String before, String after, Continuation $completion) {
/* 46 */         return HumanInLoopResponse.Disagree.INSTANCE;
/*    */       }
/*    */ 
/*    */       
/*    */       public Object addCurrentAction(Job currentAction, String command, Continuation $completion) {
/* 51 */         return Unit.INSTANCE;
/*    */       }
/*    */       
/*    */       public Object removeCurrentAction(Job job, String command, Continuation $completion) {
/* 55 */         return Unit.INSTANCE;
/*    */       } }
/*    */      }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\HumanInLoop.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */