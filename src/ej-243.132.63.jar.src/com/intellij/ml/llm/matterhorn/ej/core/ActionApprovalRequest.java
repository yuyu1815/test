/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.HumanInLoopAction;
/*    */ import com.intellij.ml.llm.matterhorn.HumanInLoopResponse;
/*    */ import kotlin.Unit;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\b\b\030\0002\0020\001BB\022\006\020\002\032\0020\003\0221\020\004\032-\b\001\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\n\022\b\022\004\022\0020\0130\n\022\006\022\004\030\0010\f0\005¢\006\004\b\r\020\016R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R>\020\004\032-\b\001\022\023\022\0210\006¢\006\f\b\007\022\b\b\b\022\004\b\b(\t\022\n\022\b\022\004\022\0020\0130\n\022\006\022\004\030\0010\f0\005¢\006\n\n\002\020\023\032\004\b\021\020\022¨\006\024"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/ActionApprovalRequest;", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "action", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "reaction", "Lkotlin/Function2;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;Lkotlin/jvm/functions/Function2;)V", "getAction", "()Lcom/intellij/ml/llm/matterhorn/HumanInLoopAction;", "getReaction", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "ej-core"})
/*    */ public final class ActionApprovalRequest extends HumanInLoopRequest {
/*    */   @NotNull
/*    */   private final HumanInLoopAction action;
/*    */   
/*    */   @NotNull
/* 14 */   public final HumanInLoopAction getAction() { return this.action; } @NotNull private final Function2<HumanInLoopResponse, Continuation<? super Unit>, Object> reaction; @NotNull
/* 15 */   public final Function2<HumanInLoopResponse, Continuation<? super Unit>, Object> getReaction() { return this.reaction; } public ActionApprovalRequest(@NotNull HumanInLoopAction action, @NotNull Function2<HumanInLoopResponse, Continuation<? super Unit>, Object> reaction) {
/* 16 */     super(null);
/*    */     this.action = action;
/*    */     this.reaction = reaction;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\ActionApprovalRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */