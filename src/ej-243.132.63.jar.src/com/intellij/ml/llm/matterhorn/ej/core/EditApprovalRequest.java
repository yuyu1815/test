/*    */ package com.intellij.ml.llm.matterhorn.ej.core;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.HumanInLoopResponse;
/*    */ import java.nio.file.Path;
/*    */ import kotlin.Unit;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function2;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\b\013\030\0002\0020\001BT\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\005\0221\020\007\032-\b\001\022\023\022\0210\t¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\n\022\b\022\004\022\0020\0160\r\022\006\022\004\030\0010\0170\b¢\006\004\b\020\020\021R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\022\020\023R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\025R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\026\020\025R>\020\007\032-\b\001\022\023\022\0210\t¢\006\f\b\n\022\b\b\013\022\004\b\b(\f\022\n\022\b\022\004\022\0020\0160\r\022\006\022\004\030\0010\0170\b¢\006\n\n\002\020\031\032\004\b\027\020\030¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/EditApprovalRequest;", "Lcom/intellij/ml/llm/matterhorn/ej/core/HumanInLoopRequest;", "path", "Ljava/nio/file/Path;", "before", "", "after", "reaction", "Lkotlin/Function2;", "Lcom/intellij/ml/llm/matterhorn/HumanInLoopResponse;", "Lkotlin/ParameterName;", "name", "response", "Lkotlin/coroutines/Continuation;", "", "", "<init>", "(Ljava/nio/file/Path;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "getPath", "()Ljava/nio/file/Path;", "getBefore", "()Ljava/lang/String;", "getAfter", "getReaction", "()Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function2;", "ej-core"})
/*    */ public final class EditApprovalRequest extends HumanInLoopRequest {
/*    */   @NotNull
/*    */   private final Path path;
/*    */   @Nullable
/*    */   private final String before;
/*    */   
/*    */   @NotNull
/* 19 */   public final Path getPath() { return this.path; } @NotNull private final String after; @NotNull private final Function2<HumanInLoopResponse, Continuation<? super Unit>, Object> reaction; @Nullable
/* 20 */   public final String getBefore() { return this.before; } @NotNull
/* 21 */   public final String getAfter() { return this.after; } @NotNull
/* 22 */   public final Function2<HumanInLoopResponse, Continuation<? super Unit>, Object> getReaction() { return this.reaction; } public EditApprovalRequest(@NotNull Path path, @Nullable String before, @NotNull String after, @NotNull Function2<HumanInLoopResponse, Continuation<? super Unit>, Object> reaction) {
/* 23 */     super(null);
/*    */     this.path = path;
/*    */     this.before = before;
/*    */     this.after = after;
/*    */     this.reaction = reaction;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\EditApprovalRequest.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */