/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ 
/*    */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*    */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.coroutines.Continuation;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J<\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\034\020\n\032\030\b\001\022\n\022\b\022\004\022\0020\0050\f\022\006\022\004\030\0010\r0\013H@¢\006\002\020\016¨\006\017"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/EmptyAICache;", "Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;", "<init>", "()V", "lookupOrBuild", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "builder", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core-llm"})
/*    */ public final class EmptyAICache
/*    */   implements AICache
/*    */ {
/*    */   @Nullable
/*    */   public Object lookupOrBuild(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Function1 builder, @NotNull Continuation $completion) {
/* 58 */     return builder.invoke($completion);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\EmptyAICache.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */