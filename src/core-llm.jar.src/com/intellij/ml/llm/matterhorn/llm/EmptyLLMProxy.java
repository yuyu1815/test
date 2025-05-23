/*     */ package com.intellij.ml.llm.matterhorn.llm;
/*     */ 
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.Boxing;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.functions.Function4;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000B\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\000\n\002\b\002\030\0002\0020\001B\007¢\006\004\b\002\020\003J2\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\t2\022\020\n\032\016\022\004\022\0020\f\022\004\022\0020\r0\013H@¢\006\002\020\016J2\020\017\032\0020\0052\"\020\020\032\036\b\001\022\004\022\0020\022\022\n\022\b\022\004\022\0020\0050\023\022\006\022\004\030\0010\0240\021H@¢\006\002\020\025¨\006\026"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/llm/EmptyLLMProxy;", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "<init>", "()V", "sendChat", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "eventHandler", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendWithRecovery", "send", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core"})
/*     */ public final class EmptyLLMProxy
/*     */   implements LLMProxy
/*     */ {
/*     */   @Nullable
/*     */   public Object sendWithTracking(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Function4<? super MatterhornChat, ? super ModelParameters, ? super MatterhornPropertyProvider, ? super Continuation<? super AIAnswer>, ? extends Object> request, @NotNull Function1<? super CustomArtifactEvent, Unit> eventHandler, @NotNull Continuation<? super AIAnswer> $completion) {
/* 108 */     return LLMProxy.DefaultImpls.sendWithTracking(this, chat, modelParameters, propertyProvider, request, eventHandler, $completion); } public boolean getImagesSupported() { return LLMProxy.DefaultImpls.getImagesSupported(this); } @Nullable
/*     */   public Object sendChat(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Function1 eventHandler, @NotNull Continuation $completion) {
/* 110 */     return new AIAnswer(modelParameters.getModel(), null, 0L, 0L, 0L, 0L, 0L, false, 254, null);
/*     */   }
/*     */   @Nullable
/*     */   public Object sendWithRecovery(@NotNull Function2 send, @NotNull Continuation $completion) {
/* 114 */     return send.invoke(Boxing.boxInt(0), $completion);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\llm\EmptyLLMProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */